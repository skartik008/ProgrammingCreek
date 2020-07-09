package programcreek.ArraysStrings;

/*
 * @author: Kartik
 * Given a number and two bases, convert one into another
 */

public class BaseConversion {

	public static void main(String[] args) {
		String numAsString = "10";
		int base1 = 10;
		int base2 = 16;
		String result = convertBase(numAsString,base1, base2);
		System.out.println(result);
	}

	public static String convertBase(String numAsString, int b1, int b2) {
		boolean isNegative = numAsString.startsWith("-");
		int numAsInt = numAsString.substring(isNegative ? 1: 0)
				.chars()
				.reduce(0,
						(x,c)
							-> x * b1 + 
							(Character.isDigit(c)? c - '0' : c - 'A' + 10));
		return (isNegative ? "-" : "") + 
				(numAsInt == 0? "0" : constructFromBase(numAsInt, b2));
	}
	private static String constructFromBase(int numAsInt, int base) {
		return numAsInt == 0
				? "" 
				: constructFromBase(numAsInt / base, base) +
				   (char)(numAsInt % base >= 10 ? 'A' + numAsInt % base - 10
						   					: '0' + numAsInt % base);
	}
}
