package programcreek.ArraysStrings;

/**
 * @author kartik
 *  Given a string, print all the subsets of the string
 */

import java.util.ArrayList;

public class SetString {

	public static void main(String[] args) {
		String str = "xy";
		String arr[];
		arr = subsetStrings(str);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	private static String[] subsetStrings(String str) {
		ArrayList<String> res = new ArrayList<String>();
		helper(res,str,0,"");
		String[] ans = GetStringArray(res);	
		return ans;
	}

	private static void helper(ArrayList<String> res, String str, int pos, String curr_subset) {
		if(pos == str.length()) {
			res.add(curr_subset);
			return;
		}
		helper(res,str,pos+1,curr_subset);
		helper(res,str,pos+1,curr_subset+str.charAt(pos)); 
	}

	private static String[] GetStringArray(ArrayList<String> res) {
		String str[] = new String[res.size()];
		for(int i=0;i<res.size();i++) {
			str[i] = res.get(i);
		}
		return str;
	}
}
