/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.comments;

import java.sql.SQLException;

/**
 * @author XuKanglei
 *
 */
public class CommentsDAOTest {
	private static CommentsDAO commentsDAO = new CommentsDAO();
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
				commentsDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	private static void getAllTest() throws ClassNotFoundException, SQLException {
		System.out.println(commentsDAO.getAll());
		
	}
	private static void getByIdTest() throws ClassNotFoundException, SQLException {
		System.out.println(commentsDAO.getById(1));
		
	}
	private static void addTest() throws ClassNotFoundException, SQLException {
		Comments dataObj = new Comments();
		
		dataObj.setUsers_id(1);
		dataObj.setBooks_id(1);
		dataObj.setComments_content("∆¿¬€≤‚ ‘");
		dataObj.setComments_time("123");
		
		commentsDAO.add(dataObj);
		
	}
	private static void modifyTest() throws ClassNotFoundException, SQLException {
		Comments dataObj = new Comments();
		
		dataObj.setComments_id(1);
		dataObj.setUsers_id(1);
		dataObj.setBooks_id(1);
		dataObj.setComments_content("∆¿¬€≤‚ ‘1");
		dataObj.setComments_time("234");
		
		commentsDAO.modify(dataObj);
	}
	private static void deleteTest() throws ClassNotFoundException, SQLException {
		commentsDAO.delete(1);
		
	}

}
