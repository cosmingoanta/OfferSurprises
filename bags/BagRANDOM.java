package bags;

import java.util.ArrayList;
import java.util.Random;

import surprises.ISurprise;

public class BagRANDOM implements IBag{
	//Container of Surprises, type Bag, works as Random
	
	private ArrayList<ISurprise> bagRandom;
	private static Random random = new Random();
	
	public BagRANDOM() {
		bagRandom = new ArrayList<ISurprise>();
	}
	
	@Override
	public void put(ISurprise newSurprise) {
		bagRandom.add(newSurprise);
		
	}

	@Override
	public void put(IBag bagOfSurprises) {
		while(!bagOfSurprises.isEmpty()) {
			bagRandom.add(bagOfSurprises.takeOut());
		}
	}

	@Override
	public ISurprise takeOut() {
		if(!bagRandom.isEmpty()) {
			ISurprise aux = bagRandom.get(random.nextInt(bagRandom.size()));
			bagRandom.remove(aux);
			return aux;
		}
		System.out.println("Error! The bag is empty");
		return null;
	}

	@Override
	public boolean isEmpty() {
		if(bagRandom.size() != 0) {
			return false;
		}
		return true;
	}

	@Override
	public int size() {
		return bagRandom.size();
	}

}
