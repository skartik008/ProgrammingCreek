package programcreek.TreeHeapTrie;

/**
 * 
 * @author kartik Given a number of nodes, find the no of Binary Search Trees that can be constructed with that nodes using Memoization
 *        
 */

public class NumberBSTMemoization {
	static int MAX_INT = 30;
	static long memArray[] = new long[MAX_INT];
	
	public static void main(String[] args) {
		for(int i=0;i<MAX_INT;i++) {
			memArray[i] = -1;
		}
		long res;
		int input = 4;
		res = bstNumber(input);
		System.out.println(res);
		System.out.println();
	}

	private static long bstNumber(int input) {
		if(input > MAX_INT) {
			return -1;
		}
		if (input == 0) {
			return 1;
		}
		if(memArray[input] != -1) {
			return memArray[input];
		}
		long BST = 0;
		for (int no_nodes_left_BST = 0; no_nodes_left_BST < input; no_nodes_left_BST++) {
			int no_nodes_right_BST = input - 1 - no_nodes_left_BST;
			BST += bstNumber(no_nodes_left_BST) * bstNumber(no_nodes_right_BST);
			
		}
		memArray[input] = BST;
		return BST;
	}

}
