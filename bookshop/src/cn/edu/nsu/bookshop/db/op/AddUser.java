/**
 * 
 */
package cn.edu.nsu.bookshop.db.op;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ZhangXiaohua
 *
 */
public class AddUser {

	private Connection con = null;
	private PreparedStatement pst = null;
	private ResultSet rst = null;	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		AddUser addUser = new AddUser();
		addUser.addUser();
	}

	private void addUser()
	{
		try {
			//加载JDBC驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			//获得DB连接
			 con = DriverManager.getConnection("jdbc:mysql://172.17.130.84:3306/bookshop_info?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8&useSSL=false", "root", "zxh751106");
			//封装SQL
			String sql = "INSERT into users(roles_id,users_name,users_sex,users_idNum,users_mobile,users_address,users_postcode,users_portraitImg,users_password) VALUES(?,?,?,?,?,?,?,?,?)";
			 pst = con.prepareStatement(sql);
			//参数绑定
			pst.setInt(1,2);
			pst.setString(2, "张鑫婷");
			pst.setString(3, "女");
			pst.setString(4, "510181200912030123");
			pst.setString(5, "13408568561");
			pst.setString(6, "都江堰市北街小学");
			pst.setString(7, "611830");
			pst.setString(8, null);
			pst.setString(9, "123456");
			//执行SQL
		    pst.executeUpdate();
			//处理结果数据			
			//关闭DB连接	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				if(rst != null)
				{
					rst.close();
				}
				if(pst != null)
				{
					pst.close();
				}
				if(con != null)
				{
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	}
}
