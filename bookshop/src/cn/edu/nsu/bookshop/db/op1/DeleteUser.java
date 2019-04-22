/**
 * 
 */
package cn.edu.nsu.bookshop.db.op1;

import java.sql.SQLException;

/**
 * @author ZhangXiaohua
 *
 */
public class DeleteUser extends DBMain
{
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		DeleteUser deleteUser = new DeleteUser();
		deleteUser.deleteUser();
	}
	
	private void deleteUser()
	{

		
		try {
			//封装SQL
			String sql = "DELETE FROM users WHERE users_id=?";
			 pst = getPrepareStatement(sql);
			//参数绑定
			pst.setInt(1,2);
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
				release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	}

}
