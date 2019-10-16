package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 * Program to print all triplets whose sum is equal to 0
 */

import java.util.Arrays;
import java.util.HashSet;

public class ThreeSum {

	public static void main(String[] args) {
		int[] arr = {10, 3, -4, 1, -6, 9};
		String res[];
		res = findZeroSum(arr);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}

	private static String[] findZeroSum(int[] arr) {
        HashSet<String> set = new HashSet<String>();
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int curr = arr[i];      
            int needSum = -1 * curr;
            int leftPtr = i+1;
            int rightPtr = n-1;
            while(leftPtr < rightPtr){
                int sum = arr[leftPtr] + arr[rightPtr];
                if(sum == needSum){
                    if(!set.contains(curr + "," + arr[leftPtr] + "," + arr[rightPtr])){
                        set.add(curr + "," + arr[leftPtr] + "," + arr[rightPtr]);
                    }
                    leftPtr++;
                }else if( sum > needSum){
                    rightPtr--;
                }else{
                    leftPtr++;
                }
            }           
        }
        return set.toArray(new String[set.size()]);
    }
}
