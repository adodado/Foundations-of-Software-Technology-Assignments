/**
 *
 */
package acown09_assign1;

import java.util.Scanner;

/**
 * Created by: Admir Cosic, 2017-08-26 Last changed by: Admir Cosic, 2017-08-27
 */

public class ExcerciseHelpers {

	public static int GetInteger(String queryText, Scanner keyboard) {
		System.out.println(queryText);
		int input = keyboard.nextInt();
		return input;
	}

	public static int GetOddPositiveIntegerWithValidation(String queryText, Scanner keyboard) {
		boolean isOddPositive = false;
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
					if (input % 2 == 0) {
						System.out.println("You entered an even number");
						System.out.println("Please try again: ");
					} else {
						value = input;
						isOddPositive = true;
					}
				} else {
					System.out.println("You entered a number that is negative");
					System.out.println("Please try again: ");
				}
			} else {
				System.out.println("Only numbers are valid entries!");
				System.out.println("Please try again:");
				keyboard.next();
			}
		} while (isOddPositive == false);
		return value;
	}

	public static int GetPositiveIntegerWithValidation(String queryText, Scanner keyboard) {
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
		} while (isPositive == false);
		return value;
	}

	public static String GetString(String queryText, Scanner keyboard) {
		System.out.println(queryText);
		String input = keyboard.nextLine();
		return input;
	}

	public static char GetTryAgainChar(Scanner keyboard) {
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

	public static void PrintStringArray(String[] stringArray) {
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i]);
		}
	}

	public static void PrintWelcommeMessage(String excerciseDescription) {
		System.out.println("************************************************************************");
		System.out.println("*                             Welcome!                                 *");
		System.out.println("*                                                                      *");
		System.out.println("*                                                                      *");
		System.out.println(excerciseDescription);
		System.out.println("*                                                                      *");
		System.out.println("*                                                                      *");
		System.out.println("*                                                                      *");
		System.out.println("*                                                                      *");
		System.out.println("* Created by: Admir Cosic                                              *");
		System.out.println("************************************************************************");
		System.out.println("\n");
		System.out.println("\n");
	}
}
