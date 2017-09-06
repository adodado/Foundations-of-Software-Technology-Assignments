package acown09_assign1;

import java.util.Scanner;

/**
 * Created by: Admir Cosic, 2017-08-25
 * Last changed by: Admir Cosic, 2017-08-31
 *
 * Exercise 3: CountDigits
 */

public class CountDigits {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		countIntDigits(keyboard);
	}

	private static void countIntDigits(Scanner keyboard) {
		char restart = 0;
		int input;
		int zeros;
		int odds;
		int evens;
		int sum;
		
		try {
			do {
				input = 0;
				zeros = 0;
				odds = 0;
				evens = 0;
				sum = 0;
				input = getPositiveIntegerWithValidation("Provide a positive integer: ", keyboard);
				String numbers = Integer.toString(input);

				for (int i = 0; i < numbers.length(); i++) {
					int number = Character.getNumericValue(numbers.charAt(i));
					sum += number;
					if (number == 0) {
						zeros++;
						continue;
					}
					if (number % 2 == 0) {
						evens++;
					} else {
						odds++;
					}
				}
				String[] resultPrintout = { "\n", "Zeros: " + zeros, "\n", "Odd: " + odds, "\n", "Even: " + evens, "\n",
						"Sum: " + sum, "\n", "\n" };
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
