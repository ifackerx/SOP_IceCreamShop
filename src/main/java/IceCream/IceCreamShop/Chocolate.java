package IceCream.IceCreamShop;

public class Chocolate implements IceCream{
	
	public void make() {
		ScoopSingleton scoop = ScoopSingleton.getInstance();
		scoop.setMaterial("Aluminiam");
		scoop.setSize('M');
		scoop.setType("disher");
		
		System.out.print("ok");// TODO Auto-generated method stub
		
	}

	public void setPrice(float price) {
		// TODO Auto-generated method stub
		
	}

	public float getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void addTopping(String topping) {
		// TODO Auto-generated method stub
		
	}

	public String getTopping() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setID(int id) {
		// TODO Auto-generated method stub
		
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void order() {
		// TODO Auto-generated method stub
		
	}
	
}