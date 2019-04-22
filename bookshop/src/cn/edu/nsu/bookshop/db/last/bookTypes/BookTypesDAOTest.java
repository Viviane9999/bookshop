/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.bookTypes;

import java.sql.SQLException;

/**
 * @author XuKanglei
 *
 */
public class BookTypesDAOTest {
	private static BookTypesDAO bookTypesDAO = new BookTypesDAO();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			//getAllTest();
			//getByIdTest();
			//addTest();
			modifyTest();
			//deleteTest();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bookTypesDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

	private static void getAllTest() throws ClassNotFoundException, SQLException {
		System.out.println(bookTypesDAO.getAll());
		
	}

	private static void getByIdTest() throws ClassNotFoundException, SQLException {
		System.out.println(bookTypesDAO.getById(1));
		
	}

	private static void addTest() throws ClassNotFoundException, SQLException {
		BookTypes dataObj = new BookTypes();
		
		dataObj.setBookTypes_name("测试类型");
		dataObj.setBookTypes_note("123");
		
		bookTypesDAO.add(dataObj);
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException {
		BookTypes dataObj = new BookTypes();
		
		dataObj.setBookTypes_id(1);
		dataObj.setBookTypes_name("测试类型1");
		dataObj.setBookTypes_note("234");
		
		bookTypesDAO.modify(dataObj);
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException {
		bookTypesDAO.delete(1);
		
	}

}
