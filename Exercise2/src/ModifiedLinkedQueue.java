/* 
 * This is a modified version of the LinkedQueue class 
 * 1. Constructor was modified to reflect the name of this class
 * 2. removeMiddle method was added
 */

// This class implements a queue using a linked list
// It requires the LinkedNode class to be defined

public class ModifiedLinkedQueue {

	LinkedNode front;
	LinkedNode rear;
	int count;

	ModifiedLinkedQueue() {
		front = rear = null;
		count = 0;
	}

	void enqueue(int x) {
		LinkedNode newNode = new LinkedNode(x);
		if (rear != null)
			rear.next = newNode;
		else
			front = newNode;

		rear = newNode;
		count++;

	}

	int dequeue() {
		if (front == null) {
			return -1;
		}

		if (front != rear) {
			int x = front.x;
			front = front.next;
			count--;
			return x;
		} else {
			int x = front.x;
			front = null;
			rear = null;
			count--;
			return x;
		}
	}

	int first() {
		return front.x;
	}

	boolean isEmpty() {
		return count == 0;
	}

	int size() {
		return count;
	}

	// THIS METHOD REMOVES THE VALUE IN THE MIDDLE OF THE QUEUE
	public void removeMiddle() {
		int midPoint = count / 2;
		LinkedNode currNode = front;
		LinkedNode nextNode = front.next;

		// if number of element in queue is even
		if (count % 2 == 0) {
			int index = 2;
			while (index < midPoint) {
				currNode = nextNode;
				nextNode = currNode.next;
				index++;
			}
			currNode.next = nextNode.next;
			count--;
		// if number of elements in queue is odd
		} else {
			int index = 1;
			while (index < midPoint) {
				currNode = nextNode;
				nextNode = currNode.next;
				index++;
			}
			currNode.next = nextNode.next;
			count--;
		}
	}
}
