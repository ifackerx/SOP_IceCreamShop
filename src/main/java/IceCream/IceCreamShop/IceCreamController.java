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

	
	@RequestMapping(value= "/chocolate/create-{id}-{topping}-{price}", method=RequestMethod.POST)
	public ResponseEntity<IceCream> createChoc(@PathVariable("id") int id, @PathVariable("topping") String topping, @PathVariable("price") float price) {
		
		IceCreamFactory factory = new IceCreamFactory();
		IceCream chocolate = factory.getIceCream("CHOCOLATE");
		chocolate.setID(id);
		chocolate.setPrice(price);
		chocolate.addTopping(topping);
		chocolate.order();
		bucket.add(chocolate);
		
		return new ResponseEntity<IceCream>(chocolate, HttpStatus.OK);
	}
	
	@RequestMapping(value= "/vanila/create-{id}-{topping}-{price}", method=RequestMethod.POST)
	public ResponseEntity<IceCream> createVani(@PathVariable("id") int id, @PathVariable("topping") String topping, @PathVariable("price") float price) {
		
		IceCreamFactory factory = new IceCreamFactory();
		IceCream vanila = factory.getIceCream("VANILA");
		vanila.setID(id);
		vanila.setPrice(price);
		vanila.addTopping(topping);
		vanila.order();
		bucket.add(vanila);
		
		return new ResponseEntity<IceCream>(vanila, HttpStatus.OK);
	}
	
	@RequestMapping(value= "/IceCream", method=RequestMethod.GET)
	public ArrayList<IceCream> getAll() {
		return bucket;
	}
}
