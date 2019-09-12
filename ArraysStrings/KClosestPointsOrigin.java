package programcreek.ArraysStrings;

import java.util.Arrays;

/**
 * 
 * @author kartik Program to find the K Closest Points to Origin
 */

public class KClosestPointsOrigin {

	public static void main(String[] args) {
		int[][] inputArr = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
		int k = 2;
		int[][] result = kClosest(inputArr, k);
		System.out.println(Arrays.deepToString(result));
	}

	private static int[][] kClosest(int[][] points, int k) {
		int N = points.length;
		int[] dist = new int[N];
		for (int i = 0; i < N; i++) {
			dist[i] = distCalc(points[i]);
		}
		Arrays.sort(dist);
		int distK = dist[k - 1];

		int[][] ans = new int[k][2];

		int j = 0;
		for (int x = 0; x < N; x++) {
			if (distCalc(points[x]) <= distK) {
				ans[j++] = points[x];
			}
		}

		return ans;
	}

	private static int distCalc(int[] point) {
		return point[0] * point[0] + point[1] * point[1];
	}

}
