package bags;

public final class BagFactory implements IBagFactory{
	//Design Pattern used: Factory Pattern & Singleton 
	
	private static BagFactory bag;
	
	private BagFactory() {
		
	}
	
	public static BagFactory getInstance() {
		if(bag == null) {
			bag = new BagFactory();
		}
		return bag;
	}
	
	@Override
	public IBag makeBag(String type) {
		switch(type) {
		case "RANDOM":
			return new BagRANDOM();
		case "FIFO":
			return new BagFIFO();
		case "LIFO":
			return new BagLIFO();
		default:
			System.out.println("Wrong input.");
			return null;
		}
	}

}
