package IceCream.IceCreamShop;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@EnableAutoConfiguration

public class IceCreamController {
	Chocolate chock = new Chocolate("Chocolate", "None","Milk", 100);
	Vanila vani = new Vanila("Vanila", "None", "Milk", 200);
	
	@RequestMapping("/menu/chock")
	public String Chock(){
		return "Taste : " + chock.getTaste() + "\n" +
				"Topping : " + chock.getTopping() + "\n" +
				"Type : " + chock.getType() + "\n" +
				"Price : " + chock.getPrice() + "\n";
	}
	
	@RequestMapping("/menu/vanila")
	public String Vanila(){
		return "Taste : " + vani.getTaste() + "\n" +
				"Topping : " + vani.getTopping() + "\n" +
				"Type : " + vani.getType() + "\n" +
				"Price : " + vani.getPrice() + "\n";
	}
}