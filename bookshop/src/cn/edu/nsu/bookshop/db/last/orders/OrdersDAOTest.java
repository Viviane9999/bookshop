/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.orders;

import java.sql.SQLException;

/**
 * @author XuKanglei
 *
 */
public class OrdersDAOTest {
	private static OrdersDAO ordersDAO = new OrdersDAO();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			//getAllTest();
			//getByIdTest();
			//addTest();
			//modifyTest();
			deleteTest();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ordersDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	private static void getAllTest() throws ClassNotFoundException, SQLException {
		System.out.println(ordersDAO.getAll());
		
	}
	private static void getByIdTest() throws ClassNotFoundException, SQLException {
		System.out.println(ordersDAO.getById(1));
		
	}
	private static void addTest() throws ClassNotFoundException, SQLException {
		Orders dataObj = new Orders();
		
		dataObj.setUsers_id(1);
		dataObj.setOrders_time("123456");
		dataObj.setOrders_totalMoney(123.45);
		
		ordersDAO.add(dataObj);
		
	}
	private static void modifyTest() throws ClassNotFoundException, SQLException {
		Orders dataObj = new Orders();
		
		dataObj.setOrders_id(1);
		dataObj.setUsers_id(1);
		dataObj.setOrders_time("987654");
		dataObj.setOrders_totalMoney(123.45);
		
		ordersDAO.modify(dataObj);
		
	}
	private static void deleteTest() throws ClassNotFoundException, SQLException {
		ordersDAO.delete(1);
		
	}

}
