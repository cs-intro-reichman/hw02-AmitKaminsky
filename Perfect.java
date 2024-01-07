/**
 *  Gets a command-line argument (int), and checks if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		// #feedback: even though you mostly use very good names, userInput might be confusing especially when it's not a string...
		int userNumber = Integer.parseInt(args[0]);
		int sum = 0;
		// #feedback: you did not use this variable - why do we need it?
		String answer = " = ";
		String numStr = "";
		for (int i = 1; i < userNumber; i++) {
			if (userNumber % i == 0) {
				sum += i;
				// Convert the divisor to str and concatinate
				// #feedback: you could not do this conversion
				// #feedback: x += n is equivalent to x = x + n
				answer += i + " + ";
			}
		}
		// Remove the " +" of the end
		answer = answer.substring(0, answer.length() - 3);
		if (sum == userNumber) {
			System.out.println(userNumber + " is a perfect number since " + userNumber +
				answer);
		} else {
			System.out.println(userNumber + " is not a perfect number");
		}
	}
}
