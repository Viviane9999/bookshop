/**
 * 
 */
package cn.edu.nsu.bookshop.db.op3;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author ZhangXiaohua
 *
 */
public class UsersDAO extends DBMain
{
	public ArrayList<Users> getAllUser() throws ClassNotFoundException, SQLException
	{

		//封装SQL
		String sql = "select * from users";
		 pst = getPrepareStatement(sql);
		//参数绑定
		//pst.setInt(1, 1);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 ArrayList<Users> users = new ArrayList<Users>();
		 while(rst.next())
		 {
			 users.add(assemble(rst));
		 }
		//关闭DB连接
		 release();
		 return users;
	}
	public Users getUserById(int users_id) throws ClassNotFoundException, SQLException
	{
		//封装SQL
		String sql = "select * from users where users_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1, users_id);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 Users user = null;
		 while(rst.next())
		 {
			 user = assemble(rst);
		 }
		//关闭DB连接
		 return user;
	}
	public void addUser(Users user) throws ClassNotFoundException, SQLException
	{

		//封装SQL
		String sql = "INSERT into users(roles_id,users_name,users_sex,users_idNum,users_mobile,users_address,users_postcode,users_portraitImg,users_password) VALUES(?,?,?,?,?,?,?,?,?)";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1,user.getRoles_id());
		pst.setString(2, user.getUsers_name());
		pst.setString(3, user.getUsers_sex());
		pst.setString(4, user.getUsers_idNum());
		pst.setString(5, user.getUsers_mobile());
		pst.setString(6, user.getUsers_address());
		pst.setString(7, user.getUsers_postcode());
		pst.setString(8, user.getUsers_portraitImg());
		pst.setString(9, user.getUsers_password());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}
	public void modifyUser(Users user) throws ClassNotFoundException, SQLException
	{

		//封装SQL
		String sql = "update users set roles_id=?,users_name=?,users_sex=?,users_idNum=?,users_mobile=?,users_address=?,users_postcode=?,users_portraitImg=?,users_passwor=? where users_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		 pst.setInt(1,user.getRoles_id());
			pst.setString(2, user.getUsers_name());
			pst.setString(3, user.getUsers_sex());
			pst.setString(4, user.getUsers_idNum());
			pst.setString(5, user.getUsers_mobile());
			pst.setString(6, user.getUsers_address());
			pst.setString(7, user.getUsers_postcode());
			pst.setString(8, user.getUsers_portraitImg());
			pst.setString(9, user.getUsers_password());
		pst.setInt(10, user.getUsers_id());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}
	public void deleteUser(int users_id) throws ClassNotFoundException, SQLException
	{

		//封装SQL
		String sql = "DELETE FROM users WHERE users_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1,users_id);
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	}
	
	private Users assemble(ResultSet rst) throws SQLException
	{
		Users user = new Users();
		user.setUsers_id(rst.getInt("users_id"));
		user.setRoles_id(rst.getInt("roles_id"));
		user.setUsers_name(rst.getString("users_name"));
		user.setUsers_sex(rst.getString("users_sex"));
		user.setUsers_idNum(rst.getString("users_idNum"));
		user.setUsers_mobile(rst.getString("users_mobile"));
		user.setUsers_address(rst.getString("users_address"));
		user.setUsers_postcode(rst.getString("users_postcode"));
		user.setUsers_portraitImg(rst.getString("users_portraitImg"));
		user.setUsers_password(rst.getString("users_password"));
		return user;
	}
}
