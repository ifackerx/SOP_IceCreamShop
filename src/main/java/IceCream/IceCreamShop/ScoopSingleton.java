package IceCream.IceCreamShop;


// คลาส Scoop คือคลาส "ที่ตักไอติม"

public class ScoopSingleton {
	
	private static ScoopSingleton instance;
	
	private String type;  // ประเภทของที่ตัก
	private String  material; // วัสดุของที่ตัก
	private char size; // ขนาดของที่ตัก (S,M,L)
	
	private ScoopSingleton() {
		
	}
	
	public static ScoopSingleton getInstance() {
		if(instance == null) {
			instance = new ScoopSingleton();
		}
		return instance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}
}
