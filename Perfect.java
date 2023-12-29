/**
 *  Gets a command-line argument (int), and checks if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int userInput = Integer.parseInt(args[0]);
		int sum = 0;
		boolean isPerfect = false;
		String answer = " = ";
		String numStr = "";
		for (int i = 1; i < userInput; i++) {
			if (userInput % i == 0) {
				sum += i;
				// Convert the divisor to str and concatinate
				numStr = Integer.toString(i);
				answer = (answer + numStr + " + ");
			}
		}
		// Remove the " +" of the end
		answer = answer.substring(0, answer.length() - 3);
		if (sum == userInput) {
			isPerfect = true;
			System.out.println(userInput + " is a perfect number since " + userInput +
				answer);
		} else {
			System.out.println(userInput + " is not a perfect number");
		}
		// int sum += i if divisor, in for stop i++ before reaching the number
		// check if sum == number
	}
}
