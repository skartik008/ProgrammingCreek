package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 * Program to find if a given string is a valid palindrome or not
 */

public class ValidPalindrome {

	public static void main(String[] args) {
		String str = "Red rum, sir, is murder";
		Boolean result = validPalindromeCheck(str);
		System.out.println(result);

	}

	private static Boolean validPalindromeCheck(String str) {
		if (str == null || str.length() < 1) {
			return false;
		}
		str = str.toLowerCase();
		int i = 0;
		str = str.replaceAll("[^a-z0-9]", "");
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}

		return true;
	}

}
