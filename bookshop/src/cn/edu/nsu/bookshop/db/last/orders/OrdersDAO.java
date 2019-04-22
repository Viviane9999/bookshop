/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.orders;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.bookshop.db.last.DBMain;

/**
 * @author XuKanglei
 *
 */
public class OrdersDAO extends DBMain<Orders>{

	@Override
	public ArrayList<Orders> getAll() throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM orders";
		pst = getPrepareStatement(sql);
		rst = pst.executeQuery();
		ArrayList<Orders> orders = new ArrayList<Orders>();
		while(rst.next()) {
			orders.add(assemble(rst));
		}
		release();
		return orders;
	}

	@Override
	public Orders getById(int id) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM orders WHERE orders_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		rst = pst.executeQuery();
		Orders orders = null;
		while(rst.next()) {
			orders = assemble(rst);
		}
		release();
		return orders;
	}

	@Override
	public void add(Orders dataObj) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO orders(users_id, orders_time, orders_totalMoney)VALUES(?, ?, ?)";
		pst = getPrepareStatement(sql);
		pst.setInt(1, dataObj.getUsers_id());
		pst.setString(2, dataObj.getOrders_time());
		pst.setDouble(3, dataObj.getOrders_totalMoney());
		
		pst.executeUpdate();
		release();
	}

	@Override
	public void modify(Orders newDataObj) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE orders SET users_id = ?, orders_time = ?, orders_totalMoney = ? WHERE orders_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, newDataObj.getUsers_id());
		pst.setString(2, newDataObj.getOrders_time());
		pst.setDouble(3, newDataObj.getOrders_totalMoney());
		pst.setInt(4, newDataObj.getOrders_id());
		
		pst.executeUpdate();
		release();
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		String sql = "DELETE FROM orders WHERE orders_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		pst.executeUpdate();
		release();
	}

	@Override
	public Orders assemble(ResultSet rst) throws SQLException {
		Orders orders = new Orders();
		orders.setOrders_id(rst.getInt("orders_id"));
		orders.setUsers_id(rst.getInt("users_id"));
		orders.setOrders_time(rst.getString("orders_time"));
		orders.setOrders_totalMoney(rst.getDouble("orders_totalMoney"));
		return orders;
	}
	
}
