package IceCream.IceCreamShop;

public abstract class IceCream {
	private int id;
	private String Taste;
	private String Topping;
	private String type;
	private int price;
	
	public IceCream(String Taste, String Topping, String type,int price) {
		this.Taste = Taste;
		this.Topping = Topping;
		this.type = type;
		this.price = price;
	}
	
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
