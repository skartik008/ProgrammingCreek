package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 * Program to reverse the vowels in a string
 */

import java.util.HashSet;

public class ReverseVowelsString {

	public static void main(String[] args) {
		String str = "hello";
		String res = reverseVowels(str);
		System.out.println(res);
	}

	private static String reverseVowels(String str) {
		HashSet<Character> set = new HashSet<Character>();		
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		set.add('A');
		set.add('E');
		set.add('I');
		set.add('O');
		set.add('U');
		
		char[] arr = str.toCharArray();
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			
			if (!set.contains(arr[i])) {
				i++;
				continue;
			}
			if (!set.contains(arr[j])) {
				j--;
				continue;
			}
			char tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			i++;
			j--;
		}
		return new String(arr);
	}
}
