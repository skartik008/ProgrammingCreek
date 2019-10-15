package programcreek.ArraysStrings;

import java.util.HashSet;

/**
 * 
 * @author kartik
 * Program to count the number of jewels in a given array of stones
 */


public class JewelsAndStones {

	public static void main(String[] args) {
		String jewels = "zb";
		String stones = "ZbZbzz";

		int count;
		count = jewelsCount(jewels, stones);
		System.out.println(count);
	}

	private static int jewelsCount(String jewels, String stones) {
		int result = 0;
		HashSet<Character> set = new HashSet<Character>();

		for (int i = 0; i < jewels.length(); i++) {
			if (!set.contains(jewels.charAt(i))) {
				set.add(jewels.charAt(i));
			}
		}
		for (int j = 0; j < stones.length(); j++) {
			if (set.contains(stones.charAt(j))) {
				result++;
			}
		}

		return result;
	}

}
