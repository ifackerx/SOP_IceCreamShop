package IceCream.IceCreamShop;

import java.io.IOException;

public interface IceCream {
	
	void make();
	
	void setID(int id);
	int getId();
	
	void setPrice(float price);
	float getPrice();
	
	void addTopping(String topping);
	String getTopping();
	
	void order();
}
