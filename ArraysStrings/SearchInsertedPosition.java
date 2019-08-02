package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 * Program to return the index if found otherwise insert position of an element in a sorted array
 */
public class SearchInsertedPosition {

	public static void main(String[] args) {
		int[] input = { 1, 3, 5, 6 };
		int target = 2;
		int pos = insertPosition(input, target);
		System.out.println(pos);
	}

	private static int insertPosition(int[] input, int target) {
		int i = 0;
		int j = input.length - 1;
		while (i <= j) {
			int mid = (i + j) / 2;
			if (target > input[mid]) {
				i = mid + 1;
			} else if (target < input[mid]) {
				j = mid - 1;
			} else {
				return mid;
			}
		}
		return i;
	}

}
