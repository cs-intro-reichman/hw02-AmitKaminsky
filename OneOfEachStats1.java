/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		// User inputs T - number of families to form (amount of runs)
		int T = Integer.parseInt(args[0]);
		int countChildrenPerRun = 1;
		double totalCount = 0; // How many children in all runs to calculate average
		boolean isOneOfEach = false; // Tool to break while
		char firstChild = (Math.random() > 0.5) ? 'b' : 'g';
		char child = firstChild;
		char prevChild = child; // Used to check is isOneOfEach
		int twoChilds = 0, threeChilds = 0, fourOrMoreChilds = 0; // Counts the families
		for (int t = 0; t < T; t++) {
			// The "while" counts how many children until at least
			// one of each gender.
			while (!isOneOfEach) {
				child = Math.random() > 0.5 ? 'b' : 'g';
				if (child != prevChild) {
					isOneOfEach = true;
				}
				countChildrenPerRun += 1;
				totalCount += countChildrenPerRun;
			}
			// We need to reset the counts and bool before the run and count families
			isOneOfEach = false;
			if (countChildrenPerRun == 2) twoChilds++;
			else if (countChildrenPerRun == 3) threeChilds++;
			else if (countChildrenPerRun > 3) fourOrMoreChilds++;
			countChildrenPerRun = 1;
		}
		double average =
			 (double) (fourOrMoreChilds * 4 + threeChilds * 3 + twoChilds * 2) / T;
		String mostCommon = "";
		if (twoChilds >= threeChilds && twoChilds >= fourOrMoreChilds) {
			mostCommon = "2";
		} else if (threeChilds >= twoChilds && threeChilds >= fourOrMoreChilds) {
			mostCommon = "3";
		} else {
			mostCommon = "4 or more";
		}
		System.out.println("Average: " + average +
							" children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChilds);
		System.out.println("Number of families with 3 children: " + threeChilds);
		System.out.println("Number of families with 4 or more children: " +
							fourOrMoreChilds);
		System.out.println("The most common number of children is " +
							mostCommon + ".");
	}
}