package IceCream.IceCreamShop;

public class IceCreamFactory {

	public IceCream getIceCream(String IceCreamType) {
		if(IceCreamType == null) {
			return null;
		}
		
		if(IceCreamType.equalsIgnoreCase("CHOCOLATE")) {
			return new Chocolate();
		}
		if(IceCreamType.equalsIgnoreCase("VANILA")) {
			return new Vanila();
		}
		return null;
	}
}
