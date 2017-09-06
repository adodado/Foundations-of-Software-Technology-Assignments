package acown09_assign1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by: Admir Cosic, 2017-08-26 
 * Last changed by: Admir Cosic, 2017-08-27
 *
 * Exercise 4: HighLow
 */
public class HighLow {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		playHighLow(keyboard);
	}

	private static void playHighLow(Scanner keyboard) {
		char restart = 0;
		boolean winner;
		
		try {
			do {
				Random random = new Random();
				int min = 1;
				int max = 100;
				int secret = random.nextInt(max - min) + min;
				winner = false;
				String[] instructions = { "Instructions:", "\n",
						"The secret number is a random positive integer between 1 and 100.", "\n",
						"You have 10 chances to try and guess it. Good Luck!", "\n" };
				printStringArray(instructions);

				for (int guessNumber = 1; guessNumber <= 10; guessNumber++) {
					int guess = getPositiveIntegerWithValidation("Guess " + guessNumber + ": ",
							keyboard);
					if (guess == secret) {
						System.out.println("Correct after only " + guessNumber + " guesses - Brilliant!");
						winner = true;
						break;
					}
					if (guess < secret) {
						System.out.println("Hint: higher");
					} else {
						System.out.println("Hint: lower");
					}
				}
				if (!winner) {
					String[] looserMessage = { "You are out of guesses, in other words you lost!", "\n",
							"The correct answer was " + secret, "\n" };
					printStringArray(looserMessage);
				}
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
		System.out.println("Remember you must type a 'y' for yes or an 'n' for no!");
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
