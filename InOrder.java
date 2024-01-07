/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int num = -1;
		int random = (int) (Math.random() * 10);
		// #feedback: great use of do-while loop!
		do {
			System.out.print(random + " ");
			num = random;
			random = (int) (Math.random() * 10);
		} while (random >= num);
	}
}
