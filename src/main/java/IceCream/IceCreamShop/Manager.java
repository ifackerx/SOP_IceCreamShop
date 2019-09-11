package IceCream.IceCreamShop;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Manager {
	

	private static Manager instance;
	
	private String name; //ชื่อผู้จัดการ

	private Manager() {
		
	}
	public static Manager getInstance() {
		if(instance == null) {
			instance = new Manager();
		}
		return instance;
	}

	public void getOrder() {
			try {
				FileReader r =  new FileReader("output.txt");
				int data;
				while((data = r.read()) != -1) {
					System.out.printf("%c", data);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
