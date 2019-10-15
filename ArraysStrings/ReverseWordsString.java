package programcreek.ArraysStrings;

/**
 * 
 * @author kartik Program to reverse words in a string
 */

public class ReverseWordsString {

	public static void main(String[] args) {
		String str = "string a in words reverse to Program";
		System.out.println(reverseWords(str));
	}

	private static String reverseWords(String str) {
		StringBuilder result = new StringBuilder();
		int i = str.length() - 1;
		int start, end = i + 1;
		while (i >= 0) {
			if (str.charAt(i) == ' ') {
				start = i + 1;
				while (start != end) {
					result.append(str.charAt(start++));
				}
				result.append(' ');
				end = i;
			}
			i--;
		}
		start = 0;
		while (start != end) {
			result.append(str.charAt(start++));
		}
		return result.toString();
	}

}
