/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.buys;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.bookshop.db.last.DBMain;

/**
 * @author XuKanglei
 *
 */
public class BuysDAO extends DBMain<Buys>{

	@Override
	public ArrayList<Buys> getAll() throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM buys";
		pst = getPrepareStatement(sql);
		rst = pst.executeQuery();
		ArrayList<Buys> buys = new ArrayList<Buys>();
		while(rst.next()) {
			buys.add(assemble(rst));
		}
		release();
		return buys;
	}

	@Override
	public Buys getById(int id) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM buys WHERE buys_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		rst = pst.executeQuery();
		Buys buys = null;
		while(rst.next()) {
			buys = assemble(rst);
		}
		release();
		return buys;
	}

	@Override
	public void add(Buys dataObj) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO buys(books_id, users_id, buys_num) VALUES (?, ?, ?)";
		pst = getPrepareStatement(sql);
		pst.setInt(1, dataObj.getBooks_id());
		pst.setInt(2, dataObj.getUsers_id());
		pst.setInt(3, dataObj.getBuys_num());
		
		pst.executeUpdate();
		release();
	}

	@Override
	public void modify(Buys newDataObj) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE buys SET books_id = ?, users_id = ?, buys_num = ? WHERE buys_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, newDataObj.getBooks_id());
		pst.setInt(2, newDataObj.getUsers_id());
		pst.setInt(3, newDataObj.getBuys_num());
		pst.setInt(4, newDataObj.getBuys_id());
		
		pst.executeUpdate();
		release();
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		String sql = "DELETE FROM buys WHERE buys_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		pst.executeUpdate();
		release();
	}

	@Override
	public Buys assemble(ResultSet rst) throws SQLException {
		Buys buys = new Buys();
		buys.setBuys_id(rst.getInt("buys_id"));
		buys.setBooks_id(rst.getInt("books_id"));
		buys.setUsers_id(rst.getInt("users_id"));
		buys.setBuys_num(rst.getInt("buys_num"));
		return buys;
	}
	
}
