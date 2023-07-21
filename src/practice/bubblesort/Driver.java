// This program uses an array of ints and sort them with the bubble sort method.
// I create an object of my driver class to print my array before and after sorting.

package practice.bubblesort;

public class Driver {

	// main method that runs my program
	public static void main(String[] args) {
		
		int myArray[] = {12, 45, 12, 5, 43, 25, 46, 39, 80, 3, 1};
		
		Driver myDriver = new Driver();
		myDriver.printMyArray(myArray);
		myDriver.bubbleSort(myArray);
		System.out.println();
		myDriver.printMyArray(myArray);

	}
	
	// public method to print any primitive integer array 
	public void printMyArray(int array[]) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	// bubble sort method
	public void bubbleSort(int array[]) {
		
		// set number of Elements to the length of my array
		int numOfElems = array.length;
		// a boolean variable to check if there has been an item swapped.
		boolean isSwapped;
		
		// outer loop control iterations
		for(int i = 0; i < numOfElems - 1; i++) {
			isSwapped = false;
			// j controls the indexes of array. 
			for(int j = 0; j < numOfElems - 1 - i; j++) {
				// if left element is larger than that element + 1 or the right element
				if(array[j] > array[j + 1]) {
					// store the left item in the temporary variable
					// we store it because array[j] will be overwritten
					int temp = array[j];
					// here we overwrite array[j] with the right element j + 1
					array[j] = array[j + 1];
					// and now the right element is set to the left element that was
					// stored in the temp variable.
					array[j + 1] = temp;
					// was there a swap?
					isSwapped = true;
				}
			}
			
		}
	}
}
