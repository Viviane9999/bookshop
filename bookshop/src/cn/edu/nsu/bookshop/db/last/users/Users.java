package cn.edu.nsu.bookshop.db.last.users;

public class Users {
	private int users_id;
	private int roles_id;
	private String users_name;
	private String users_sex;
	private String users_idNum;
	private String users_mobile;
	private String users_address;
	private String users_postcode;
	private String users_portraitImg;
	private String users_password;
	//================================================
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(users_id+"\t").append(roles_id+"\t").append(users_name+"\t")
		.append(users_sex+"\t").append(users_idNum+"\t").append(users_mobile+"\t")
		.append(users_address+"\t").append(users_postcode+"\t").append(users_portraitImg+"\t")
		.append(users_password+"\n");
		return sb.toString();
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
	 * @return the roles_id
	 */
	public int getRoles_id() {
		return roles_id;
	}
	/**
	 * @param roles_id the roles_id to set
	 */
	public void setRoles_id(int roles_id) {
		this.roles_id = roles_id;
	}
	/**
	 * @return the users_name
	 */
	public String getUsers_name() {
		return users_name;
	}
	/**
	 * @param users_name the users_name to set
	 */
	public void setUsers_name(String users_name) {
		this.users_name = users_name;
	}
	/**
	 * @return the users_sex
	 */
	public String getUsers_sex() {
		return users_sex;
	}
	/**
	 * @param users_sex the users_sex to set
	 */
	public void setUsers_sex(String users_sex) {
		this.users_sex = users_sex;
	}
	/**
	 * @return the users_idNum
	 */
	public String getUsers_idNum() {
		return users_idNum;
	}
	/**
	 * @param users_idNum the users_idNum to set
	 */
	public void setUsers_idNum(String users_idNum) {
		this.users_idNum = users_idNum;
	}
	/**
	 * @return the users_mobile
	 */
	public String getUsers_mobile() {
		return users_mobile;
	}
	/**
	 * @param users_mobile the users_mobile to set
	 */
	public void setUsers_mobile(String users_mobile) {
		this.users_mobile = users_mobile;
	}
	/**
	 * @return the users_address
	 */
	public String getUsers_address() {
		return users_address;
	}
	/**
	 * @param users_address the users_address to set
	 */
	public void setUsers_address(String users_address) {
		this.users_address = users_address;
	}
	/**
	 * @return the users_postcode
	 */
	public String getUsers_postcode() {
		return users_postcode;
	}
	/**
	 * @param users_postcode the users_postcode to set
	 */
	public void setUsers_postcode(String users_postcode) {
		this.users_postcode = users_postcode;
	}
	/**
	 * @return the users_portraitImg
	 */
	public String getUsers_portraitImg() {
		return users_portraitImg;
	}
	/**
	 * @param users_portraitImg the users_portraitImg to set
	 */
	public void setUsers_portraitImg(String users_portraitImg) {
		this.users_portraitImg = users_portraitImg;
	}
	/**
	 * @return the users_password
	 */
	public String getUsers_password() {
		return users_password;
	}
	/**
	 * @param users_password the users_password to set
	 */
	public void setUsers_password(String users_password) {
		this.users_password = users_password;
	}
	
}
