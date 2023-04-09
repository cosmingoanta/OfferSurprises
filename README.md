# OfferSurprises
One of the larger projects done by me. It uses several important Java/OOP principles - Inheritance, Abstractisation, Interfaces, Design Patterns etc.

The project focuses around the ISurprises Interface, which only contains the method enjoy(). We are basically creating the framework under which Surprises can be generated, stored, and then shared and enjoyed.

Surprises:
3 types of surprises are available, all of which extend the ISurprise interface. 

Each surprise has specific functions:
the MinionToy has a name, and each generated Minion takes, in order, one of the available names (via an ArrayList<String> of names)
the FortuneCookie offer an inspirational quote, and when enjoyed, offers (randomly) one of the quotes (via an ArrayList<String> of quotes)
the Candy is of a specific type, and when enjoyed offers a random quantity (up to 100) and a random type (via an ArrayList<String> of candy types)

the GatherSurprises class is a special class, not available to be instanced (by the use of a private constructor) or inherited, which generates either 1 random surprise (between the 3 available) or a given N number of random surprises.

Bags:
We have different kind of surprise containers available. Each type of container (Bag) implements the IBag interface, which offers a standard set of methods.
The 3 available bags are RANDOM, FIFO & LIFO, and each bag handles (adds/removes) the surprises according to it's type (LIFO, FIFO or randomly)

The bags can be created via the BagFactory class, which is Singleton type class, which also contains a dedicated method used to create 1 of the 3 specific bags,
based on a String parameter. As such, the class uses the Factory Design Pattern as well, because each bag can only be of one of the 3 given types (RANDOM, LIFO & FIFO).
The factory implements the IBagFactory method, a interface comparable to the ISurprise interface, which only contains the makeBag(String type) function.

And, in the end, as surprises are meant to be shared, we use an abstract GiveSurprises class, which basically acts as a bag handler, allowing us to add or remove
surprises in our bags. The actual classes which are inherited only change the message given when a surprise is enjoyed

In the main method, I implemented several basic testing scenarios.
