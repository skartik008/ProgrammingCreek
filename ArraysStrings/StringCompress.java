package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 *
 *         Program to compress a string
 */

public class StringCompress {

	public static void main(String[] args) {
		String str = "aaaaaaaaaaaaaaaaabcaa";
		String result = compress(str);
		System.out.println(result);
	}

	private static String compress(String str) {
		StringBuilder res = new StringBuilder();
		int count = 1;
		res.append(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				count++;
			} else {
				res.append(count);
				res.append(str.charAt(i));
				count = 1;
			}
		}
		res.append(count);
		return res.toString();
	}
}
