package programcreek.LinkedList;

/**
 * 
 * @author kartik
 *	Program to add two numbers represented as a linked list in reverse order
 */

class LLNode {
	public int data;
	public LLNode next;

	public LLNode() {
		this(0, null);
	}

	public LLNode(int data, LLNode next) {
		this.data = data;
		this.next = next;
	}

	public LLNode(int data) {
		this(data, null);
	}
}

public class AddTwoNumbers {

	public static void main(String[] args) {
		int[] numOne = { 2, 4, 3 };
		int[] numTwo = { 9, 9, 9 };
		LLNode headNumOne = insert(numOne);
		LLNode headNumTwo = insert(numTwo);
		display(headNumOne);
		display(headNumTwo);
		LLNode resultHead = sumNumbers(headNumOne, headNumTwo);
		display(resultHead);
	}

	private static LLNode sumNumbers(LLNode l1, LLNode l2) {
		LLNode tmpNode = new LLNode();
		LLNode head = tmpNode;
		int sum = 0, ca = 0;

		while (true) {
			if (l1 != null && l2 != null) {
				sum = l1.data + l2.data + ca;
			} else if (l1 != null && l2 == null) {
				sum = l1.data + ca;
			} else if (l1 == null && l2 != null) {
				sum = l2.data + ca;
			} else {
				if (ca == 1) {
					tmpNode.next = new LLNode(ca);
				}
				break;
			}
			if (sum > 9) {
				ca = 1;
				tmpNode.next = new LLNode(sum % 10);
				tmpNode = tmpNode.next;
			} else {
				tmpNode.next = new LLNode(sum);
				ca = 0;
				tmpNode = tmpNode.next;
			}
			if (l1 != null) {
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}
		}
		return head.next;
	}

	private static void display(LLNode head) {
		LLNode node = head;
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

	private static LLNode insert(int[] arr) {
		LLNode lastNode = null;
		LLNode head = null;
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			LLNode newNode = new LLNode();
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
