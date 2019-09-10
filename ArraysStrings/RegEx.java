package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 * Program to do regular expression matching
 */

public class RegEx {

	public static void main(String[] args) {
		String str = "aab";
		String exp = "c*a*b";
		Boolean result;
		result = isMatch(str, exp);
		System.out.println(result);
	}

	private static Boolean isMatch(String str, String exp) {
		if (exp.length() == 0) {
			return str.length() == 0;
		}
		if (exp.length() == 1) {
			if (str.length() < 1) {
				return false;
			} else if ((exp.charAt(0) != str.charAt(0)) && (exp.charAt(0) != '.')) {
				return false;
			} else {
				return isMatch(str.substring(1), exp.substring(1));
			}
		}
		if (exp.charAt(1) != '*') {
			if (str.length() < 1) {
				return false;
			} else if ((exp.charAt(0) != str.charAt(0)) && (exp.charAt(0) != '.')) {
				return false;
			} else {
				return isMatch(str.substring(1), exp.substring(1));
			}
		} else {
			if (isMatch(str, exp.substring(2))) {
				return true;
			}
			int i = 0;
			while (i < str.length() && (str.charAt(i) == exp.charAt(0) || exp.charAt(0) == '.')) {
				if (isMatch(str.substring(i + 1), exp.substring(2))) {
					return true;
				}
				i++;
			}
		}
		return false;
	}
}
