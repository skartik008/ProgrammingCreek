package programcreek.DynamicProgramming;

/**
 * 
 * @author kartik
 * Program to find the longest palindromic substring in a given string
 *
 */

public class LongestPalindromicSubstring {
	
	public static void main(String[] args) {
		String input = "forgeeksskeegfor";
		System.out.println("Length of the longest palindromic substring is: " + loPalStr(input));
	}
	
	private static int loPalStr(String input) {
		// TODO Auto-generated method stub
		int inputLength = input.length();
		boolean[][] matrix = new boolean[inputLength][inputLength];
		
		int max = 1;
		
		for(int i=0;i<inputLength;i++) {
			matrix[i][i] = true;
		}
		int start = 0;
		for(int i=0;i<inputLength-1;i++) {
			if(input.charAt(i) == input.charAt(i+1)) {
				matrix[i][i+1] = true;
				start = i;
				max = 2;
			}
		}
		
		for(int i=3;i<=inputLength;i++) {
			for(int j=0;j<inputLength-i+1;j++) {
				int k = j+i-1;
				if(matrix[j+1][k-1] && input.charAt(j) == input.charAt(k)) {
					matrix[j][k] = true;
					if( i > max) {
						start = j;
						max = i;
					}
				}
			}
		}
		printSubString(input,start,start+max);
		return max;
	}

	private static void printSubString(String input, int start, int end) {
		System.out.println(input.substring(start, end));
		
	}

}

