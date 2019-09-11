package IceCream.IceCreamShop;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class IceCreamController {

	ArrayList<IceCream> bucket = new ArrayList<IceCream>();

	
	@RequestMapping(value= "/iceCream/create-{id}-{topping}-{price}", method=RequestMethod.POST)
	public ResponseEntity<IceCream> create(@PathVariable("id") int id, @PathVariable("topping") String topping, @PathVariable("price") float price) {
		
		IceCreamFactory factory = new IceCreamFactory();
		IceCream vanila = factory.getIceCream("VANILA");
		vanila.setID(id);
		vanila.setPrice(price);
		vanila.addTopping(topping);
		bucket.add(vanila);
		return new ResponseEntity<IceCream>(vanila, HttpStatus.OK);
	}
}
