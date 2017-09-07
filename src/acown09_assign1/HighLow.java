package acown09_assign1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by: Admir Cosic, 2017-08-26 
 * Last changed by: Admir Cosic, 2017-09-07
 *
 * Exercise 4: HighLow
 */
public class HighLow {
	public static boolean isWinner;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String[] instructions = { "Instructions:", "\n",
				"The secret number is a random positive integer between 1 and 100.", "\n",
				"You have 10 chances to try and guess it. Good Luck!", "\n" };
		printStringArray(instructions);
		playHighLow(keyboard);
	}

	private static void playHighLow(Scanner keyboard) {
		try {
				Random random = new Random();
				int minimumRandomNumber = 1;
				int maximumRandomNumber = 100;
				int secretNumber = random.nextInt(maximumRandomNumber - minimumRandomNumber) + minimumRandomNumber;
				
				isWinner = false;
				int userTryNumber = 1;
				
				while (userTryNumber <= 10) {
					int userGuessNumber = getPositiveIntegerWithValidation("Guess " + userTryNumber + ": ",
							keyboard);
					if (userGuessNumber == secretNumber) {
						System.out.println("Correct after only " + userTryNumber + " guesses - Brilliant!");
						isWinner = true;
						break;
					}
					if (userGuessNumber < secretNumber) {
						System.out.println("Hint: higher");
					} else {
						System.out.println("Hint: lower");
					}
					userTryNumber++;
				}
				
				if (!isWinner) {
					String[] looserMessage = { "You are out of guesses, in other words you lost!", "\n",
							"The correct answer was " + secretNumber, "\n" };
					printStringArray(looserMessage);
				}
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
}
