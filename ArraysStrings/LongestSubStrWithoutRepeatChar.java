package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 *	Program to find the length of the longest sub string without repeating characters
*/

import java.util.HashSet;

public class LongestSubStrWithoutRepeatChar {

	public static void main(String[] args) {
		String str = "pwwke";
		int res = lenSubStr(str);
		System.out.println(res);
	}

	private static int lenSubStr(String str) {
		if (str.length() < 1) {
			return 0;
		}
		int len = 0, idx = 0, count = 0;
		HashSet<Character> set = new HashSet<Character>();
		while (idx < str.length()) {
			if (!set.contains(str.charAt(idx))) {
				set.add(str.charAt(idx));
				count++;
				idx++;
				if (count >= len) {
					len = count;
				}
			} else {
				set.clear();
				if (count >= len) {
					len = count;
				}
				count = 0;
			}
		}

		return len;
	}

}
