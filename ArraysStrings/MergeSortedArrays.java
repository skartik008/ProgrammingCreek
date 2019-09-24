package programcreek.ArraysStrings;

/**
 * 
 * @author kartik Program to merge two sorted arrays into the first array
 */

public class MergeSortedArrays {

	public static void main(String[] args) {
		int len = 20;
		int halfLen = len/2;
		int[] arrOne = new int[len];
		int[] arrTwo = new int[halfLen];
		for (int i = 0; i < halfLen; i++) {
			arrOne[i] = i * 2 + 1;
			arrTwo[i] = i * 2 + 2;
		}
		mergeArrays(arrOne, halfLen, arrTwo, halfLen);
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
