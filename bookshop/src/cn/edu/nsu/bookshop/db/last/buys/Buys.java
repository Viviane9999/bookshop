/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.buys;

/**
 * @author XuKanglei
 *
 */
public class Buys {

	private int buys_id;
	private int books_id;
	private int users_id;
	private int buys_num;
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(buys_id+"\t").append(books_id+"\t").append(users_id+"\t").append(buys_num+"\n");
		return sb.toString();
	}
	
	/**
	 * @return the buys_id
	 */
	public int getBuys_id() {
		return buys_id;
	}
	/**
	 * @param buys_id the buys_id to set
	 */
	public void setBuys_id(int buys_id) {
		this.buys_id = buys_id;
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
	 * @return the users_id
	 */
	public int getUsers_id() {
		return users_id;
	}
	/**
	 * @param users_id the users_id to set
	 */
	public void setUsers_id(int users_id) {
		this.users_id = users_id;
	}
	/**
	 * @return the buys_num
	 */
	public int getBuys_num() {
		return buys_num;
	}
	/**
	 * @param buys_num the buys_num to set
	 */
	public void setBuys_num(int buys_num) {
		this.buys_num = buys_num;
	}
}
