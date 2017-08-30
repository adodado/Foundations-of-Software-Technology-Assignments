/**
 *
 */
package acown09_assign1;

import java.util.Scanner;

/**
 * Created by: Admir Cosic, 2017-08-24 Last changed by: Admir Cosic, 2017-08-27
 *
 * Exercise 1: Backwards Write a program Backwards.java that reads a line of
 * text from the keyboard and then prints the sentence in reverse order on the
 * screen. An execution might look like this:
 *
 * Type a line of text: Hello! My name is Jonas Lundberg. Backwards: .grebdnuL
 * sanoJ si eman yM !olleH
 *
 */

public class Backwards {

	public static void main(String[] args) {
		char restart;
		String input;
		Scanner keyboard = new Scanner(System.in);
		/*
		 * Used a try-catch-finally statement without the catch part because Eclipse was
		 * complaining that the scanner was not closed and it could lead to resource
		 * leaks, i figured i could close it in the finally statement
		 */
		try {
			do {
				ExcerciseHelpers.PrintWelcommeMessage(
						"*        This litle program is used to reverse strings of text.        *");
				input = ExcerciseHelpers.GetString("Enter a line of text: ", keyboard);
				System.out.println("The backwards text string is: " + (new StringBuilder(input).reverse().toString()));
				restart = ExcerciseHelpers.GetTryAgainChar(keyboard);
			} while (restart == 'Y' || restart == 'y');
		} finally {
			keyboard.close();
			System.exit(0);
		}
	}
}
