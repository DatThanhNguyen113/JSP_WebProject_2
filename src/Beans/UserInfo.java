package Beans;

public class UserInfo {
	private int userid;
	private String username;
	private String fullname;
	private String email;
	private String phone;
	
	public int getUserID() {
		return this.userid;
	}	
	public void setUserID(int m) {
		this.userid = m;
	}
	
	public String getUserName() {
		return this.username;
	}	
	public void setUserName(String m) {
		this.username = m;
	}
	
	public String getFullName() {
		return this.fullname;
	}	
	public void setFullName(String m) {
		this.fullname = m;
	}
	
	public String getEmail() {
		return this.email;
	}	
	public void setEmail(String m) {
		this.email = m;
	}
	
	public String getPhone() {
		return this.phone;
	}	
	public void setPhone(String m) {
		this.phone = m;
	}
}
