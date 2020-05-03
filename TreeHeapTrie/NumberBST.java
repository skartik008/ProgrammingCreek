package programcreek.TreeHeapTrie;

/**
 * 
 * @author kartik
 * Given a node find the number of possible binary search trees
 */

public class NumberBST {

	public static void main(String[] args) {
		int input = 30;
		long res = numberBST(input);
		System.out.println(res);
	}

	private static long numberBST(int input) {
		if(input == 0) {
			return 1;
		}
		long BST = 0;
		for(int leftSub = 0; leftSub < input; leftSub++) {
			int rightSub = input - 1 - leftSub;
			BST += numberBST(leftSub) * numberBST(rightSub);
		}
		return BST;
	}

}
