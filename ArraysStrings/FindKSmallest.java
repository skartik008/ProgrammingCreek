package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 * Program to find kth smallest element in the array using quick select
 */

public class FindKSmallest {

	public static void main(String[] args) {
		int[] arr = { 7, 1, 3, 21, 10, 8, 27, 28, 22 };
		int rank = 8;
		int res = findKSmallest(arr, rank, 0, arr.length - 1);
		System.out.println(res);
	}

	private static int findKSmallest(int[] arr, int rank, int i, int j) {
		if (rank < 0 || rank > j + 1) {
			System.out.println("Rank range out of the array bounds");
			return -1;
		}
		int start = i;
		int end = j;
		int p = partition(arr, start, end);
		if (p == rank - 1) {
			return arr[p];
		} else if (p < rank) {
			return findKSmallest(arr, rank, p + 1, end);
		} else {
			return findKSmallest(arr, rank, start, p - 1);
		}
	}

	private static int partition(int[] inputArray, int lo, int hi) {
		int pivot = inputArray[hi];
		int i = lo;
		for (int j = lo; j < hi; j++) {
			if (inputArray[j] < pivot) {
				int temp = inputArray[i];
				inputArray[i] = inputArray[j];
				inputArray[j] = temp;
				i = i + 1;
			}
		}
		int tempvar = inputArray[i];
		inputArray[i] = inputArray[hi];
		inputArray[hi] = tempvar;

		return i;
	}
}
