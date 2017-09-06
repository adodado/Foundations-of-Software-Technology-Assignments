/**
 *
 */
package acown09_assign1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by: Admir Cosic, 2017-08-24 
 * Last changed by: Admir Cosic, 2017-08-27
 *
 * Exercise 6: CountChars Write a program CountChars.java that counts different
 * types of characters in a text that is read from a file. The program should
 * count how many characters were found in the following categories:
 *
 * Upper case letters Lower case letters "Whitespace" (i.e., space, tab, and
 * return) Other characters Numbers.
 *
 * The path to the text file should be given as a parameter to the main method.
 *
 */
public class CountChars {
	public static void main(String[] args) {
        int uppercase = 0;
        int lowercase = 0;
        int whitespace = 0;
        int numbers = 0;
        int other = 0;
        Scanner fileScan = null;
        String filepath = "";
        
        if(args.length != 0) {
            filepath = args[0];
        }
        else {
            System.out.println("CountChars expects a filepath as a parameter!");
            System.exit(1);
        }
        try {
            File file = new File(filepath);
            fileScan = new Scanner(file);

            while(fileScan.hasNext()) {
                String row = fileScan.nextLine();
                for(int i = 0; i < row.length(); i++) {
                    char character = row.charAt(i);

                    if(Character.isUpperCase(character)) {
                        uppercase++;
                        continue;
                    }

                    if(Character.isLowerCase(character)) {
                        lowercase++;
                        continue;
                    }

                    if(Character.isDigit(character)) {
                        numbers++;
                        continue;
                    }

                    if(Character.isWhitespace(character)) {
                        whitespace++;
                        continue;
                    }
                    other++;
                }
            }

        }
        catch(FileNotFoundException e) {
            System.out.println("You suck! File was not found.");
            System.exit(1);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally
        {
        	fileScan.close();
        }
        System.out.println("Uppsercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);
        System.out.println("Whitespaces: " + whitespace);
        System.out.println("Numbers: " + numbers);
        System.out.println("Others: " + other);
    }
}
