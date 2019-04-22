/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.orders;

/**
 * @author XuKanglei
 *
 */
public class Orders {
	private int orders_id;
	private int users_id;
	private String orders_time;
	private Double orders_totalMoney;
	
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(orders_id+"\t").append(users_id+"\t").append(orders_time+"\t").append(orders_totalMoney+"\n");
		return sb.toString();
	}
	/**
	 * @return the orders_id
	 */
	public int getOrders_id() {
		return orders_id;
	}
	/**
	 * @param orders_id the orders_id to set
	 */
	public void setOrders_id(int orders_id) {
		this.orders_id = orders_id;
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
	 * @return the orders_time
	 */
	public String getOrders_time() {
		return orders_time;
	}
	/**
	 * @param orders_time the orders_time to set
	 */
	public void setOrders_time(String orders_time) {
		this.orders_time = orders_time;
	}
	/**
	 * @return the orders_totalMoney
	 */
	public Double getOrders_totalMoney() {
		return orders_totalMoney;
	}
	/**
	 * @param orders_totalMoney the orders_totalMoney to set
	 */
	public void setOrders_totalMoney(Double orders_totalMoney) {
		this.orders_totalMoney = orders_totalMoney;
	}
	
	
}
