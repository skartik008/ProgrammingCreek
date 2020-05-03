package programcreek.LinkedList;

/*
 * author: Kartik 
 * Program to reverse a linked list
 */

class LinkedListNode {
	public int data;
	public LinkedListNode next;

	public LinkedListNode() {
		this(0, null);
	}

	public LinkedListNode(int data, LinkedListNode next) {
		this.data = data;
		this.next = next;
	}

	public LinkedListNode(int data) {
		this(data, null);
	}
}

public class ReverseLinkedList {
	public static void main(String[] args) {
		int[] numOne = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		LinkedListNode headNumOne = insert(numOne);
		display(headNumOne);
		LinkedListNode resultHead = reverseLists(headNumOne);
		display(resultHead);
	}
	
	private static void display(LinkedListNode head) {
		LinkedListNode node = head;
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

	private static LinkedListNode insert(int[] arr) {
		LinkedListNode lastNode = null;
		LinkedListNode head = null;
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			LinkedListNode newNode = new LinkedListNode();
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
	
	public static LinkedListNode reverseLists(LinkedListNode headOfList) {
	    LinkedListNode currentNode = headOfList;
	    LinkedListNode previousNode = null;
	    LinkedListNode nextNode = null;

	    while (currentNode != null) {

	        nextNode = currentNode.next;
	        currentNode.next = previousNode;
	        previousNode = currentNode;
	        currentNode = nextNode;
	    }

	    return previousNode;
	}
}
