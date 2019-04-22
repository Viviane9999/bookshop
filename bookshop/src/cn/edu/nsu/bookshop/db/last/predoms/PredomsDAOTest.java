/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.predoms;

import java.sql.SQLException;

/**
 * @author XuKanglei
 *
 */
public class PredomsDAOTest {
	private static PredomsDAO predomsDAO = new PredomsDAO();
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
				predomsDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private static void getAllTest() throws ClassNotFoundException, SQLException {
		System.out.println(predomsDAO.getAll());
		
	}
	private static void getByIdTest() throws ClassNotFoundException, SQLException {
		System.out.println(predomsDAO.getById(1));
		
	}
	private static void addTest() throws ClassNotFoundException, SQLException {
		Predoms dataObj = new Predoms();
		
		dataObj.setFunctions_id(1);
		dataObj.setRoles_id(1);
		
		predomsDAO.add(dataObj);
	}
	private static void modifyTest() throws ClassNotFoundException, SQLException {
		Predoms dataObj = new Predoms();
		
		dataObj.setPredoms_id(1);
		dataObj.setFunctions_id(1);
		dataObj.setRoles_id(2);
		
		predomsDAO.modify(dataObj);
	}
	private static void deleteTest() throws ClassNotFoundException, SQLException {
		predomsDAO.delete(1);
		
	}

}
