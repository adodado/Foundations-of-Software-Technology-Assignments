package acown09_assign1;

import java.util.Scanner;

/**
 * Created by: Admir Cosic, 2017-08-24 
 * Last changed by: Admir Cosic, 2017-09-07
 *
 * Exercise 1: Backwards
 */

public class Backwards {
	public static String input=null;
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		reverseStringInput(keyboard);
	}
	
	private static void reverseStringInput(Scanner keyboard) {
		try {
				input = getString("Enter a line of text: ", keyboard);
				System.out.println("The backwards text string is: " + new StringBuilder(input).reverse());
		} finally {
			keyboard.close();
			System.exit(0);
		}
	}
	
	private static String getString(String queryText, Scanner keyboard) {
		System.out.println(queryText);
		return keyboard.nextLine();
	}
}
