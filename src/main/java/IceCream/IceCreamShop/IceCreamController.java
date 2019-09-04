package IceCream.IceCreamShop;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class IceCreamController {
	Chocolate chock  = new Chocolate();

@RequestMapping("/menu/chock")
public String Apple(){
    return "ลำดับ : "+chock.getId()+"\n"+"รสชาติ : "+chock.getTaste()+"\n"+"Topping : "+chock.getTopping()+"\n"+"ราคา : "+chock.getPrice();
}
}