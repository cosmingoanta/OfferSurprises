package surprizeSharingProject;

import bags.BagFactory;
import bags.BagLIFO;
import bags.IBag;
import offerSurprises.GiveSurpriseAndApplause;
import offerSurprises.GiveSurpriseAndHug;
import offerSurprises.GiveSurpriseAndSing;
import surprises.GatherSurprises;
import surprises.ISurprise;

public class Main {

	public static void main(String[] args) {
		
		//testing the generation of random surprises
		ISurprise test = GatherSurprises.gather();
		ISurprise test2 = GatherSurprises.gather();
		ISurprise test3 = GatherSurprises.gather();
		System.out.println("Testing simple surprises.");
		test.enjoy();
		test2.enjoy();
		test3.enjoy();
		System.out.println();
		
		//Testing the generation of bags
		IBag bag1 = new BagLIFO();
		System.out.println("Testing IBag functionalities");
		System.out.println("bag1 size is: " + bag1.size());
		System.out.println("is bag1 empty?: " + bag1.isEmpty());
		IBag bag2 = new BagLIFO();
		bag1.put(test);
		bag1.put(test2);
		bag1.put(test3);
		System.out.println(bag1.size());
		System.out.println(bag2.isEmpty());
		bag2.put(bag1);
		System.out.println();
		System.out.println(bag1.size());
		System.out.println(bag1.isEmpty());
		bag2.takeOut().enjoy();
		System.out.println();
		
		//testing the factory bag generator
		BagFactory factory = BagFactory.getInstance();
		IBag bag3 = factory.makeBag("LIFO");
		bag3.put(test);
		bag3.put(test2);
		System.out.println("Testing enjoy function and bag takeout function");
		test.enjoy();
		test2.enjoy();
		bag3.takeOut();
		bag3.takeOut();
		IBag bag4 = factory.makeBag("FIFO");
		bag4.put(GatherSurprises.gather());
		bag4.put(GatherSurprises.gather());
		bag4.put(GatherSurprises.gather());
		bag4.takeOut();
		
		//testing the final surprise generation function
		System.out.println("Testing the general GiveSurprises methods");
		GiveSurpriseAndHug finalBagTest1 = new GiveSurpriseAndHug("RANDOM", 2);
		GiveSurpriseAndApplause finalBagTest2 = new GiveSurpriseAndApplause("LIFO", 1);
		finalBagTest1.put(bag3);
		finalBagTest1.giveAll();
		for(ISurprise s : GatherSurprises.gather(10)) {
			finalBagTest2.put(s);
		}
		finalBagTest2.giveAll();
	
	}

}
