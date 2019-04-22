/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.bookTypes;

/**
 * @author XuKanglei
 *
 */
public class BookTypes {
	private int bookTypes_id;
	private String bookTypes_name;
	private String bookTypes_note;
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(bookTypes_id+"\t").append(bookTypes_name+"\t").append(bookTypes_note+"\n");
		return sb.toString();
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
	 * @return the bookTypes_name
	 */
	public String getBookTypes_name() {
		return bookTypes_name;
	}

	/**
	 * @param bookTypes_name the bookTypes_name to set
	 */
	public void setBookTypes_name(String bookTypes_name) {
		this.bookTypes_name = bookTypes_name;
	}

	/**
	 * @return the bookTypes_note
	 */
	public String getBookTypes_note() {
		return bookTypes_note;
	}

	/**
	 * @param bookTypes_note the bookTypes_note to set
	 */
	public void setBookTypes_note(String bookTypes_note) {
		this.bookTypes_note = bookTypes_note;
	}
}
