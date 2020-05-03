package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 *	Program to find the shortest transformation distance between two words
 */

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

class WordNode {
	String word;
	int numSteps;

	public WordNode(String word, int numSteps) {
		this.word = word;
		this.numSteps = numSteps;
	}
}

public class WordLadder {

	public static void main(String[] args) {
		String start = "hit";
		String end = "cog";
		Set<String> dict = new HashSet<String>();
		dict.add("hot");
		dict.add("dot");
		dict.add("dog");
		dict.add("lot");
		dict.add("log");

		int res = ladderLength(start, end, dict);
		System.out.println(res);
	}

	private static int ladderLength(String start, String end, Set<String> dict) {
		LinkedList<WordNode> queue = new LinkedList<WordNode>();
		queue.add(new WordNode(start, 1));
		dict.add(end);

		while (!queue.isEmpty()) {
			WordNode top = queue.remove();
			String word = top.word;
			if (word.equals(end)) {
				return top.numSteps;
			}
			char[] arr = word.toCharArray();
			for (int i = 0; i < arr.length; i++) {
				for (char c = 'a'; c <= 'z'; c++) {
					char temp = arr[i];
					if (arr[i] != c) {
						arr[i] = c;
					}

					String newWord = new String(arr);
					if (dict.contains(newWord)) {
						queue.add(new WordNode(newWord, top.numSteps + 1));
						dict.remove(newWord);
					}

					arr[i] = temp;
				}
			}
		}
		return 0;
	}
}
