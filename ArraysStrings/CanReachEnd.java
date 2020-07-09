package programcreek.ArraysStrings;


/*
 * @author: Kartik
 * Program to find whether given an array and jumps, can reach the end of the array 
 */


public class CanReachEnd {

	public static void main(String[] args) {
		
		int[] arr = {3,3,1,0,2,0,1};
		Boolean result = canReachEnd(arr);
		System.out.println(result);
	}

	private static Boolean canReachEnd(int[] arr) {
		int furthestReachedSoFar = 0, lastIdx = arr.length -1;
		for(int i = 0;i <= furthestReachedSoFar && furthestReachedSoFar < lastIdx; ++i) {
			furthestReachedSoFar = Math.max(furthestReachedSoFar, i+arr[i]);
		}
		return furthestReachedSoFar >= lastIdx;
	}

}
