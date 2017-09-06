package acown09_assign1;

import java.util.Scanner;

/**
 * Created by: Admir Cosic, 2017-08-24 
 * Last changed by: Admir Cosic, 2017-08-31
 *
 * Exercise 1: Backwards
 */

public class Backwards {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		reverseStringInput(keyboard);
	}
	
	private static void reverseStringInput(Scanner keyboard) {
		char restart=0;
		String input=null;
		
		try {
			do {
				input = getString("Enter a line of text: ", keyboard);
				System.out.println("The backwards text string is: " + new StringBuilder(input).reverse());
				restart = getTryAgainChar(keyboard);
			} while (restart == 'Y' || restart == 'y');
		} finally {
			keyboard.close();
			System.exit(0);
		}
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
	
	private static String getString(String queryText, Scanner keyboard) {
		System.out.println(queryText);
		return keyboard.nextLine();
	}
}
