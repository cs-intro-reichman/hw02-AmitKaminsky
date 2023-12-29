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
		boolean isInputEven = userInput.length() % 2 == 0;
		char mid = isInputEven ? 
			userInput.charAt((int) ((userInput.length() / 2) - 0.5)) : userInput.charAt(userInput.length() / 2);
		System.out.println("\nThe middle character is " + mid);
	}
}