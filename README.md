# OfferSurprises
One of the larger projects done by me. It uses several important principles - Inheritance, Abstract classes, Interfaces, Design Patters etc.

The projects focuses around the ISurprises Interface, which only contains the method enjoy().

Surprises:
Basically, we have 3 types of surprises, all of which extend the ISurprise interface. 
Each surprise can be generated via a specific method, and can be enjoyed (as in given to someone.

Each surprise has some specific functions:
the MinionToy has name, and each generated Minion has, in ascending order, one of the available names (via an ArrayList<String> of names)
the FortuneCookie has an inspirational quote, and when enjoyed, offers (randomly) one of the quotes (via an ArrayList<String> of quotes)
the Candy is of a specific type, and when enjoyed, offers a random quantity (up to 100) and a random type (via an ArrayList<String> of candy types)

the GatherSurprises class is a special class, not available to be instanced (via a private constructor) or inherited, whch generates either 1 random surprise (between the 3 available)
or a given N number of random surprises.

Bags:
We have different kind of surprise containers available. each type of container (Bags) implements the IBag interface, which offers a uniform set of methods.
The 3 available bags are RANDOM, FIFO & LIFO, where each bag handles the surprises according to it's type (LIFO, FIFO or randomly)

The bags can be created via the BagFactory class, which is basically a Singleton type class, which contains a method to create the 3 specific bags,
based on a String parameter. As such, we have a Factory Design Pattern as well, because each bag can only be one of the 3 given options.
The factory implements the IBagFactory method, a interface comparable to ISurprise, which only contains the makeBag(String type) function.

And, in the end, as surprises are to be shared, we have an abstract GiveSurprises class, which basically acts as a bag handler, allowing us to add or remove
surprises in our bags. The actual classes which are inherited only change the message given when a surprise is enjoyed

In the main method, there are several testing scenarios.
