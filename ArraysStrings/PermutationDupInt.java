package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 * Program to print all the distinct permutations of the given integers with duplicates
 */

import java.util.*;

public class PermutationDupInt {

	public static void main(String[] args) {
		String str = "121";
		generatePermDup(str);
	}

	private static void generatePermDup(String str) {
		ArrayList<String> ans = new ArrayList<String>();
		String slate = "";
		helper(str, 0, slate, ans);
		int idx = 0;
		String res[] = new String[ans.size()];
		for (String x : ans) {
			res[idx] = x;
			idx++;
		}
		System.out.println(Arrays.toString(res));
	}

	private static void helper(String str, int i, String slate, ArrayList<String> ans) {
		HashSet<Character> set = new HashSet<Character>();
		if (i == str.length()) {
			ans.add(slate);
			return;
		} else {
			for (int j = i; j < str.length(); j++) {
				if (set.contains(str.charAt(j))) {
					continue;
				}
				set.add(str.charAt(j));
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
