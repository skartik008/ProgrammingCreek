package programcreek.BitManipulation;

/**
 * 
 * @author kartik
 * Program to find the unique number in the given array
 */

public class UniqueIDs {

	public static void main(String[] args) {
		int[] input = { 2, 5, 4, 8, 6, 3, 1, 4, 2, 3, 6, 5, 1 };
		int uniqueId = findUniqueId(input);
		System.out.println(uniqueId);
	}

	private static int findUniqueId(int[] input) {
		int uniqueId = 0;
		for (int i : input) {
			uniqueId ^= i;
		}
		return uniqueId;
	}

}
