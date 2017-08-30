/**
 *
 */
package acown09_assign1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by: Admir Cosic, 2017-08-26 Last changed by: Admir Cosic, 2017-08-27
 *
 * Exercise 4: HighLow Write a program HighLow.java that implements the simple
 * guessing game High and Low. The program selects a random odd number between 1
 * and 100. The player than tries to guess its value. After each, the program
 * gives a hint, "higher" or "lower". An execution might look like this:
 *
 * Guess 1: 67 Hint: higher Guess 2: 82 Hint: lower Guess 3: 77 Correct after
 * only 3 guesses - Brilliant! The program is terminated after 10 guesses with a
 * suitable comment.
 *
 * Notes:
 */
public class HighLow {
	public static void main(String[] args) {
		char restart;
		boolean winner;
		Scanner keyboard = new Scanner(System.in);
		/*
		 * Used a try-catch-finally statement without the catch part because Eclipse was
		 * complaining that the scanner was not closed and it could lead to resource
		 * leaks, i figured i could close it in the finally statement
		 */
		try {
			do {
				Random random = new Random();
				int min = 1;
				int max = 100;
				int secret = random.nextInt(max - min) + min;
				winner = false;
				ExcerciseHelpers.PrintWelcommeMessage(
						"*          This litle program is a number guessing game.               *");
				String[] instructions = { "Instructions:", "\n",
						"The secret number is a random positive integer between 1 and 100.", "\n",
						"You have 10 chances to try and guess it. Good Luck!", "\n" };
				ExcerciseHelpers.PrintStringArray(instructions);

				for (int guessNumber = 1; guessNumber <= 10; guessNumber++) {
					int guess = ExcerciseHelpers.GetPositiveIntegerWithValidation("Guess " + guessNumber + ": ",
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
				if (winner == false) {
					String[] looserMessage = { "You are out of guesses, in other words you lost!", "\n",
							"The correct answer was " + secret, "\n" };
					ExcerciseHelpers.PrintStringArray(looserMessage);
				}
				keyboard.nextLine();
				restart = ExcerciseHelpers.GetTryAgainChar(keyboard);
			} while (restart == 'Y' || restart == 'y');
		} finally {
			keyboard.close();
			System.exit(0);
		}
	}
}
