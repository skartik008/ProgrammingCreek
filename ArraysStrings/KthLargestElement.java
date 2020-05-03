package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 * Program to return the Kth largest element in an unsorted array
 */

import java.util.PriorityQueue;

public class KthLargestElement {

	public static void main(String[] args) {
		int[] arr = {3,2,1,5,4,6,7};
		int k = 2;
		int result = findKthLargest(arr,k);
		System.out.println(result);

	}

	private static int findKthLargest(int[] arr, int k) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
		for(int i=0;i<arr.length;i++) {
			q.offer(arr[i]);
			if(q.size() > k) {
				q.poll();
			}
		}	
		return q.peek();
	}

}
