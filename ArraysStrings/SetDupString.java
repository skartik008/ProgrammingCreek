package programcreek.ArraysStrings;

/**
 * @author kartik
 *  Given a string, print all the unique subsets of the number array with duplicate numbers
 */

import java.util.ArrayList;
import java.util.Arrays;

public class SetDupString {

	public static void main(String[] args) {
		int[] array = {2,1,2};
		subsetStrings(array);
	}
	
	private static void subsetStrings(int[] array) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> out = new ArrayList<Integer>();
		Arrays.sort(array);
		helper(array,0,out,res);
		print(res);
	}

	private static void print(ArrayList<ArrayList<Integer>> res) {
		int size = res.size();
		for(int i=0;i<size;i++) {
			System.out.print("[");
			for(int j=0;j<res.get(i).size();j++) {
				System.out.print(res.get(i).get(j)+ " ");
			}
			System.out.print("]");
			System.out.println();
		}		
	}

	private static void helper(int[] array, int pos, ArrayList<Integer> curr_subset, ArrayList<ArrayList<Integer>> res) {
		if(pos == array.length) {
			res.add(new ArrayList<>(curr_subset));
			return;
		}
		curr_subset.add(array[pos]);
		helper(array,pos+1,curr_subset,res);
		curr_subset.remove(curr_subset.size()-1);
		while(pos < array.length-1 && array[pos+1] == array[pos]) {
			pos++;
		}
		helper(array,pos+1,curr_subset,res);	
	}
}
