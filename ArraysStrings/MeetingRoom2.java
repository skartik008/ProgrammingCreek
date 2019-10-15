package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 * Program to find the minimum no of meeting rooms needed - 2
 */

import java.util.*;

public class MeetingRoom2 {

	public static void main(String[] args) {
		int[][] input = { { 2, 15 }, { 36, 45 }, { 9, 29 }, { 16, 23 }, { 4, 9 } };
		int roomsNeeded = minMeetingRooms(input);
		System.out.println(roomsNeeded);
	}

	public static int minMeetingRooms(int[][] intervals) {
		Arrays.sort(intervals, Comparator.comparing((int[] itv) -> itv[0]));
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		for (int[] itv : intervals) {
			if (heap.isEmpty()) {
				heap.offer(itv[1]);
			} else {
				if (itv[0] >= heap.peek()) {
					heap.poll();
				} 
				heap.offer(itv[1]);
			}
		}
		return heap.size();
	}

}
