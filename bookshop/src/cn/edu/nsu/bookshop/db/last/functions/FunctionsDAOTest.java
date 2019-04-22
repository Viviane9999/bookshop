/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.functions;

import java.sql.SQLException;

/**
 * @author XuKanglei
 *
 */
public class FunctionsDAOTest {
	private static FunctionsDAO functionsDAO = new FunctionsDAO();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			//getAllTest();
			//getByIdTest();
			addTest();
			//modifyTest();
			//deleteTest();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				functionsDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static void getAllTest() throws ClassNotFoundException, SQLException {
		System.out.println(functionsDAO.getAll());
		
	}

	private static void getByIdTest() throws ClassNotFoundException, SQLException {
		System.out.println(functionsDAO.getById(1));
		
	}

	private static void addTest() throws ClassNotFoundException, SQLException {
		Functions dataObj = new Functions();
		
		dataObj.setFunctions_name("测试功能");
		dataObj.setFunctions_URI("123456");
		dataObj.setFunctions_note("123");
		
		functionsDAO.add(dataObj);
		
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException {
		Functions dataObj = new Functions();
		
		dataObj.setFunctions_id(1);
		dataObj.setFunctions_name("测试功能1");
		dataObj.setFunctions_URI("234567");
		dataObj.setFunctions_note("234");
		
		functionsDAO.modify(dataObj);
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException {
		functionsDAO.delete(1);
	}

}
