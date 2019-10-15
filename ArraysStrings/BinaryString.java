package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 * Program to given a length as input, print all the possible binary strings of that length
 */

public class BinaryString {

	public static void main(String[] args) {
		int input = 2;
		bsHelper("", input);
	}

	private static void bsHelper(String string, int input) {
		if (input == 0) {
			System.out.println(string);
		} else {
			bsHelper(string + '0', input - 1);
			bsHelper(string + '1', input - 1);
		}
	}
}
