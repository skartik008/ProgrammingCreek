package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 *	Program to determine whether two given strings are isomorphic
 */

import java.util.HashMap;

public class IsomorphicStrings {

	public static void main(String[] args) {
		String one = "egg";
		String two = "add";

		Boolean result = isomorphicCheck(one, two);
		System.out.println(result);
	}

	private static Boolean isomorphicCheck(String one, String two) {
		if (one.length() != two.length()) {
			return false;
		}
		HashMap<Character, Character> mapOne = new HashMap<Character, Character>();
		HashMap<Character, Character> mapTwo = new HashMap<Character, Character>();
		for (int i = 0; i < one.length(); i++) {
			char c1 = one.charAt(i);
			char c2 = two.charAt(i);
			if (mapOne.containsKey(c1)) {
				if (c2 != mapOne.get(c1)) {
					return false;
				}
			} else {
				if (mapTwo.containsKey(c2)) {
					return false;
				}
				mapOne.put(c1, c2);
				mapTwo.put(c2, c1);
			}
		}

		return true;
	}

}
