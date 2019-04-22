/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.users;

import java.sql.SQLException;

/**
 * @author ZhangXiaohua
 *
 */
public class UsersDAOTest {

	private static UsersDAO usersDAO = new UsersDAO();
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try 
		{
			getAllTest();
			//getByIdTest();
			//addTest();
			//modifyTest();
			//deleteTest();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				usersDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(usersDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(usersDAO.getById(1));
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
		Users dataObj = new Users();
		
		dataObj.setRoles_id(2);
		dataObj.setUsers_name("测试用户");
		dataObj.setUsers_sex("男");
		dataObj.setUsers_idNum("610404197711051154");
		dataObj.setUsers_mobile("13668270602");
		dataObj.setUsers_address("都江堰");
		dataObj.setUsers_postcode("611830");
		dataObj.setUsers_portraitImg(null);
		dataObj.setUsers_password("123456");
		
		usersDAO.add(dataObj);
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException
	{
		Users dataObj = new Users();
		
		dataObj.setUsers_id(8);
		dataObj.setRoles_id(2);
		dataObj.setUsers_name("测试用户");
		dataObj.setUsers_sex("男");
		dataObj.setUsers_idNum("610404197711051154");
		dataObj.setUsers_mobile("13668270602");
		dataObj.setUsers_address("成都东软学院");
		dataObj.setUsers_postcode("611830");
		dataObj.setUsers_portraitImg(null);
		dataObj.setUsers_password("123456");
		
		usersDAO.modify(dataObj);
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException
	{
		usersDAO.delete(8);
	}
}
