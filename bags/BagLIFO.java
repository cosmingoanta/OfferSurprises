package bags;

import java.util.ArrayList;

import surprises.ISurprise;

public class BagLIFO implements IBag{
	//Container of Surprises, type Bag, works as LIFO

	private ArrayList<ISurprise> bagLIFO;
	
	public BagLIFO() {
		bagLIFO = new ArrayList<ISurprise>();
	}

	@Override
	public void put(ISurprise newSurprise) {
		bagLIFO.add(newSurprise);

	}

	@Override
	public void put(IBag bagOfSurprises) {
		while(!bagOfSurprises.isEmpty()) {
			bagLIFO.add(bagOfSurprises.takeOut());
		}
	}

	@Override
	public ISurprise takeOut() {
		if(!bagLIFO.isEmpty()) {
			return bagLIFO.remove(bagLIFO.size() - 1);
		}
		System.out.println("Error! The bag is empty");
		return null;
	}

	@Override
	public boolean isEmpty() {
		if(bagLIFO.size() != 0) {
			return false;
		}
		return true;
	}

	@Override
	public int size() {
		return bagLIFO.size();
	}

}
