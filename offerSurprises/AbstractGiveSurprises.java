package offerSurprises;
import java.util.concurrent.TimeUnit;

import bags.BagFactory;
import bags.IBag;
import surprises.ISurprise;

public abstract class AbstractGiveSurprises{
	//the main functionality to actually manage & give surprises. Abstract because we have 3 different possible messages 

	private IBag bag;
	private int waitTime;
	private BagFactory factory = BagFactory.getInstance();

	public AbstractGiveSurprises(String type, int waitTime) {
		this.waitTime = waitTime;
		this.bag = factory.makeBag(type);
	}

	public void put(ISurprise newSurprise) {
		this.bag.put(newSurprise);
	}

	public void put(IBag surprises) {
		this.bag.put(surprises);
	}

	public void give() {
		this.bag.takeOut().enjoy();
		this.giveWithPassion();
	}

	public void giveAll() {
		while(!this.bag.isEmpty()) {
			this.bag.takeOut().enjoy();
			this.giveWithPassion();
			try {
				TimeUnit.SECONDS.sleep(this.waitTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	protected abstract void giveWithPassion();

}
