package programcreek.ArraysStrings;

/*
 * @author: Kartik 
 * Program to reverse the words in a string
 */

public class ReverseWords {

	public static void main(String[] args) {
		String str = "Alice likes Bob";
		String result = reverseWords(str.toCharArray());
		System.out.println(result);
	}

	public static String reverseWords(char[] input) {
		int n = input.length;
		reverse(input, 0, n - 1);

		int start = 0, end = 0;
		while (start < n) {
			while (start < end || start < n && input[start] == ' ') {
				start++;
			}
			while (end < start || end < n && input[end] != ' ') {
				end++;
			}
			reverse(input,start,end-1);
		}
		String res = solution(input);
		return res;
	}
	private static void reverse(char[] arr, int start, int end) {
		while(start < end) {
			char tmp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = tmp;
		}
	}
	private static String solution(char[] input) {
		StringBuilder result = new StringBuilder();
		for(int j=0;j<input.length;j++) {
			result.append(input[j]);
		}
		return result.toString();
	}
}
