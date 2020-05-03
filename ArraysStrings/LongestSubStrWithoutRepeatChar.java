package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 *	Program to find the length of the longest sub string without repeating characters
*/

import java.util.HashSet;

public class LongestSubStrWithoutRepeatChar {

	public static void main(String[] args) {
		String str = "pwwawke";
		int res = lenSubStr(str);
		System.out.println(res);
	}

	private static int lenSubStr(String str) {
		if (str.length() < 1) {
			return 0;
		}
		int len = 1;
		int i =0;
		HashSet<Character> set = new HashSet<>();
		for(int j=0;j<str.length();j++) {
			if(!set.contains(str.charAt(j))) {
				set.add(str.charAt(j));
				len = Math.max(len, set.size());
			}else {
				while(i<j) {
					if(str.charAt(i) == str.charAt(j)) {
						i++;
						break;
					}
					set.remove(str.charAt(i));
					i++;
				}
			}
		}
		return len;
	}

}
