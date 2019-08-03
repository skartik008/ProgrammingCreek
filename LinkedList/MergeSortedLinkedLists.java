package programcreek.LinkedList;

/**
 * 
 * @author kartik
 *	Program to merge two sorted linked list
 */

class LinkNode {
	public int data;
	public LinkNode next;

	public LinkNode() {
		this(0, null);
	}

	public LinkNode(int data, LinkNode next) {
		this.data = data;
		this.next = next;
	}

	public LinkNode(int data) {
		this(data, null);
	}
}

public class MergeSortedLinkedLists {

	public static void main(String[] args) {
		int[] numOne = { 1, 3, 5 };
		int[] numTwo = { 2, 4, 6, 7 };
		LinkNode headNumOne = insert(numOne);
		LinkNode headNumTwo = insert(numTwo);
		display(headNumOne);
		display(headNumTwo);
		LinkNode resultHead = mergeLists(headNumOne, headNumTwo);
		display(resultHead);
	}

	private static LinkNode mergeLists(LinkNode l1, LinkNode l2) {
		LinkNode tempNode = new LinkNode();
		LinkNode head = tempNode;
		while (l1 != null && l2 != null) {
			if (l1.data > l2.data) {
				tempNode.next = l2;
				l2 = l2.next;
			} else {
				tempNode.next = l1;
				l1 = l1.next;
			}
			tempNode = tempNode.next;
		}
		if (l1 != null) {
			tempNode.next = l1;
		}
		if (l2 != null) {
			tempNode.next = l2;
		}

		return head.next;
	}

	private static void display(LinkNode head) {
		LinkNode node = head;
		while (node != null) {
			System.out.print(node.data);
			if (node.next != null) {
				System.out.print("->");
			} else {
				System.out.println();
			}
			node = node.next;
		}

	}

	private static LinkNode insert(int[] arr) {
		LinkNode lastNode = null;
		LinkNode head = null;
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			LinkNode newNode = new LinkNode();
			newNode.data = arr[i];
			if (lastNode == null) {
				lastNode = newNode;
				head = newNode;
			} else {
				lastNode.next = newNode;
				lastNode = newNode;
			}
		}
		return head;
	}
}
