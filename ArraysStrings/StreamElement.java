package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 *	Given an array find the top elements from the beginning of the array
 */
import java.util.*;

public class StreamElement {

	public static void main(String[] args) {
		int k = 3;
		int[] arr = { 3, 5, 7, 1, 9, 23, 53, 89, 3, 53 };
		int[] res = streamTopK(arr, k);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

	private static int[] streamTopK(int[] arr, int k) {

		if (k < 0 || k >= arr.length) {
			int[] result = { -1 };
			return result;
		}
		TreeSet<Integer> set = new TreeSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
			if (set.size() > k) {
				set.pollFirst();
			}
		}
		int[] res = new int[k];
		int idx = 0;
		for (int elem : set) {
			res[idx] = elem;
			idx++;
		}
		return res;
	}

}
