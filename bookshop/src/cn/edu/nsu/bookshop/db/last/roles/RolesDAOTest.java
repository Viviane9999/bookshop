/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.roles;

import java.sql.SQLException;

import org.apache.catalina.User;

import cn.edu.nsu.bookshop.db.last.users.UsersDAO;

/**
 * @author XuKanglei
 *
 */
public class RolesDAOTest {

	private static RolesDAO rolesDAO = new RolesDAO();
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
				rolesDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	private static void getAllTest() throws ClassNotFoundException, SQLException {
		System.out.println(rolesDAO.getAll());
		
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException {
		System.out.println(rolesDAO.getById(1));
		
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException {
		Roles dataObj = new Roles();
		
		dataObj.setRoles_name("测试权限");
		dataObj.setRoles_note("123");
		
		rolesDAO.add(dataObj);
	}
	
	private static void modifyTest() throws ClassNotFoundException, SQLException {
		Roles dataObj = new Roles();
		
		dataObj.setRoles_id(4);
		dataObj.setRoles_name("测试用户1");
		dataObj.setRoles_note("234");
		
		rolesDAO.modify(dataObj);
	}
	
	private static void deleteTest() throws ClassNotFoundException, SQLException {
		rolesDAO.delete(4);
	}
	




}
