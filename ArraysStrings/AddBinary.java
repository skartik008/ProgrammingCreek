package programcreek.ArraysStrings;

/**
 * 
 * @author kartik Program to add two binary strings
 */

public class AddBinary {

	public static void main(String[] args) {
		String a = "1101", b = "100";
		String result;
		result = addBinary(a, b);
		System.out.println(result); 
	}

	private static String addBinary(String a, String b) {
		int i = a.length() - 1;
		int j = b.length() - 1;
		StringBuilder ans = new StringBuilder();
		
		int sum = 0;

		while (i >= 0 || j >= 0 || sum == 1) {
			sum += ((i >= 0) ? a.charAt(i) - '0' : 0);
			sum += ((j >= 0) ? b.charAt(j) - '0' : 0);
			ans.insert(0, (char) (sum % 2 + '0'));
			sum = sum / 2;
			i--;
			j--;

		}
		return ans.toString();
	}
}
