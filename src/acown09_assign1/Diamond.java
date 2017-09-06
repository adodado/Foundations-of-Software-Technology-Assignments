package acown09_assign1;
import java.util.Scanner;

/**
 * Created by: Admir Cosic, 2017-08-26 
 * Last changed by: Admir Cosic, 2017-08-31
 *
 * Exercise 5: Diamond
 */
public class Diamond {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		printDiamond(keyboard);
	}

	private static void printDiamond(Scanner keyboard) {
		try {
				int width = getOddPositiveInteger("Please provide an odd, positive integer: ",
						keyboard);
				
				for (int i = 1; i <= width; i += 2) {
					System.out.println();
					for (int j = 0; j < width; j++) {
						if (j < (width - i) / 2 || j > (width - (width - i) / 2) - 1) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}
					}
				}
				
				for (int i = width - 2; i > 0; i -= 2) {
					System.out.println();
					for (int j = 0; j < width; j++) {
						if (j < (width - i) / 2 || j > (width - (width - i) / 2) - 1) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}
					}
				}
				System.out.print("\n");
				keyboard.nextLine();
		} finally {
			System.out.print("\n");
			System.out.print("Exiting the program, goodbye!");
			keyboard.close();
			System.exit(0);
		}
	}
	public static int getOddPositiveInteger(String queryText, Scanner keyboard) {
		int value = 0;
		int input = 0;
		System.out.println(queryText);
			if (keyboard.hasNextInt()) {
				input = keyboard.nextInt();
				if (input == 0) {
					System.out.println("Error: You entered a number that is equal to zero");
					System.out.print("\n");
					System.out.print("Exiting the program, goodbye!");
					System.exit(-1);
				} else if (input > 0) {
					if (input % 2 == 0) {
						System.out.println("Error: You entered an even number");
						System.out.print("\n");
						System.out.print("Exiting the program, goodbye!");
						System.exit(-1);
					} else {
						value = input;
					}
				} else {
					System.out.println("Error: You entered a number that is negative");
					System.out.print("\n");
					System.out.print("Exiting the program, goodbye!");
					System.exit(-1);
				}
			} else {
				System.out.println("Error: Only numbers are valid entries!");
				System.out.print("\n");
				System.out.print("Exiting the program, goodbye!");
				System.exit(-1);
			}
		return value;
	}
}