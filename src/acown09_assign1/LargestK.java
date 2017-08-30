/**
 *
 */
package acown09_assign1;

import java.util.Scanner;

/**
 * Created by: Admir Cosic, 2017-08-24 
 * Last changed by: Admir Cosic, 2017-08-27
 *
 * Exercise 2: LargestK Write a program LargestK.java that for an arbitrary
 * positive integer N (read from the keyboard) computes the largest K such that
 * 0+2+4+6+8+...+K ≤ N. For example N=5 => K=2 (0+2<5 but 0+2+4>5), N=110 =>
 * K=20, etc.
 *
 * Notes:
 */

public class LargestK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int input = 0;
		int K = 0;
		int sum = 0;
		char restart;
		Scanner keyboard = new Scanner(System.in);
		/*
		 * Used a try-catch-finally statement without the catch part because Eclipse was
		 * complaining that the scanner was not closed and it could lead to resource
		 * leaks, i figured i could close it in the finally statement
		 */
		try {
			do {
				input = 0;
				K = 0;
				sum = 0;

				ExcerciseHelpers.PrintWelcommeMessage(
						"*        This litle program is used to computes the largest K.         *");
				input = ExcerciseHelpers.GetPositiveIntegerWithValidation("Provide a positive integer: ", keyboard);
				for (int i = 0; sum <= input; i += 2) {
					sum += i;
					K = i;
				}
				K -= 2;
				String[] resultPrintout = { "\n", "N: " + input, "\n", "Largest K: " + K, "\n", "\n" };
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
