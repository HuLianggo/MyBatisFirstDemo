package cn.com.mybatis.po;

public class ShoppingCart {
	private int productId;
	private String productName;
	private int number;
	private double price;
	private double totalAmount;
	
	
	
	
	private int scart_id ;
	private String p_name;
	private User user;
	
	
	
	public void init() {
		//计算商品的总额的
		this.totalAmount=this.number*this.price;
	}
	
	public ShoppingCart() {
	}
	
	public ShoppingCart(int productId, String productName, int number, double price, double totalAmount) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.number = number;
		this.price = price;
		this.totalAmount = totalAmount;
	}


	public String toString() {
		return "ShoppingCart [productId=" + productId + ", productName=" + productName + ", number=" + number
				+ ", price=" + price + ", totalAmount=" + totalAmount + "]";
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getScart_id() {
		return scart_id;
	}

	public void setScart_id(int scart_id) {
		this.scart_id = scart_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
