package programcreek.ArraysStrings;

/**
 * @author kartik
 * Program to generate palindromic decompositions of a string
 */

import java.util.ArrayList;

public class PalindromicDecompositionString {

	public static void main(String[] args) {
		String str = "abracadabra";
		generate_palindromic_decompositions(str);
	}

	private static void generate_palindromic_decompositions(String str) {
		ArrayList<String> arr = new ArrayList<String>();
		int n = str.length();
		helper(arr, str, 0, n, "");
		String[] ans = GetStringArray(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

	private static void helper(ArrayList<String> arr, String str, int pos, int n, String curr_string) {
		if (pos == n) {
			arr.add(curr_string);
			return;
		}
		for (int i = pos; i < n; i++) {
			if (isPalindrome(str, pos, i)) {
				if (pos == 0) {
					helper(arr, str, i + 1, n, str.substring(pos, i+ 1));
				} else {
					helper(arr, str, i + 1, n, curr_string + '|' + str.substring(pos, i+1));
				}
			}
		}
	}

	private static boolean isPalindrome(String str, int l, int r) {
		while (l < r) {
			if (str.charAt(l++) != str.charAt(r--)) {
				return false;
			}
		}
		return true;
	}

	private static String[] GetStringArray(ArrayList<String> res) {
		String str[] = new String[res.size()];
		for (int i = 0; i < res.size(); i++) {
			str[i] = res.get(i);
		}
		return str;
	}
}
