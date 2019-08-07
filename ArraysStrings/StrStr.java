package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 * Program to do a substring search in a string and return all the indices where it occurs
 */

import java.util.ArrayList;

public class StrStr {

	public static void main(String[] args) {
		String hayStack = "bbbaaabbbcdebbbbbdef";
		String needle = "bbb";
		ArrayList<Integer> res = new ArrayList<Integer>();
		res = hayStackNeedle(hayStack, needle);
		System.out.println(res.toString());
	}

	private static ArrayList<Integer> hayStackNeedle(String hayStack, String needle) {

		if (hayStack == null || needle == null || hayStack.length() < needle.length() || hayStack.length() < 1
				|| needle.length() < 1) {
			throw new IllegalArgumentException("Invalid input");
		}

		ArrayList<Integer> result = new ArrayList<Integer>();
		int hayLen = hayStack.length();
		int neeLen = needle.length();
		boolean match = true;
		for (int i = 0; i < hayLen - neeLen; i++) {
			if (hayStack.charAt(i) == needle.charAt(0)) {
				for (int j = 1; j < neeLen; j++) {
					if (hayStack.charAt(i + j) != needle.charAt(j)) {
						match = false;
					}
				}
				if (match) {
					result.add(i);
				} else {
					match = true;
				}
			}
		}
		return result;
	}
}
