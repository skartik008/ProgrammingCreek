package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 * Given an unsorted array of integers, find the element of rank 'k' in it i.e. kth smallest element 
 */

import java.util.*;

public class RankK {

	public static void main(String[] args) {
		int[] arr = { 7, 1, 3, 21, 10, 8, 27, 28, 22 };
		int rank = 2;
		int res = findElemRankK(arr, rank, 0, arr.length - 1);
		System.out.println(res);
	}

	private static int findElemRankK(int[] arr, int rank, int i, int j) {

		if (rank > j + 1 || rank < 0) {
			System.out.println("Not applicable");
			return -1;
		}

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		while (i <= j) {
			queue.add(arr[i]);
			i++;
		}
		int idx = 0;
		while (idx < rank -1) {
			queue.poll();
			idx++;
		}
		return queue.peek();
	}

}
