package programcreek.Maths;

/**
 * 
 * @author kartik
 * Program to find a square root of a perfect square
 */


public class SquareRoot {

	public static void main(String[] args) {
		int input = 100;
		squareRt(input);
	}

	private static void squareRt(int input) {
		Boolean sqaure = false;
		if (input < 0) {
			System.out.println("Please enter a +ve number");
		} else {
			for (int i = 0; i < input / 2; i++) {
				if (i * i == input) {
					System.out.println("Square root of " + input + " is: " + i);
					sqaure = true;
					break;
				}
			}
			if (sqaure == false) {
				System.out.println("Not a perfect square");
			}
		}
	}
}
