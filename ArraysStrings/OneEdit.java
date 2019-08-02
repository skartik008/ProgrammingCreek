package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 * Program to check whether two strings are one edit distance
 */

public class OneEdit {

	public static void main(String[] args) {
		String strOne = "bold";
		String strTwo = "bald";
		Boolean result = oneEditCheck(strOne,strTwo);
		System.out.println(result);
	}

	private static Boolean oneEditCheck(String strOne, String strTwo) {
		Boolean res;
		int strLen1 = strOne.length();
		int strLen2 = strTwo.length();
		if(strLen1 <1 || strLen2 < 1 ) {
			return false;
		}
		int diffLen = Math.abs(strLen1-strLen2);
		if(diffLen > 1) {
			return false;
		}else {
			res = oneDiff(strOne,strTwo);
		}
		return res;
	}

	private static Boolean oneDiff(String strOne, String strTwo) {
		int count = 0;
		int l = strOne.length();
		int m = strTwo.length();
		int i=0,j=0;
		while(i <l && j<m) {
			if(strOne.charAt(i) == strTwo.charAt(j)) {
				i++;
				j++;
			}else {
				count++;
				if(count > 1) {
					return false;
				}
				i++;
				j++;
			}
		}
		if(i < l || j <m) {
			count++;
		}
		
		return count==1;
	}

}
