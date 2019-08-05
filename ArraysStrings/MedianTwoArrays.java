package programcreek.ArraysStrings;

/**
 * 
 * @author kartik 
 * 
 * Program to find the median of two sorted arrays
 */

public class MedianTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = { 5, 8, 10 };
		int[] arr2 = { 2, 4 };
		double median = MedianSorted(arr1, arr2);
		System.out.println(median);
	}

	private static double MedianSorted(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		if (m > n) { // to ensure m<=n
			int[] temp = arr1;
			arr1 = arr2;
			arr2 = temp;
			int tmp = m;
			m = n;
			n = tmp;
		}
		int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
		while (iMin <= iMax) {
			int i = (iMin + iMax) / 2;
			int j = halfLen - i;
			if (i < iMax && arr2[j - 1] > arr1[i]) {
				iMin = i + 1; // i is too small
			} else if (i > iMin && arr1[i - 1] > arr2[j]) {
				iMax = i - 1; // i is too big
			} else { // i is perfect
				int maxLeft = 0;
				if (i == 0) {
					maxLeft = arr2[j - 1];
				} else if (j == 0) {
					maxLeft = arr1[i - 1];
				} else {
					maxLeft = Math.max(arr1[i - 1], arr2[j - 1]);
				}
				if ((m + n) % 2 == 1) {
					return maxLeft;
				}

				int minRight = 0;
				if (i == m) {
					minRight = arr2[j];
				} else if (j == n) {
					minRight = arr1[i];
				} else {
					minRight = Math.min(arr2[j], arr1[i]);
				}

				return (maxLeft + minRight) / 2.0;
			}
		}
		return 0.0;
	}

}
