package programcreek.ArraysStrings;

/**
 * 
 * @author kartik Group an array of integers, group the numbers into even and odd i.e. rearrange the array in
 *         place into even and odd
 */

public class GroupNumbers {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] res = new int[arr.length];
		res = oddEvenGroup(arr);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

	private static int[] oddEvenGroup(int[] arr) {

		int leftPtr = 0;
		int rightPtr = arr.length - 1;

		while (leftPtr <= rightPtr) {
			if (arr[rightPtr] % 2 != 0) {
				swap(arr,rightPtr,leftPtr);
				leftPtr++;
			} else {
				rightPtr--;
			}
		}
		return arr;
	}
	private static void swap(int[] array, int rightIdx, int leftIdx) {
		int temp = array[leftIdx];
		array[leftIdx] = array[rightIdx];
		array[rightIdx] = temp;
	}

}
