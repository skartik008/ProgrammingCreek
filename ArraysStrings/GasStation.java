package programcreek.ArraysStrings;

/**
 * 
 * @author kartik
 * Program to find if a circular path is possible or not given an array of gas stations and cost to get to the next station
 */

public class GasStation {

	public static void main(String[] args) {
		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 3, 4, 5, 1, 2 };
		int idx = circuitCheck(gas, cost);
		System.out.println(idx);
	}

	private static int circuitCheck(int[] gas, int[] cost) {
		int start = 0, tank = 0, remaining = 0;
		for (int i = 0; i < gas.length; i++) {
			tank += gas[i] - cost[i];
			if (tank < 0) {
				start = i + 1;
				remaining += tank;
				tank = 0;
			}
		}
		return (tank + remaining) >= 0 ? start : -1;
	}

}
