package programcreek.ArraysStrings;

/*
 * @author: Kartik 
 * 
 * Given an array A of N integers, returns the smallest positive integer that does not occur in A.
 */

import java.util.*;

public class minInteger {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 6, 4, 1, 2 };
		int ans = helper(arr);
		System.out.println(ans);

	}

	public static int helper(int[] A) {
		int len = A.length;
		if (len < 1) {
			return 1;
		} else if (len == 1) {
			if (A[0] != 1) {
				return 1;
			} else {
				return 2;
			}
		}
		Arrays.sort(A);
		if (A[len - 1] < 1) {
			return 1;
		}
		int idx = 0;
		while (A[idx] < 1) {
			idx++;
		}
		if (A[idx] > 1) {
			return 1;
		}
		for (int i = idx; i < len - 1; i++) {
			if ((A[i + 1] - A[i]) > 1) {
				return A[i] + 1;
			}
		}
		return A[len - 1] + 1;
	}
}
