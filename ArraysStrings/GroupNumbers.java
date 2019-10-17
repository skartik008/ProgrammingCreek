package programcreek.ArraysStrings;

/**
 * 
 * @author kartik Group an array into evens and odds i.e. rearrange the array in
 *         place into even and odd
 */

public class GroupNumbers {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
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
			if (arr[rightPtr] % 2 == 0) {
				int temp = arr[rightPtr];
				arr[rightPtr] = arr[leftPtr];
				arr[leftPtr] = temp;
				leftPtr++;
			} else {
				rightPtr--;
			}
		}
		return arr;
	}

}
