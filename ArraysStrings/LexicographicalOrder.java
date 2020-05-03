package programcreek.ArraysStrings;

import java.util.HashMap;

/**
 * 
 * @author kartik
 * Problem to find the key with highest lexicographical order
 */

public class LexicographicalOrder {

	public static void main(String[] args) {
		String str[] = { "key1 hello", "key2 zzz", "key1 hello", "key3 world", "key1 hello", "key1 kartik" };
		String res[] = lexOrder(str);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

	private static String[] lexOrder(String[] arr) {
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		HashMap<String, String> map = new HashMap<String, String>();

		for (int i = 0; i < arr.length; i++) {
			String input[] = arr[i].split(" ");
			String key = input[0];
			String value = input[1];

			if (count.containsKey(key)) {
				count.put(key, count.get(key) + 1);
			} else {
				count.put(key, 1);
			}

			if (map.containsKey(key)) {
				String val1 = map.get(key);
				String val2 = value;
				if (val1.compareTo(val2) < 0) {
					map.put(key, val2);
				} else {
					map.put(key, val1);
				}
			} else {
				map.put(key, value);
			}
		}

		String result[] = new String[count.size()];
		int idx = 0;
		for (String key : count.keySet()) {
			result[idx] = key + ":" + count.get(key) + "," + map.get(key);
			idx++;
		}
		return result;
	}

}
