package programcreek.arrays;

/**
 * 
 * @author kartik
 * Program to convert a string to integer
 */

public class StringToInteger {

	public static void main(String[] args) {
		
		String str = "  -2a76  ";
		int res = atoi(str);
		System.out.println(res);

	}

	private static int atoi(String str) {
		if(str == null || str.length() < 1) {
			return 0;
		}
		str = str.trim();
		int idx = 0;
		Boolean negative = false;
		if(str.charAt(0) == '-') {
			negative = true;
			idx++;
		}else if (str.charAt(0) == '+'){
			negative = false;
			idx++;
		}
		double num = 0;
		while (str.length() > idx && str.charAt(idx) > '0' && str.charAt(idx) < '9') {
			num = num * 10 + (str.charAt(idx) - '0');
			idx++;
		}
		if(negative) {
			num = -1 * num;
		}
		if(num > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		if(num < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		return (int)num;
	}

}
