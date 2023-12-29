/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int userInt = Integer.parseInt(args[0]);
		if (userInt > 0) {
			for(int i = 1; i <= userInt; i++) {
				if (userInt % i == 0) {
					System.out.println(i); }
			}
		} else if (userInt < 0) {
			for(int i = -1; i >= userInt; i--) {
				if (userInt % i == 0) {
					System.out.println(i);
				}
			}
		} else {
			System.out.println(userInt);
		}
	}
}
