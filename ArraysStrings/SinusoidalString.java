package programcreek.ArraysStrings;

/*
 * author: Kartik
 * Write a string in sinusodial form
 */

public class SinusoidalString {

	public static void main(String[] args) {
		String input = "Hello World";
		String result = snakeString(input);
		System.out.println(result);

	}

	private static String snakeString(String input) {
		StringBuilder result = new StringBuilder();
		for(int i=1;i<input.length();i+=4) {
			result.append(input.charAt(i));
		}
		for(int i=0;i<input.length();i+=2) {
			result.append(input.charAt(i));
		}
		for(int i=3;i<input.length();i+=4) {
			result.append(input.charAt(i));
		}
		return result.toString();
	}

}
