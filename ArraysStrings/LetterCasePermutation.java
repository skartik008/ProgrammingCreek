package programcreek.ArraysStrings;

/**
 * @author kartik
 * Program to print all the permutations of letter case
 */

import java.util.ArrayList;

public class LetterCasePermutation {

	public static void main(String[] args) {
		String str = "a1b2";
		String slate = "";
		ArrayList<String> ans = new ArrayList<String>();
		int idx = 0;
		helper(str, 0, slate, ans);
		String res[] = new String[ans.size()];
		for (String s : ans) {
			res[idx] = s;
			idx++;
		}
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}

	private static void helper(String str, int i, String slate, ArrayList<String> ans) {

		if (i == str.length()) {
			ans.add(slate);
		}else {
			if(isDigit(str.charAt(i))) {
				helper(str,i+1,slate+str.charAt(i),ans);
			}else {
				helper(str,i+1,(slate+(makeUpperCase(str.charAt(i)))),ans);
				helper(str,i+1,(slate+(makeLowerCase(str.charAt(i)))),ans);
			}
		}
	}

	private static String makeLowerCase(char charAt) {
		char ch = Character.toLowerCase(charAt);
		return Character.toString(ch);
	}

	private static String makeUpperCase(char charAt) {
		char ch = Character.toUpperCase(charAt);
		return Character.toString(ch);
	}

	private static boolean isDigit(char ch) {
		int j = ch - '0';
		if(j > 0 && j < 10) {
			return true;
		}else {
			return false;
		}
	}

}
