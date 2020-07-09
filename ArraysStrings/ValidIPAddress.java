package programcreek.ArraysStrings;

/* 
 * author: Kartik
 * Program to print all the valid IP addresses given a string of IP address without the separator
 */

import java.util.ArrayList;

public class ValidIPAddress {

	public static void main(String[] args) {
		String input = "19216811";
		ArrayList<String> result = new ArrayList<>();
		result = getValidIPAddress(input);
		printResult(result);
	}

	private static void printResult(ArrayList<String> result) {
		int len = result.size();
		for(int i=0;i<len;i++) {
			System.out.println(result.get(i));
		}
	}

	private static ArrayList<String> getValidIPAddress(String s) {
		ArrayList<String> res = new ArrayList<>();
		for(int i=1;i<4 && i<s.length();i++) {
			final String first = s.substring(0,i);
			if(isValidPart(first)) {
				for(int j=1;i+j<s.length() && j<4;j++) {
					final String second = s.substring(i,i+j);
					if(isValidPart(second)) {
						for(int k = 1;i+j+k<s.length() && k<4;k++) {
							final String third = s.substring(i+j,i+j+k);
							final String fourth = s.substring(i+j+k);
							if(isValidPart(third) && (isValidPart(fourth))) {
								res.add(first + "." + second+ "."+third+ "." + fourth);
							}
						}
					}
				}
			}
		}
		return res;
	}

	private static boolean isValidPart(String str) {
		if(str.length() > 3) {
			return false;
		}
		if(str.startsWith("0") && str.length() > 1) {
			return false;
		}
		int val = Integer.parseInt(str);
		return val <=255 && val >=0;
	}

}
