
public class Driver {

	public static void main(String[] args) {
		// Integers to be enqueued
		Integer[] intArray = { 2, 9, 1, 4 };

		// Create an instance of an ArrayQ and a ModifiedLinkedQueue class
		ArrayQ arrayQ = new ArrayQ();
		ModifiedLinkedQueue linkedQ = new ModifiedLinkedQueue();

		// Enqueue integers into ArrayQ and ModifiedLinkedQueue queues
		for (int i = 0; i < intArray.length; i++) {
			int current = intArray[i];
			arrayQ.enqueue(current);
			linkedQ.enqueue(current);
		}

		// Dequeue and display all the elements from the queue
		System.out.print("ArrayQ dequeue: ");
		for (int i = 1; i <= intArray.length; i++) {
			System.out.print(arrayQ.dequeue() + " ");
		}

		System.out.println();
		System.out.println();

		System.out.print("ModifiedLinkedQueue (after removeMiddle) dequeue:  ");
		linkedQ.removeMiddle();
		for (int i = 1; i <= intArray.length - 1; i++) {
			System.out.print(linkedQ.dequeue() + " ");
		}

	}
}