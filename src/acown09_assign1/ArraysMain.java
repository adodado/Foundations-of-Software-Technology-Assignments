package acown09_assign1;

import java.util.ArrayList;

/**
 * Created by: Admir Cosic, 2017-08-26
 * Last changed by: Admir Cosic, 2017-08-31
 *
 * Exercise 7: Arrays This is the ArraysMain program that demonstrates how the
 * methods in Arrays.java work.
 */
public class ArraysMain {
	public static void main(String[] args) {
		Arrays arrays = new Arrays();
		int[] testArray = {1,2,3,4,5};
		int[] testArray2 = {1,1,1,1,1};
		int[] subArray = {6,5,4};
		
		ArrayList<String> testResults = new ArrayList<String>();
		testResults.add("-------------------------------------------------------------------------------------------");
		testResults.add("Test setup:");
		testResults.add("Starting values in array 1: "+arrays.toString(testArray));
		testResults.add("Starting values in array 2: "+arrays.toString(testArray2));
		testResults.add("Values in sub array: "+arrays.toString(subArray));
		testResults.add("-------------------------------------------------------------------------------------------");
		testResults.add("\n");
		testResults.add("Test #1 - sum method: " + arrays.sum(testArray));
		testResults.add("\n");
		testResults.add("Test #2 - toString method: " + arrays.toString(testArray));
		testResults.add("\n");
		testResults.add("Test #3 - addN method, add 2 to each element in array 1: " + arrays.toString(arrays.addN(testArray, 2)));
		testResults.add("\n");
		testResults.add("Test #4 - reverse method");
		testResults.add("Original array: " + arrays.toString(testArray));
		testResults.add("Reversed array: " + arrays.toString(arrays.reverse(testArray)));
		testResults.add("\n");
		testResults.add("Test #5 - replaceAll method (replace 3 with 2 in array 1)");
		testResults.add("Original array: " + arrays.toString(testArray));
		arrays.replaceAll(testArray, 3, 2);
		testResults.add("After replaceAll: " + arrays.toString(testArray));
		testResults.add("\n");
		testResults.add("Test #6 - sort method");
		testResults.add("Original array: " + arrays.toString(testArray));
		testResults.add("After sort method: " + arrays.toString(arrays.sort(testArray)));
		testResults.add("\n");
		testResults.add("Test #7 - hasSubsequence method");
		testResults.add("Original array: " + arrays.toString(testArray)+" Sub array: " + arrays.toString(subArray));
		testResults.add("Result of method: " + arrays.hasSubsequence(testArray, subArray));
		testResults.add("\n");
		testResults.add("Test #8 - absDif method");
		testResults.add("Array1: " + arrays.toString(testArray)+" Array2: " + arrays.toString(testArray2));
		testResults.add("Result of method: " + arrays.toString(arrays.absDif(testArray, testArray2)));
		printArrayList(testResults);
	}
	
	private static void printArrayList(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
        	System.out.println(arrayList.get(i));
        }
	}
}
