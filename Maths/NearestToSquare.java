package programcreek.Maths;

/**
 * 
 * @author kartik
 * Program to return the number who's square is closest to the given number i.e. difference between the given number and the returned numbers is the smallest
 *
 */

public class NearestToSquare {

	public static void main(String[] args) {
		int number = 81;
		int result = helper(number);
		System.out.println(result);
	}

	private static int helper(int number) {
		if (number < 1) {
			return 0;
		} else if (number == 1) {
			return 1;
		}
		for (int i = 1; i < number / 2; i++) {
			int square = i * i;
			if (square == number) {
				return i;
			} else if (square > number) {
				int prevNumSquare = (i - 1) * (i - 1);
				int diff1 = square - number;
				int diff2 = number - prevNumSquare;
				if(diff1 > diff2 ) {
					return i-1;
				}else {
					return i;
				}
			}
		}
		return -1;
	}
}
