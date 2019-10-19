package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 * Program to print all the permutations of the given distinct integers
 */

import java.util.*;

public class PermutationDistInt {

	public static void main(String[] args) {
		String str = "123";
		ArrayList<String> ans = new ArrayList<String>();
		String slate = "";
		helper(str, 0, slate, ans);
		int idx = 0;
		String res[] = new String[ans.size()];
		for (String x : ans) {
			res[idx] = x;
			idx++;
		}
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

	private static void helper(String str, int i, String slate, ArrayList<String> ans) {
		if (i == str.length()) {
			ans.add(slate);
			return;
		} else {
			for (int j = i; j < str.length(); j++) {
				str = swap(str, i, j);
				helper(str, i + 1, slate + str.charAt(i), ans);
				str = swap(str, i, j);
			}
		}
	}

	private static String swap(String str, int i, int j) {
		char[] arr = str.toCharArray();
		char temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return new String(arr);
	}
}
