package acown09_assign1;

import java.util.Scanner;

/**
 * Created by: Admir Cosic, 2017-08-24 
 * Last changed by: Admir Cosic, 2017-08-31
 *
 * Exercise 2: LargestK
 */

public class LargestK {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		computeLargestK(keyboard);
	}
	private static void computeLargestK(Scanner keyboard) {
		int input;
		int K;
		int sum;
		char restart=0;
		try {
			do {
				input = 0;
				K = 0;
				sum = 0;
				getPositiveIntegerWithValidation("Provide a positive integer: ", keyboard);
				for (int i = 0; sum <= input; i += 2) {
					sum += i;
					K = i;
				}
				K -= 2;
				String[] resultPrintout = { "\n", "N: " + input, "\n", "Largest K: " + K, "\n", "\n" };
				printStringArray(resultPrintout);
				keyboard.nextLine();
				restart = getTryAgainChar(keyboard);
			} while (restart == 'Y' || restart == 'y');
		} finally {
			keyboard.close();
			System.exit(0);
		}
	}
	private static void printStringArray(String[] stringArray) {
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i]);
		}
	}
	private static int getPositiveIntegerWithValidation(String queryText, Scanner keyboard) {
		boolean isPositive = false;
		int value = 0;
		int input = 0;
		System.out.println(queryText);
		do {
			if (keyboard.hasNextInt()) {
				input = keyboard.nextInt();
				if (input == 0) {
					System.out.println("You entered a number that is equal to zero");
					System.out.println("Please try again: ");
				} else if (input > 0) {
					value = input;
					isPositive = true;
				} else {
					System.out.println("You entered a number that is negative");
					System.out.println("Please try again: ");
				}
			} else {
				System.out.println("Only numbers are valid entries!");
				System.out.println("Please try again:");
				keyboard.next();
			}
		} while (!isPositive);
		return value;
	}
	private static char getTryAgainChar(Scanner keyboard) {
		String input = null;
		System.out.println("\n");
		System.out.println("Do you want to restart the program. (Y/N)?");
		System.out.println("Remember you must type a 'Y' for yes or an 'N' for no!");
		do {
			if (keyboard.hasNextLine()) {
				input = keyboard.nextLine();
			} else {
				keyboard.next();
			}
		} while (input == null);
		return input.charAt(0);
	}
}
