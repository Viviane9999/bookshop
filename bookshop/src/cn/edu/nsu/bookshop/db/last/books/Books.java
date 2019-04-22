/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.books;

/**
 * @author XuKanglei
 *
 */
public class Books {
	private int books_id;
	private int bookTypes_id;
	private String books_ISBN;
	private String books_name;
	private String books_author;
	private String books_publisher;
	private double books_price;
	private String books_note;
	private String books_faceImg;
	private String books_inDate;
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(books_id+"\t").append(bookTypes_id+"\t").append(books_ISBN+"\t").append(books_name+"\t").append(books_author+"\t").append(books_publisher+"\t")
				.append(books_price+"\t").append(books_note+"\t").append(books_faceImg+"\t").append(books_inDate+"\n");
		return sb.toString();
	}
	
	/**
	 * @return the books_id
	 */
	public int getBooks_id() {
		return books_id;
	}
	/**
	 * @param books_id the books_id to set
	 */
	public void setBooks_id(int books_id) {
		this.books_id = books_id;
	}
	/**
	 * @return the bookTypes_id
	 */
	public int getBookTypes_id() {
		return bookTypes_id;
	}
	/**
	 * @param bookTypes_id the bookTypes_id to set
	 */
	public void setBookTypes_id(int bookTypes_id) {
		this.bookTypes_id = bookTypes_id;
	}
	/**
	 * @return the books_ISBN
	 */
	public String getBooks_ISBN() {
		return books_ISBN;
	}
	/**
	 * @param books_ISBN the books_ISBN to set
	 */
	public void setBooks_ISBN(String books_ISBN) {
		this.books_ISBN = books_ISBN;
	}
	/**
	 * @return the books_name
	 */
	public String getBooks_name() {
		return books_name;
	}
	/**
	 * @param books_name the books_name to set
	 */
	public void setBooks_name(String books_name) {
		this.books_name = books_name;
	}
	/**
	 * @return the books_author
	 */
	public String getBooks_author() {
		return books_author;
	}
	/**
	 * @param books_author the books_author to set
	 */
	public void setBooks_author(String books_author) {
		this.books_author = books_author;
	}
	/**
	 * @return the books_publisher
	 */
	public String getBooks_publisher() {
		return books_publisher;
	}
	/**
	 * @param books_publisher the books_publisher to set
	 */
	public void setBooks_publisher(String books_publisher) {
		this.books_publisher = books_publisher;
	}
	/**
	 * @return the books_price
	 */
	public double getBooks_price() {
		return books_price;
	}
	/**
	 * @param books_price the books_price to set
	 */
	public void setBooks_price(double books_price) {
		this.books_price = books_price;
	}
	/**
	 * @return the books_note
	 */
	public String getBooks_note() {
		return books_note;
	}
	/**
	 * @param books_note the books_note to set
	 */
	public void setBooks_note(String books_note) {
		this.books_note = books_note;
	}
	/**
	 * @return the books_faceImg
	 */
	public String getBooks_faceImg() {
		return books_faceImg;
	}
	/**
	 * @param books_faceImg the books_faceImg to set
	 */
	public void setBooks_faceImg(String books_faceImg) {
		this.books_faceImg = books_faceImg;
	}
	/**
	 * @return the books_inDate
	 */
	public String getBooks_inDate() {
		return books_inDate;
	}
	/**
	 * @param books_inDate the books_inDate to set
	 */
	public void setBooks_inDate(String books_inDate) {
		this.books_inDate = books_inDate;
	}
	
	
}
