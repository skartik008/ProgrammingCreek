package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 *  Program to merge two sorted arrays into the first array
 */

public class MergeSortedArrays {

	public static void main(String[] args) {
		int[] arrOne = new int[10];
		int[] arrTwo = { 2, 4, 6, 8, 10 };
		arrOne[0] = 1;
		arrOne[1] = 3;
		arrOne[2] = 5;
		arrOne[3] = 7;
		arrOne[4] = 9;
		mergeArrays(arrOne, 5, arrTwo, 5);
	}

	private static void mergeArrays(int[] arrOne, int i, int[] arrTwo, int j) {

		while (i > 0 && j > 0) {
			if (arrOne[i - 1] > arrTwo[j - 1]) {
				arrOne[i + j - 1] = arrOne[i - 1];
				i--;
			} else {
				arrOne[i + j - 1] = arrTwo[j - 1];
				j--;
			}
		}
		while (j > 0) {
			arrOne[i + j - 1] = arrTwo[j - 1];
			j--;
		}
		for (int n = 0; n < arrOne.length; n++) {
			System.out.print(arrOne[n] + " ");
		}
	}
}
