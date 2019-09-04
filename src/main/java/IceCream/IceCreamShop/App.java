package IceCream.IceCreamShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
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
	SpringApplication.run(App.class, args);
	}
	@RequestMapping("/")
	String home() {
		return "IceCreamShop";
}
}
