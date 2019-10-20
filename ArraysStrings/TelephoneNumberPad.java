package programcreek.ArraysStrings;

/**
 * @author kartik
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TelephoneNumberPad {

	public static void main(String[] args) {
		String numPad = "23";
		numberPad(numPad);
	}

	private static void numberPad(String numPad) {
		ArrayList<String> ans = new ArrayList<String>();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("2", "abc");
		map.put("3", "def");
		map.put("4", "ghi");
		map.put("5", "jkl");
		map.put("6", "mno");
		map.put("7", "pqrs");
		map.put("8", "tuv");
		map.put("9", "wxyz");
		String slate = "";
		helper(numPad, 0, slate, ans, map);
		int idx = 0;
		String res[] = new String[ans.size()];
		for (String x : ans) {
			res[idx] = x;
			idx++;
		}
		System.out.println(Arrays.toString(res));
	}

	private static void helper(String numPad, int pos, String slate, ArrayList<String> ans,
			HashMap<String, String> map) {

		if (pos == numPad.length()) {
			ans.add(slate);
			return;
		}
		String digit = numPad.substring(pos, pos + 1);
		String letters = map.get(digit);
		for (int i = 0; i < letters.length(); i++) {
			String alpha = letters.substring(i, i + 1);
			helper(numPad, pos + 1, slate + alpha, ans, map);
		}

	}

}
