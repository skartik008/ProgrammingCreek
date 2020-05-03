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

		int q = partition(arr, i, j);
		if(q == (rank - 1)) {
			return arr[q];
		}else if( q > (rank  - 1) ) {
			return findElemRankK(arr,rank,i,q-1);
		}else {
			return findElemRankK(arr,rank,q+1,j);
		}
	}
	
	private static int partition(int[] inputArray, int lo, int hi) {
		int pivot = inputArray[hi];
		int i = lo;
		for(int j=lo;j<hi;j++) {
			if(inputArray[j]< pivot) {
				int temp = inputArray[i];
				inputArray[i] = inputArray[j];
				inputArray[j] = temp;
				i=i+1;
			}
		}
		
		int tempvar= inputArray[i];
		inputArray[i] = inputArray[hi];
		inputArray[hi] = tempvar;
		
		return i;
	}
}
