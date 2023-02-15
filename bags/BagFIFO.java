package bags;

import java.util.ArrayList;

import surprises.ISurprise;

public class BagFIFO implements IBag{
	//Container of Surprises, type Bag, works as FIFO
	
	private ArrayList<ISurprise> bagFIFO;
	
	public BagFIFO() {
		bagFIFO = new ArrayList<ISurprise>();
	}
	
	@Override
	public void put(ISurprise newSurprise) {
		bagFIFO.add(newSurprise);
		
	}

	@Override
	public void put(IBag bagOfSurprises) {
		while(!bagOfSurprises.isEmpty()) {
			bagFIFO.add(bagOfSurprises.takeOut());
		}
	}

	@Override
	public ISurprise takeOut() {
		if(!bagFIFO.isEmpty()) {
			return bagFIFO.remove(0);
		}
		System.out.println("Error! The bag is empty");
		return null;
	}

	@Override
	public boolean isEmpty() {
		if(bagFIFO.size() != 0) {
			return false;
		}
		return true;
	}

	@Override
	public int size() {
		return bagFIFO.size();
	}

}
