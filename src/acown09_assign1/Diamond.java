/**
 *
 */
package acown09_assign1;

import java.util.Scanner;

/**
 * Student: Admir Cosic
 *
 * Exercise 5: Diamond Write a program Diamond.java that for an arbitrary
 * positive and odd integer (read from the keyboard) prints a "diamond".
 *
 */
public class Diamond {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char restart;
		Scanner keyboard = new Scanner(System.in);
		int width = ExcerciseHelpers.GetOddPositiveIntegerWithValidation("Please provide an odd, positive integer: ",
				keyboard);
		/*
		 * Used a try-catch-finally statement without the catch part because Eclipse was
		 * complaining that the scanner was not closed and it could lead to resource
		 * leaks, i figured i could close it in the finally statement
		 */
		try {
			do {
				// Nested loops, this first one is for each row
				for (int i = 1; i <= width; i += 2) {
					System.out.println();
					// The second loop is for each character on a row
					for (int j = 0; j < width; j++) {
						// Determines whether a character should be a star or a white space
						if (j < ((width - i) / 2) || j > (width - ((width - i) / 2)) - 1) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}
					}
				}

				// Same as the loops above, but in the opposite order, starting with the maximum
				// number of stars and working our
				// way down
				for (int i = width - 2; i > 0; i -= 2) {
					System.out.println();
					for (int j = 0; j < width; j++) {
						if (j < ((width - i) / 2) || j > (width - ((width - i) / 2)) - 1) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}
					}
				}

				System.out.print("\n");
				keyboard.nextLine();
				restart = ExcerciseHelpers.GetTryAgainChar(keyboard);
			} while (restart == 'Y' || restart == 'y');
		} finally {
			keyboard.close();
			System.exit(0);
		}
	}
}