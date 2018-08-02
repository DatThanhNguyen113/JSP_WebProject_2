package Beans;

public class UserAccount {
	private String username;
	private String password;
	private String gender;
	
	public String getUserName() {
		return this.username;
	}
	public void setUserName(String m) {
		this.username = m;
	}
	
	public String getPassWord() {
		return this.password;
	}
	public void setPassWord(String m) {
		this.password = m;
	}
	
	public String getGender() {
		return this.gender;
	}
	public void setGender(String m) {
		this.gender = m;
	}
}
