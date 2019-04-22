/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.books;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.bookshop.db.last.DBMain;

/**
 * @author XuKanglei
 *
 */
public class BooksDAO extends DBMain<Books>{

	@Override
	public ArrayList<Books> getAll() throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM books";
		pst = getPrepareStatement(sql);
		rst = pst.executeQuery();
		ArrayList<Books> books = new ArrayList<Books>();
		while(rst.next()) {
			books.add(assemble(rst));
		}
		release();
		return books;
	}

	@Override
	public Books getById(int id) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM books WHERE books_id = ?";
		pst = getPrepareStatement(sql);;
		pst.setInt(1, id);
		rst = pst.executeQuery();
		Books books = null;
		while(rst.next()) {
			books = assemble(rst);
		}
		release();
		return books;
	}

	@Override
	public void add(Books dataObj) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO books(bookTypes_id, books_ISBN, books_name, books_author, "
				+ "books_publisher, books_price, books_note, books_faceImg, books_inDate)"
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		pst = getPrepareStatement(sql);
		pst.setInt(1, dataObj.getBookTypes_id());
		pst.setString(2, dataObj.getBooks_ISBN());
		pst.setString(3, dataObj.getBooks_name());
		pst.setString(4, dataObj.getBooks_author());
		pst.setString(5, dataObj.getBooks_publisher());
		pst.setDouble(6, dataObj.getBooks_price());
		pst.setString(7, dataObj.getBooks_note());
		pst.setString(8, dataObj.getBooks_faceImg());
		pst.setString(9, dataObj.getBooks_inDate());
		
		pst.executeUpdate();
		release();
	}

	@Override
	public void modify(Books newDataObj) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE books SET bookTypes_id = ?, books_ISBN = ?, books_name = ?, books_author = ?, "
				+ "books_publisher = ?, books_price = ?, books_note = ?, books_faceImg = ?, books_inDate = ? WHERE books_id = ?";
		
		pst = getPrepareStatement(sql);
		pst.setInt(1, newDataObj.getBookTypes_id());
		pst.setString(2, newDataObj.getBooks_ISBN());
		pst.setString(3, newDataObj.getBooks_name());
		pst.setString(4, newDataObj.getBooks_author());
		pst.setString(5, newDataObj.getBooks_publisher());
		pst.setDouble(6, newDataObj.getBooks_price());
		pst.setString(7, newDataObj.getBooks_note());
		pst.setString(8, newDataObj.getBooks_faceImg());
		pst.setString(9, newDataObj.getBooks_inDate());
		pst.setInt(10, newDataObj.getBooks_id());
		
		pst.executeUpdate();
		release();
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		String sql = "DELETE FROM books WHERE books_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		pst.executeUpdate();
		release();
	}

	@Override
	public Books assemble(ResultSet rst) throws SQLException {
		Books books = new Books();
		books.setBooks_id(rst.getInt("books_id"));
		books.setBookTypes_id(rst.getInt("bookTypes_id"));
		books.setBooks_ISBN(rst.getString("books_ISBN"));
		books.setBooks_name(rst.getString("books_name"));
		books.setBooks_author(rst.getString("books_author"));
		books.setBooks_publisher(rst.getString("books_publisher"));
		books.setBooks_price(rst.getDouble("books_price"));
		books.setBooks_note(rst.getString("books_note"));
		books.setBooks_faceImg(rst.getString("books_faceImg"));
		books.setBooks_inDate(rst.getString("books_inDate"));
		return books;
	}
	
	
}
