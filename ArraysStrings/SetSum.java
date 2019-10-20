package programcreek.ArraysStrings;

/**
 * @author kartik
 *  Given an array of numbers and a target sum, return whether a subset can have the target sum
 */

import java.util.ArrayList;

public class SetSum {

	public static void main(String[] args) {
		long arr[] = { 1, 1 };
		long k = 0;
		subsetSum(arr, k);
	}

	private static void subsetSum(long arr[], long k) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		long sum = 0;
		ArrayList<Long> slate = new ArrayList<Long>();
		helper(arr, k, 0, sum, res, slate);
		System.out.println(res.size() > 0);
	}

	private static void helper(long arr[], long k, int pos, long sum, ArrayList<Integer> res, ArrayList<Long> slate) {
		if (sum == k && slate.size() > 0) {
			res.add(pos);
			return;
		}
		if (pos == arr.length) {
			return;
		}
		helper(arr, k, pos + 1, sum, res, slate);
		slate.add(arr[pos]);
		helper(arr, k, pos + 1, sum + arr[pos], res, slate);
	}

}
