package programcreek.ArraysStrings;

/**
 * 
 * @author kartik Program to merge K sorted arrays
 */
class MinHeapNode {
	int element;
	int arrIdx;
	int elemIdx;

	public MinHeapNode(int element, int i, int j) {
		this.element = element;
		this.arrIdx = i;
		this.elemIdx = j;
	}
}

class MergeKSortedArrays {

	MinHeapNode[] harr;
	int heap_size;

	public MergeKSortedArrays(MinHeapNode a[], int size) {
		heap_size = size;
		harr = a;
		int i = (heap_size - 1) / 2;
		while (i >= 0) {
			MinHeapify(i);
			i--;
		}
	}

	void MinHeapify(int i) {
		int l = left(i);
		int r = right(i);
		int smallest = i;
		if (l < heap_size && harr[l].element < harr[i].element)
			smallest = l;
		if (r < heap_size && harr[r].element < harr[smallest].element)
			smallest = r;
		if (smallest != i) {
			swap(harr, i, smallest);
			MinHeapify(smallest);
		}
	}

	int left(int i) {
		return (2 * i + 1);
	}

	int right(int i) {
		return (2 * i + 2);
	}

	MinHeapNode getMin() {
		if (heap_size <= 0) {
			System.out.println("Heap underflow");
			return null;
		}
		return harr[0];
	}

	void replaceMin(MinHeapNode root) {
		harr[0] = root;
		MinHeapify(0);
	}

	void swap(MinHeapNode[] arr, int i, int j) {
		MinHeapNode temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void printArray(int[] arr) {
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}

	static void mergeKSortedArrays(int[][] arr) {
		int k = arr.length;
		MinHeapNode[] hArr = new MinHeapNode[k];
		int resultSize = 0;
		for (int i = 0; i < arr.length; i++) {
			MinHeapNode node = new MinHeapNode(arr[i][0], i, 1);
			hArr[i] = node;
			resultSize += arr[i].length;
		}

		MergeKSortedArrays mh = new MergeKSortedArrays(hArr, k);

		int[] result = new int[resultSize];
		for (int i = 0; i < resultSize; i++) {
			MinHeapNode root = mh.getMin();
			result[i] = root.element;
			if (root.elemIdx < arr[root.arrIdx].length)
				root.element = arr[root.arrIdx][root.elemIdx++];
			else
				root.element = Integer.MAX_VALUE;
			mh.replaceMin(root);
		}

		printArray(result);
	}

	public static void main(String args[]) {
		int[][] arr = { { 2, 6, 12, 34 }, { 1, 9, 20, 1000 }, { 23, 34, 90, 2000 } };

		System.out.println("Merged array is :");

		mergeKSortedArrays(arr);
	}
}
