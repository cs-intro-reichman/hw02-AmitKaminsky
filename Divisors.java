/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int userInt = Integer.parseInt(args[0]);
		/*
  			#feedback:
     			You didn't had to cover cases for negative numbers.
			However, this implemantation is not right for negative numbers, since for any negative x = n * m
			you should add whole these divisors: n, m, -n, -m since (-n)*(-m) = n * m = x
   			In addition, you could do it with one loop without seperating these cases - but it might be more complex.
		*/
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
