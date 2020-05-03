package programcreek.ArraysStrings;

/**
 * 
 * @author kartik Program to find the length of the last word in a given string
 */

public class LengthOfLastWord {

	public static void main(String[] args) {
		String str = "Kartik Siddhabathula";
		int res = lengthWord(str);
		System.out.println(res);
	}

	private static int lengthWord(String str) {
		if (str == null) {
			return 0;
		}
		str = str.trim();
		int i = str.length() - 1;
		int len = 0;
		while (i >= 0 && str.charAt(i) != ' ') {
			len++;
			i--;
		}
		return len;
	}
}
