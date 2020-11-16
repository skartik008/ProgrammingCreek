package programcreek.ArraysStrings;

/*
 * 
 */

import java.util.*;

public class TextJustification {

	public static void main(String[] args) {
		String[] input = {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do."};
		int len = 20;
		List<String> result = JustifyString(input,len);
		printResult(result);
	}

	private static List<String> JustifyString(String[] words, int maxWidth) {
	    List<String> result = new ArrayList<String>();
	 
	    if(words==null || words.length==0){
	        return result;
	    }
	 
	 
	    int count=0;
	    int last=0;
	    for(int i=0; i<words.length; i++){
	        count = count + words[i].length();
	 
	        if(count+i-last>maxWidth){
	            int wordsLen = count-words[i].length();
	            int spaceLen = maxWidth-wordsLen;
	            int eachLen = 1;
	            int extraLen = 0;
	 
	            if(i-last-1>0){
	                eachLen = spaceLen/(i-last-1);
	                extraLen = spaceLen%(i-last-1);
	            }
	 
	            StringBuilder sb = new StringBuilder();
	 
	            for(int k=last; k<i-1; k++){
	                sb.append(words[k]);
	 
	                int ce = 0;
	                while(ce<eachLen){
	                    sb.append(" ");
	                    ce++;
	                }
	 
	                if(extraLen>0){
	                    sb.append(" ");
	                    extraLen--;
	                }
	            }
	 
	            sb.append(words[i-1]);//last words in the line
	            //if only one word in this line, need to fill left with space
	            while(sb.length()<maxWidth){
	                sb.append(" ");
	            }
	 
	            result.add(sb.toString());
	 
	            last = i;
	            count=words[i].length();
	        }
	    }
	 
	    StringBuilder sb = new StringBuilder();
	 
	    for(int i=last; i<words.length-1; i++){
	        count = count+words[i].length();
	        sb.append(words[i]+" ");
	    }
	 
	    sb.append(words[words.length-1]);
	    while(sb.length()<maxWidth){
	        sb.append(" ");
	    }
	    result.add(sb.toString());
	 
	    return result;
	}
	private static void printResult(List<String> result) {
		for(int i=0;i<result.size();i++) {
			System.out.println(result.get(i));
		}
	}
}
