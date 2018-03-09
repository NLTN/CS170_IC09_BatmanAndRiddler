/*
    Nguyen, Nguyen
    CS A170
    03/02/2018

    IC09_BatmanAndRiddler
*/

public class BatmanAndRiddler {

	public static void main(String[] args) {
		// Variables
		int d1, d2, d3, d4;
		
		for (int i = 1001; i <= 9999; i += 2) {
			d1 = i / 1000;
			d2 = i % 1000 / 100;
			d3 = i % 100 / 10;
			d4 = i % 10;

			if (are4DigitsDifferent(d1, d2, d3, d4) && d1 == d3 * 3 && (d1 + d2 + d3 + d4) == 27) {
				System.out.println("The Riddler intends to strike " + i + " Pennsylvania Avenue.");
				
				// Exit the loop
				break;
			}
		}
		
	}

	public static boolean are4DigitsDifferent(int d1, int d2, int d3, int d4) {
		return (d1 != d2 && d1 != d3 && d1 != d4 && d2 != d3 && d2 != d4 && d3 != d4);
	}

}
