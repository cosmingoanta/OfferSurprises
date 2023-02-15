package surprises;

import java.util.Random;

public final class GatherSurprises {
	//aux class, allows for the generation of a random surprise.
	
	private static Random random = new Random();
	
	private GatherSurprises(){
		
	}
	
	public static ISurprise gather() {
		int randomNo = random.nextInt(3);
		switch(randomNo) {
		case(0):
			return FortuneCookie.generate();
		case(1):
			return Candies.generate();
		case(2):
			return MinionToy.generate();
		default:
			return null;
		}
	}
	
	public static ISurprise[] gather(int n) {
		ISurprise[] arr = new ISurprise[n];
		for(int i = 0; i < n; i++) {
			arr[i] = GatherSurprises.gather();
		}
		return arr;
	}
}
