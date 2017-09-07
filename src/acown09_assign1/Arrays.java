package acown09_assign1;

/**
 * Created by: Admir Cosic, 2017-08-26
 * Last changed by: Admir Cosic, 2017-09-07
 *
 * Exercise 7: Arrays
 */

public class Arrays {

	public static void main(String[] args) {

	}

	public int sum(int[] arr) {
		int value = 0;
		int i = 0;
		while (i < arr.length)
		{
			value += arr[i];
			i++;
		}
		return value;
	}

	public String toString(int[] arr) {
		int n;
		int i = 0;
		String string = "";
		while (i < arr.length)
		{			
			n = arr[i];
			string += n + ", ";
			i++;
		}
		return string;
	}

	public int[] addN(int[] arr, int n) {
		int i = 0;
		while (i < arr.length)
		{
			arr[i] += n;
			i++;
		}
		return arr;
	}

	public int[] reverse(int[] arr) {
		for(int i = 0; i < arr.length / 2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		return arr;
	}

	public void replaceAll(int[] arr, int old, int nw) {
		int i = 0;
		while (i < arr.length)
		{			
			if(arr[i] == old) {
			arr[i] = nw;
			}
			i++;
		}
	}

	public int[] sort(int[] arr) {
		int[] sortedArr = arr.clone();
		int counter = 0;
		int temp;
		boolean swapped = true;
		while(swapped) {
			swapped = false;
			counter++;
			for(int i = 0; i < sortedArr.length - counter; i++) {
				if(sortedArr[i] > sortedArr[i + 1]) {
					temp = sortedArr[i];
					sortedArr[i] = sortedArr[i + 1];
					sortedArr[i + 1] = temp;
					swapped = true;
				}
			}
		}
		return sortedArr;
	}

	public boolean hasSubsequence(int[] arr, int[] sub) {
		try {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == sub[0]) {
					for(int s = 0; s < sub.length; s++) {
						if(arr[i+s] != sub[s]) {
							return false;
						}
					}
				}
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return true;
	}

	public int[] absDif(int[] arr1, int[] arr2) {
		int[] newArr = arr1.clone();
		try {
			if(arr1.length != arr2.length) {
				throw new Exception("Error: The two arrays have different lengths!");
			}
			for(int i = 0; i < arr1.length; i++) {
				newArr[i] = arr1[i] - arr2[i];
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return newArr;
	}
}