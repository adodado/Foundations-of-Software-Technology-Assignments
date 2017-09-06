/**
 *
 */
package acown09_assign1;

/**
 * Student: Admir Cosic
 *
 * Exercise 7: Arrays, Write a class Arrays.java with the following static
 * methods.
 *
 * Method int sum(int[] arr) that adds all elements in the array arr and returns
 * the sum.
 *
 * Method String toString(int[] arr) that returns a string which, if printed,
 * provides a nice looking print out of the array content. Used as: int n =
 * {3,4,5,6,7}; String str = Arrays.toString(n); System.out.println("n = " +
 * str);
 * 
 * Method int[] addN(int[] arr, int n) that returns, an array where we have
 * added the number n to all elements in the array arr. For example, in the case
 * addN({1,2,3,4,5}, 2) the result is an array {3,4,5,6,7}. The array gets
 * changed.
 *
 * Method int[] reverse(int[] arr) that creates, and returns, a new array with
 * all the elements in array arr but in reverse order. The array arr should be
 * left unchanged.
 *
 * Method void replaceAll(int[] arr, int old, int nw) that replaces all
 * occurences of the elemnt old with nw in arr.
 *
 * Method int[] sort(int[] arr) that returns a new sorted array (least element
 * first) with the same set of elements as in arr. The array arr should be left
 * unchanged.
 *
 * Method boolean hasSubsequence(int[] arr, int[] sub) that returns true if the
 * subsequence sub is a part of the array arr, otherwise false. For example, in
 * the case hasSubsequence({1,2,3,4,5}, {2,3,4}) the result is true since
 * {3,4,5} is the final part of {1,2,3,4,5}, but in case
 * hasSubsequence({1,2,3,4,5}, {2,3,5}) the result is false.
 *
 * Method int[] absDif(int[] arr1, int[] arr2) returns a new array that is the
 * absolute difference between array arr1 and array arr2. That is result array
 * dist(i) = |arr1(i) - arr2(i)|. For example, in the case absDif({1,2,3,4,5},
 * {1,1,1,1,1}) the result is {0,1,2,3,4}. Notice, that the sizes of both arrays
 * should be the same, in case they are different the method should throw an
 * exception and be handled within the program.
 *
 * Write also a program ArraysMain.java that demonstrates how all these methods
 * work.
 */
public class Arrays {

}
