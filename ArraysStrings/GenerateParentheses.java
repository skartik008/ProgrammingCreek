package programcreek.ArraysStrings;

import java.util.ArrayList;

/**
 * 
 * @author kartik
 * Generate list of all well formed paranthese given the number of pairs of parantheses
 */

public class GenerateParentheses {

	public static void main(String[] args) {
		int pair = 3;
		String res[];
		res = generatePara(pair);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}

	}

	private static String[] generatePara(int pair) {
		ArrayList<String> res = new ArrayList<String>();
		int numL = pair;
		int numR = pair;
		helper(numL,numR,"",res);
		String[] ans = GetStringArray(res);	
		return ans;
	}
	
	private static void helper(int numL, int numR, String str, ArrayList<String> res) {	
		if(numL > numR || numL < 0 || numR <0) {
			return;
		}	
		if(numL == 0 && numR == 0) {
			res.add(str);
			return;
		}
		helper(numL-1,numR,str+'(',res);
		helper(numL,numR-1,str+')',res);
	}

	private static String[] GetStringArray(ArrayList<String> res) {
		String str[] = new String[res.size()];
		for(int i=0;i<res.size();i++) {
			str[i] = res.get(i);
		}
		return str;
	}

}
