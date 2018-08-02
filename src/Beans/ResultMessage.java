package Beans;

public class ResultMessage {
	private int id;
	private String code;
	private String name;
	private String desciption;
	
	public int getID() {
		return this.id;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.desciption;
	}
	
	public ResultMessage(int mID, String mCode, String mName, String mDescription) {
		this.id = mID;
		this.code = mCode;
		this.name = mName;
		this.desciption = mDescription;
	}
}
