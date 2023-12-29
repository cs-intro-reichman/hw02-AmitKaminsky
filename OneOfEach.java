
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int countChildren = 1;
		boolean isOneOfEach = false;
		char firstChild = (Math.random() > 0.5) ? 'b' : 'g';
		char child = firstChild;
		char prevChild = child;
		System.out.print(firstChild + " ");
		while (!isOneOfEach) {
			child = Math.random() > 0.5 ? 'b' : 'g';
			if (child != prevChild) {
				isOneOfEach = true;
			}
			countChildren += 1;
			// Print if g or b
			System.out.print(child + " ");
		}	
		System.out.println("\nYou made it... and you now have " +
		   					countChildren + " children.");
	}
}
