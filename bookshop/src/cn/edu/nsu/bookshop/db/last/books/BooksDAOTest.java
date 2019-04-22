/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.books;

import java.sql.SQLException;

/**
 * @author XuKanglei
 *
 */
public class BooksDAOTest {
	private static BooksDAO booksDAO = new BooksDAO();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
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
		} finally {
			try {
				booksDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static void getAllTest() throws ClassNotFoundException, SQLException {
		System.out.println(booksDAO.getAll());
		
	}

	private static void getByIdTest() throws ClassNotFoundException, SQLException {
		System.out.println(booksDAO.getById(1));
		
	}

	private static void addTest() throws ClassNotFoundException, SQLException {
		Books dataObj = new Books();
		
		dataObj.setBookTypes_id(1);
		dataObj.setBooks_ISBN("123456");
		dataObj.setBooks_name("测试图书");
		dataObj.setBooks_author("作者");
		dataObj.setBooks_publisher("出版社");
		dataObj.setBooks_price(123.4);
		dataObj.setBooks_note("123");
		dataObj.setBooks_faceImg("123");
		dataObj.setBooks_inDate("123");
		
		booksDAO.add(dataObj);
		
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException {
		Books dataObj = new Books();
		
		dataObj.setBooks_id(1);
		dataObj.setBookTypes_id(1);
		dataObj.setBooks_ISBN("123456789");
		dataObj.setBooks_name("测试图书");
		dataObj.setBooks_author("作者");
		dataObj.setBooks_publisher("出版社");
		dataObj.setBooks_price(123.4);
		dataObj.setBooks_note("123789");
		dataObj.setBooks_faceImg("1237897");
		dataObj.setBooks_inDate("123789");
		
		booksDAO.modify(dataObj);
		
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException {
		booksDAO.delete(1);
		
	}

}
