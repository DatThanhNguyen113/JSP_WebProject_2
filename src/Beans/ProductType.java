package Beans;

public class ProductType {
	private int id;
	private String name;
	private int cataloguryid;
	private String image;
	
	public int getID() {
		return this.id;
	}
	public void setID(int m) {
		this.id = m;
	}
	
	public int getCataloguryID() {
		return this.cataloguryid;
	}
	public void setCataloguryID(int m) {
		this.cataloguryid = m;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String m) {
		this.name = m;
	}
	
	public String getImage() {
		return this.image;
	}
	public void setImage(String m) {
		this.image = m;
	}
}
