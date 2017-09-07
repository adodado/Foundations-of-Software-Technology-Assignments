package acown09_assign1;

import java.util.Scanner;

/**
 * Created by: Admir Cosic, 2017-08-25
 * Last changed by: Admir Cosic, 2017-09-07
 *
 * Exercise 3: CountDigits
 */

public class CountDigits {
	public static int zeros=0;
	public static int odds=0;
	public static int evens=0;
	public static int sum=0;
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		countIntDigits(keyboard);
	}

	private static void countIntDigits(Scanner keyboard) {
		try {
				String numbers = getPositiveIntegerWithValidation("Provide a positive integer: ", keyboard);

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
	private static String getPositiveIntegerWithValidation(String queryText, Scanner keyboard) {
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
		return Integer.toString(value);
	}
}
