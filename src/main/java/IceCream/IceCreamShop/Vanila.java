package IceCream.IceCreamShop;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Vanila implements IceCream{
	
	int id;
	float price;
	String topping;

	
	public Vanila() {
		
	}
	
	public Vanila(int id, float price, String topping) {
		this.price = price;
		this.topping = topping;
	}

	public void make() {
		ScoopSingleton scoop = ScoopSingleton.getInstance();
		scoop.setMaterial("Aluminiam");
		scoop.setSize('M');
		scoop.setType("disher");
		System.out.print("We are going to make your VANILA");
	}
	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public void addTopping(String topping) {
		this.topping = topping;
	}

	public String getTopping() {
		return topping;
	}

	public void setID(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void order() {
//		String path = File.separator+"Users"+File.separator+"pls"+File.separator+"1.html";
		try {
			FileWriter w = new FileWriter("output.txt");
			w.write("hello");
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}