/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String userInput = args[0];
		for (int i = userInput.length() - 1; i >= 0; i--) {
			System.out.print(userInput.charAt(i));
		}
		// #feedback: why do you need seperate even\odd cases? with integers 7/2 = 3 = 6/2
		char mid = userInput.charAt(userInput.length() / 2);
		System.out.println("\nThe middle character is " + mid);
	}
}
