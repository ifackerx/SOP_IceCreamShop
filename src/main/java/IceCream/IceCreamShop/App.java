package IceCream.IceCreamShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import IceCream.IceCreamShop.App;
/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class App {
public static void main(String[] args) {
	
	IceCreamFactory factory = new IceCreamFactory();
	IceCream a = factory.getIceCream("VANILA");
	a.order();
	
	SpringApplication.run(App.class, args);
	}



@RequestMapping(value = "/", method = RequestMethod.POST)
	public String hello(@RequestBody Object object) {
		return String.format("{\"payload\":\"%s\"}", object);
	}
}

