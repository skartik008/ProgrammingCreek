package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 * Print all decimal strings of given input size
 */

public class DecimalString {

	public static void main(String[] args) {
		int input = 3;
		dsHelper("",input);
	}

	private static void dsHelper(String string, int input) {
		if(input == 0) {
			System.out.println(string);
		}else {
			for(int i=0;i<10;i++) {
				dsHelper(string+i,input-1);
			}
		}		
	}
}
