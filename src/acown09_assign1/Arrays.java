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
		int[] returnArray = arr.clone();
		int sortCounter = 0;
		int temporaryValue;
		boolean isSwapped = true;
		while(isSwapped) {
			isSwapped = false;
			sortCounter++;
			for(int i = 0; i < returnArray.length - sortCounter; i++) {
				if(returnArray[i] > returnArray[i + 1]) {
					temporaryValue = returnArray[i];
					returnArray[i] = returnArray[i + 1];
					returnArray[i + 1] = temporaryValue;
					isSwapped = true;
				}
			}
		}
		return returnArray;
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
		int[] returnArray = arr1.clone();
		try {
			if(arr1.length != arr2.length) {
				throw new Exception("Error: The two arrays have different lengths!");
			}
			for(int i = 0; i < arr1.length; i++) {
				returnArray[i] = arr1[i] - arr2[i];
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return returnArray;
	}
}