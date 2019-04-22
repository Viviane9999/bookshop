/**
 * 
 */
package cn.edu.nsu.bookshop.db.op1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ZhangXiaohua
 *
 */
public class GetAllUser extends DBMain
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		GetAllUser getAllUser = new GetAllUser();
		getAllUser.getAllUser();
		
	}

	private void getAllUser()
	{
		
		try {
			//封装SQL
			String sql = "select * from users";
			 pst = getPrepareStatement(sql);
			//参数绑定
			//pst.setInt(1, 1);
			//执行SQL
			 rst = pst.executeQuery();
			//处理结果数据
			while(rst.next())
			{
				System.out.print(rst.getInt("users_id")+"\t");
				System.out.print(rst.getInt("roles_id")+"\t");
				System.out.print(rst.getString("users_name")+"\t");
				System.out.print(rst.getString("users_sex")+"\t");
				System.out.print(rst.getString("users_idNum")+"\t");
				System.out.print(rst.getString("users_mobile")+"\t");
				System.out.print(rst.getString("users_address")+"\t");
				System.out.print(rst.getString("users_postcode")+"\t");
				System.out.print(rst.getString("users_portraitImg")+"\t");
				System.out.println(rst.getString("users_password"));
			}
			//关闭DB连接

			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
