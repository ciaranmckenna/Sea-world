/**
 *
 */
package practicalTen;

/**
 * @author Ciaran
 * whale watcher class to test the whale class
 */
public class WhaleWatcher {

	/**
	 *
	 */
	public WhaleWatcher() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * main method to test the whale class
	 * @param args
	 */
	public static void main(String[] args) {

		Whale Right = new Whale ("Right", "Atlantic", 2001, 21, 16 );
		Whale Blue = new Whale ("Blue", "Pacific", 2001, 23, 16 );
		Whale Sperm = new Whale ("Sperm", "Atlantic", 1900, 20, 40 );
		Whale Humpback = new Whale ("Humpback", "Atlantic", 919, 13, 13 );
		Whale Heavy = new Whale ("Heavy", "Atlantic", 2000000, 3, 14 );


		Whale[] whales = {Right, Blue, Sperm, Humpback};

		//invoking methods
		displayAll(whales);
		atlanticSwimmers(whales, "Atlantic");
		fastestSwimmers(whales);
		averageLength(whales);
		heaviestWhale(whales);
	}

	/**
	 * method to display the information on whales
	 * @param whales
	 */
	public static void displayAll(Whale[] whales) {
		for (Whale whale : whales) {
			System.out.println(whale.toString());
		}
	}

	/**
	 * method to display whales that swim in the atlantic
	 * @param whales
	 */
	public static void atlanticSwimmers(Whale[] whales, String ocean) {
		for (Whale whale : whales) {
			if(whale.getMainOcean().equalsIgnoreCase(ocean)) {
				System.out.println("The " + whale.getName() + " whale swims in the atlantic.");
			}
		}
	}

	/**
	 * method to show the fastest swimmer(s)
	 */
	public static void fastestSwimmers(Whale[] whales) {

		//var to store the fastest swimmer
		int fastest = whales[0].getMaxSpeed();

		//finding the fastest swimmers through the foreach loop
		for (Whale whale : whales) {
			if(whale.getMaxSpeed() > fastest) {
				fastest = whale.getMaxSpeed();
			}

		}
		//matching the fastest swimming speeds with the whale names
		for (Whale whale : whales) {
			if (whale.getMaxSpeed() == fastest) {
				System.out.println("The fastest swimmer is the " + whale.getName() + " whale.");
			}
		}
	}

	/**
	 * method to calculate the average length of all the whales
	 *
	 */
	public static void averagelength(Whale[] whales) {

		// var to store the total weight
		double total = 0;

		for (int loop = 0; loop < whales.length; loop++) {
			total+=whales[loop].getLength();
		}
		System.out.printf("The average length of a whale is %.2f ", total/whales.length);
	}

	/**
	 * method to output the heaviest whale
	 */
	public static void heaviestWhale(Whale[] whales) {

		int heaviest = whales[0].getWeight();

		for (Whale whale : whales) {
			if(whale.getWeight() > heaviest ) {
				heaviest = whale.getWeight();
			}
		}

		// aligning the heaviest whale with their name
		for (Whale whale : whales) {
			if(whale.getWeight() == heaviest) {
				System.out.println("The heaviest whale(s) is " + whale.getName() + " whale.");
			}
		}
	}
}
