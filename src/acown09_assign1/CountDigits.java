/**
 *
 */
package acown09_assign1;

import java.util.Scanner;

/**
 * Created by: Admir Cosic, 2017-08-25 Last changed by: Admir Cosic, 2017-08-27
 *
 * Exercise 3: CountDigits Write a program CountDigits.java that for an
 * arbitrary positive integer N (read from the keyboard) prints the number of
 * zeros, odd digits, even digits and computes the sum of all digits. An
 * execution might look like this:
 *
 * Provide a positive integer: 6789500 Zeros: 2 Odd: 3 Even: 2 Sum: 35 Notice,
 * we treat zero as neither odd nor even.
 *
 */

public class CountDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char restart;
		int input;
		int zeros;
		int odds;
		int evens;
		int sum;
		Scanner keyboard = new Scanner(System.in);
		/*
		 * Used a try-catch-finally statement without the catch part because Eclipse was
		 * complaining that the scanner was not closed and it could lead to resource
		 * leaks, i figured i could close it in the finally statement
		 */
		try {
			do {
				input = 0;
				zeros = 0;
				odds = 0;
				evens = 0;
				sum = 0;

				ExcerciseHelpers.PrintWelcommeMessage(
						"*     This litle program is used to count digits in a positive integer.*");
				input = ExcerciseHelpers.GetPositiveIntegerWithValidation("Provide a positive integer: ", keyboard);
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
				ExcerciseHelpers.PrintStringArray(resultPrintout);
				keyboard.nextLine();
				restart = ExcerciseHelpers.GetTryAgainChar(keyboard);
			} while (restart == 'Y' || restart == 'y');
		} finally {
			keyboard.close();
			System.exit(0);
		}
	}

}
