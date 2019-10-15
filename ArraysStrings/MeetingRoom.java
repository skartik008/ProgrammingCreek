package programcreek.ArraysStrings;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 
 * @author kartik
 * Program to find the no of meeting rooms needed
 */

class Interval {
	public int start;
	public int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}
}

public class MeetingRoom {

	public static void main(String[] args) {
		int[] x = { 0, 5, 15 };
		int[] y = { 30, 10, 20 };
		Interval[] obj = new Interval[x.length];
		for (int i = 0; i < x.length; i++) {
			obj[i] = new Interval();
			obj[i].start = x[i];
			obj[i].end = y[i];
		}
		int result = minMeetingRooms(obj);
		System.out.println(result);
	}

	private static int minMeetingRooms(Interval[] intervals) {
		Arrays.sort(intervals, (a, b) -> a.start - b.start);
		
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		for (Interval i : intervals) {
			if (!heap.isEmpty() && i.start >= heap.peek()) {
				heap.poll();
			}
			heap.offer(i.end);
		}
		return heap.size();
	}

}
