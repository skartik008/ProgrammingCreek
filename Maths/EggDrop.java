package programcreek.Maths;

/**
 * 
 * @author kartik
 * Program to print the number of drops needed to see if an egg breaks
 *
 * Calculating the total no of drops needed to find the floor on which the egg breaks  
 */

public class EggDrop {

	public static void main(String[] args) {
		int maxDrop = 0;
		for (int i = 1; i <= 100; i++) {
			int res = findWorstCaseEggDrop(i);
			if (res > maxDrop) {
				maxDrop = res;
			}
			System.out.println("Total drops needed for floor " + i + " is: " + res);
		}
		System.out.println("\nMaximum no of drops needed is " + maxDrop);
	}

	private static int findWorstCaseEggDrop(int floorWhichBreak) {

		/*
		 * Make sure input is a valid floor i.e. between 1 and 100
		 */

		if (floorWhichBreak < 1 || floorWhichBreak > 100) {
			throw new IllegalArgumentException("Floor should be between 1 and 100");
		}

		/*
		 * n+(n-1)+(n-2)+(n-3)+...+1 = 100; solving for n (ceiling) gives n = 14, so
		 * first drop will be 14th floor, next will be 14 + (14-1) = 14 + 13 = 27
		 */

		int jump = 14; // The number of floors that needs to be jumped comes from the formula
						// n^2+n-200=0, calculating for n gives 14(ceiling)
		int startCheck = 1; // This defines the start of linear search when an egg breaks at one floor
		int totalFloors = 100; // Total number of floors given
		int firstDrop = 14; // The floor on which the first egg will be dropped
		int count = 1; // Keeping the count of the drops

		/*
		 * Starting from the first drop, going till the total floors, counter jumps the
		 * jump
		 */

		for (int i = firstDrop; i <= totalFloors; i = i + jump) {
			/*
			 * Check if the floor I am in, is it greater than equal to the floor given, in
			 * that case egg will break
			 */
			if (i >= floorWhichBreak) {
				/*
				 * Since egg is broken, start check from the next floor of the previous drop
				 * floor and check linearly till we find the floor at which egg broke
				 */
				for (int j = startCheck; j < floorWhichBreak; j++) {
					count = count + 1;
				}
				/*
				 * This additional line is needed if the floor at which egg breaks is not the
				 * floor at which the drop happens in a jump
				 */
				if (floorWhichBreak != (startCheck + jump - 1)) {
					count += 1;
				}
				return count;
			} else {
				/*
				 * Since egg did not break, going to the next jump floor and at the same time
				 * incrementing my drop as well
				 */
				startCheck = startCheck + jump;
				jump = jump - 1;
				count = count + 1;
			}
		}
		return count;
	}
}