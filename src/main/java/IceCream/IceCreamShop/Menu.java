package IceCream.IceCreamShop;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
@EnableAutoConfiguration
@RequestMapping("/menu")
public class Menu {
	public String toString(){
        return "Here is a Menu";
	}
}
