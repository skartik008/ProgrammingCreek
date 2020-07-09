package programcreek.ArraysStrings;

/*
 *  @author: Kartik
 *  Look and Say problem
 */


public class LookAndSay {

	public static void main(String[] args) {
		int input = 5;
		String str = countAndSay(input);
		System.out.println(str);
	}

	public static String countAndSay(int n) {
        String s = "1";
        for (int i=1;i<n;i++){
            s = nextNumber(s);
        }
        return s;
    }
    private static String nextNumber(String s){
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();++i){
            int count = 1;
            while(i+1 < s.length() && s.charAt(i) == s.charAt(i+1)){
                ++i;
                ++count;
            }
            result.append(count).append(s.charAt(i));
        }
        return result.toString();
    }
}

