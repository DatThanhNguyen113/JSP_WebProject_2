package Beans;

public class Products {
	private int id;
	private int producttypeid;
	private int rating;
	private int amount;
	private int price;
	private int producerid;	
	private String productName;
	private String description;
	private String unit;
	private String image;
	private String name;
	
	public int getID() {
		return this.id;
	}
	public void setID(int m) {
		this.id = m;
	}
	
	public int getProductTypeID() {
		return this.producttypeid;
	}
	public void setProductTypeID(int m) {
		this.producttypeid = m;
	}
	
	public int getRating() {
		return this.rating;
	}
	public void setrating(int m) {
		this.rating = m;
	}
	
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int m) {
		this.price = m;
	}
	
	public int getAmount() {
		return this.amount;
	}
	public void setAmount(int m) {
		this.amount = m;
	}
	
	public int getProducerID() {
		return this.producerid;
	}
	public void setProducerID(int m) {
		this.producerid = m;
	}
	
	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String m) {
		this.productName = m;
	}
	
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String m) {
		this.description = m;
	}
	
	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String m) {
		this.unit = m;
	}
	
	public String getImage() {
		return this.image;
	}
	public void setImage(String m) {
		this.image = m;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String m) {
		this.name = m;
	}
}
