public class Driver {

	public static void main(String[] args) {
		// Integers to be pushed through
		Integer[] intArray = { 1, 7, 3, 4, 9, 2 };

		// Create an instance of an ArrayStack and a LinkedStack class
		ArrayStack arrayStack = new ArrayStack();
		LinkedStack linkedStack = new LinkedStack();

		// Push integers into ArrayStack and LinkedStack
		for (int i = 0; i < intArray.length; i++) {
			int current = intArray[i];
			arrayStack.push(current);
			linkedStack.push(current);
		}

		// Pop off and display all the elements from the stacks
		System.out.print("From Array Stack: ");
		for (int i = 1; i <= intArray.length; i++) {
			System.out.print(arrayStack.pop() + " ");
		}

		System.out.println();
		System.out.println();

		System.out.print("From Linked Stack: ");
		for (int i = 1; i <= intArray.length; i++) {
			System.out.print(linkedStack.pop() + " ");

		}
	}
}
