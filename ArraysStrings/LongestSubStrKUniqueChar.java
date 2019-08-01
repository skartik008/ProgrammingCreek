package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 * Program to find the longest substring which contains 'k' unique characters
 */

import java.util.HashMap;

public class LongestSubStrKUniqueChar {

	public static void main(String[] args) {
		String input = "abcadcacacaca";
		int uniqueChars = 3;
		int result = lengthLongest(input,uniqueChars);
		System.out.println(result);

	}

	private static int lengthLongest(String str, int k) {
		
		if (str.length() < 1 || str == null) {
			return -1;
		}
		int result = 0;
		int i = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int j = 0; j < str.length(); j++) {
			char c = str.charAt(j);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

			if (map.size() <= k) {
				result = Math.max(result, j - i + 1);
			} else {
				while (map.size() > k) {
					char l = str.charAt(i);
					int count = map.get(l);
					if (count == 1) {
						map.remove(l);
					} else {
						map.put(l, map.get(l) - 1);
					}
					i++;
				}
			}

		}

		return result;
	}

}
