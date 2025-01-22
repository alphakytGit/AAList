import java.util.ArrayList;
//DifferenceArraysArrayLists
public class Main {
	public static void main(String[] args) {
		// Array example: Fixed size
		int[] intArray = new int[5];  // Declare an array of size 5
		intArray[0] = 10;  // Assign values to array elements
		intArray[1] = 20;
		System.out.println("Array element at index 1: " + intArray[1]);

		// ArrayList example: Dynamic size
		ArrayList<Integer> intList = new ArrayList<>();  // Declare an ArrayList
		intList.add(10);  // Add elements dynamically
		intList.add(20);
		System.out.println("ArrayList element at index 1: " + intList.get(1));

		// ArrayLists allow dynamic changes
		intList.add(30);  // Add a new element
		System.out.println("ArrayList element at index 2: " + intList.get(2));
	}
}
