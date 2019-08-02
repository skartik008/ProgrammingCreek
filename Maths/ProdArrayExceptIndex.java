package programcreek.Maths;

/**
 * 
 * @author kartik
 * Program to return an array such that the output array is a product of all numbers except the number in the self index
 */

public class ProdArrayExceptIndex {

	public static void main(String[] args) {
		int[] arr = { 10, 2, -3, 5, -5, 6, 4 };
		int[] res = prod(arr);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

	private static int[] prod(int[] arr) {
		int zeroCount = 0, prod = 1, zeroProd = 1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0) {
				zeroCount++;
				zeroProd *= 1;
				prod = 0;
			}else {
				zeroProd*=arr[i];
				prod*=arr[i];
			}
		}
		for(int j=0;j<arr.length;j++) {
			if(zeroCount > 1) {
				arr[j] = 0;
			}else if(zeroCount == 1) {
				if(arr[j]==0) {
					arr[j] = zeroProd;
				}else {
					arr[j] = 0;
				}
			}else {
				arr[j] = prod /arr[j];
			}
		}
		
		return arr;
	}
}
