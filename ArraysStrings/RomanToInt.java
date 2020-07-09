package programcreek.ArraysStrings;

/*
 * author: Kartik
 * Program to convert Roman numerals to Decimal i.e. Integer number
 */

import java.util.Map;

public class RomanToInt {

	public static void main(String[] args) {
		String roman = "LIX";
		int num = romanToInteger(roman);
		System.out.println(num);

	}

	private static int romanToInteger(String s) {
		Map<Character, Integer> map = Map.of('I',1, 'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000);
		int sum = map.get(s.charAt(s.length()-1));
		for(int i=s.length()-2;i>=0;i--) {
			if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
				sum -= map.get(s.charAt(i));
			}else {
				sum += map.get(s.charAt(i));
			}
		}
		return sum;
	}

}
