package surprises;

public class MinionToy implements ISurprise{
	//one of the three possible surprises. offers a minion with a given name, in order of their index.
	
	private String name;
	private static final String[] names = {"Dave", "Mike", "John", "Jerry", "Rick"};
	private static int counter = 0;
	
	public MinionToy() {
		this.name = MinionToy.names[counter];
		MinionToy.counter++;
		if(MinionToy.counter > names.length - 1) {
			MinionToy.counter = 0;
		}
	}
	
	@Override
	public void enjoy() {
		System.out.println("You got a minion named: " + this.name);
		System.out.println(this.toString());
		
	}
	
	@Override
	public String toString() {
		return "[Minion] name = " + this.name;
	}
	
	public static MinionToy generate() {
		MinionToy surprise = new MinionToy();
		return surprise;
	}

}
