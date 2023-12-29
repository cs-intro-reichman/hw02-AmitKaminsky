/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int boardSize = Integer.parseInt(args[0]);
		for (int i = 0; i < boardSize; i++) {	
			for (int j = 0; j < boardSize; j++) {
				if (i % 2 == 0) {
					System.out.print("* ");
				} else {
					System.out.print(" *");
				}
			}
			System.out.println("");
		}
	}
}
