package surprises;

import java.util.Random;

public class FortuneCookie implements ISurprise {
	//one of the three possible surprises. offers a fortune cookie with a random quote.
	
	private String message;
	private static Random random = new Random();
	private static final String[] wisdom = {
			"Take out the fortune before you eat the cookie. - Author: Dave Barry",
			"The final act of business judgment is intuitive. - Author: Alfred P. Sloan",
			"Everybody, even those that don't like Chinese food, knew that you had to eat the cookie for the fortune to come true. And so he did. - Author: Justin Swapp",
			"Love of action is not industry. - Author: Seneca The Younger",
			"He digs out a fortune cookie fortune from his mouth, as if his mouth has a pocket. It says THE SIMPLEST ANSWER IS TO ACT. He hands it to me. I nod and put the fortune in my own mouth pocket. - Author: A.S. King",
			"Thought for the day: Twitter ... 140 character limit ... must be a great tool for fortune cookie writers ... - Author: E.A. Bucchianeri",
			"The more this guy talked, the more he sounded like a fortune cookie. - Author: Kelly Creagh",
			"A journey of 1000 miles begins with one step. - Author: Laozi",
			"o me there's no real difference between a fortune teller or a fortune cookie and any of the organized religions. They're all equally valid or invalid, really. And equally helpful. - Author: Woody Allen",
			"I just got a fortune cookie that says \"Turn off your computer and read a book\" which is odd because I'm WRITING a book ... on my computer! - Author: Meg Cabot",
			"Warning: fortune cookies don't care what happens to you. - Author: Mason Cooley",
			"Could this guy sound a little less like a fortune cookie on acid? - Author: Huntley Fitzpatrick",
			"Of all the thoughts we think, it's only those that actually manifest themselves that seem significant. But the thoughts just before the event are like the fortune in the cookie. The fortune's as random as the thought. - Nathan Harold - Author: Adam Ross",
			"Wealth can't buy heath, but heath can buy wealth. - Author: Henry David Thoreau",
			"Help someone when they're in trouble, and they'll remember you when they're in trouble again. - FORTUNE COOKIE - Author: Darynda Jones",
			"Most Americans don't know enough about basic economics to fill out one fortune cookie. - Author: Neal Boortz",
			"Successful salesman: someone who has found a cure for the common cold shoulder. - Author: Robert Orben",
			"I cannot read a fortune cookie without breaking down and crying. I am sensitive. - Author: Thom Yorke",
			"In the Fortune Cookie of Life, I don't want to be known as anonymous. - Author: Julie Eberhart Painter",
			"If we followed our own advice, we'd be successful. - Author: Fred Astaire",
			"Outward success alienates a man from himself. - Author: James T. Hill",
			"Fate will come looking for you. Don't bother hiding - Author: Lauren Bjorkman",
			"Happiness isn't a fortune in a cookie. It's deeper, wider, funnier, and more transporting than that. - Author: Elvis Costello",
			"Good places for aphorisms: in fortune cookies, on bumper stickers, and on banners flying over the Palace of Free Advice. - Author: Mason Cooley",
			"I tucked this thought inside me like a fortune into a cookie. - Author: Meg Howrey",
			"At the state dinner for Chinese President Hu Jintao, Hu opened a fortune cookie that said, 'You will lend us another trillion dollars.' - Author: Conan O'Brien",
			"What thought or message would you put in a fortune cookie? - Stop reading this. Eat the cookie and live your life. - Author: Veronica Roth",
			"Purpose, pattern, and people, the three P's at the heart of life. - Author: Charles Handy"};
	
	FortuneCookie(String message){
		this.message = message;
	}
	
	@Override
	public void enjoy() {
		System.out.println("You got a fortune cookie!");
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "[FortuneCookie] Message: " + this.message;
	}


	public static FortuneCookie generate() {
		FortuneCookie surprise = new FortuneCookie(wisdom[random.nextInt(wisdom.length - 1)]);
		return surprise;
	}

	

}
