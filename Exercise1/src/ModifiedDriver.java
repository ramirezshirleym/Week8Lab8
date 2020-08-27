
public class ModifiedDriver {

	public static void main(String[] args) {
		// Integers to be enqueued
		Integer[] intArray = { 1, 7, 3, 4, 9, 2 };

		// Create an instance of an ArrayQ and a LinkedQueue class
		ArrayQ arrayQ = new ArrayQ();
		LinkedQueue linkedQ = new LinkedQueue();

		// Enqueue integers into ArrayQ and LinkedQueue
		for (int i = 0; i < intArray.length; i++) {
			int current = intArray[i];
			arrayQ.enqueue(current);
			linkedQ.enqueue(current);
		}

		// Dequeue and display all the elements from the queues
		System.out.print("ArrayQ dequeue: ");
		for (int i = 1; i <= intArray.length; i++) {
			System.out.print(arrayQ.dequeue() + " ");
		}

		System.out.println();
		System.out.println();

		System.out.print("LinkedQueue dequeue: ");
		for (int i = 1; i <= intArray.length; i++) {
			System.out.print(linkedQ.dequeue() + " ");
		}

	}
}