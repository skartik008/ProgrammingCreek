package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 *	Program to return all the pairs of numbers that add up to a specific target
 */

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] input = {10,20,4,7,6,-4,-8,24,10};
		int target = 16;
		sumTarget(input,target);		
	}

	private static void sumTarget(int[] arr, int target) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			int diff = target - arr[i];
			if(!map.containsKey(diff)) {
				map.put(arr[i], i);
			}else {
				map.put(arr[i], i);
				System.out.println("{"+ arr[i]+","+diff+"}");
			}
		}
	}

}
