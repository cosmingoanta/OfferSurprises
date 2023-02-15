package surprises;

import java.util.Random;

public class Candies implements ISurprise {
	//one of the three possible surprises. offers a random candy type
	
	private String type;
	private int number;
	private static final String[] candyType = {"haribo", "bounty bar", "mars bar", "milka", "lindt"};
	private static Random random = new Random();
	
	public Candies(String type, int number) {
		this.type = type;
		this.number = number;
	}
	
	@Override
	public void enjoy() {
		System.out.println(String.format("You've received %d %s candies.", this.number, this.type));
		System.out.println(this.toString());
		
	}
	
	@Override
	public String toString() {
		return String.format("[Candies] number = %d, type = %s", this.number, this.type);
	}
	
	public static Candies generate() {
		Candies surprise = new Candies(candyType[random.nextInt(candyType.length - 1)], random.nextInt(100));
		return surprise;
	}
}
