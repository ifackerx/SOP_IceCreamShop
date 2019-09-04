package IceCream.IceCreamShop;

public class IceCream {
	private int id;
	private String Taste;
	private String Topping;
	private String type;
	private int price;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTaste() {
		return Taste;
	}
	public void setTaste(String taste) {
		Taste = taste;
	}
	public String getTopping() {
		return Topping;
	}
	public void setTopping(String topping) {
		Topping = topping;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
