package acown09_assign1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by: Admir Cosic, 2017-08-26
 * Last changed by: Admir Cosic, 2017-09-07
 *
 * Exercise 6: CountChars
 */

public class CountChars {
	public static void main(String[] args) {        
		String filepath = "";
        
        if(args.length != 0) {
            filepath = args[0];
        }
        else {
            System.out.println("Error: Filepath parameter is missing!");
            System.exit(1);
        }
        countFileChars(filepath);
    }

	private static void countFileChars(String filepath) {
		int upperCaseChars = 0;
        int lowerCaseChars = 0;
        int whitespaceChars = 0;
        int numberChars = 0;
        int otherChars = 0;
        Scanner textfileScanner = null;

        try {
            File textfile = new File(filepath);
            textfileScanner = new Scanner(textfile);

            while(textfileScanner.hasNext()) {
                String row = textfileScanner.nextLine();
                for(int i = 0; i < row.length(); i++) {
                    char character = row.charAt(i);

                    if(Character.isUpperCase(character)) {
                        upperCaseChars++;
                        continue;
                    }

                    if(Character.isLowerCase(character)) {
                        lowerCaseChars++;
                        continue;
                    }

                    if(Character.isDigit(character)) {
                        numberChars++;
                        continue;
                    }

                    if(Character.isWhitespace(character)) {
                        whitespaceChars++;
                        continue;
                    }
                    otherChars++;
                }
            }

        }
        catch(FileNotFoundException e) {
            System.out.println("Error: The file was not found!");
            System.exit(1);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally
        {
        	textfileScanner.close();
        }
		String[] resultPrintout = { "Uppsercase: " + upperCaseChars,"Lowercase: " + lowerCaseChars, "Whitespaces: " + whitespaceChars,"Numbers: " + numberChars, "Others: " + otherChars};
		printStringArray(resultPrintout);
	}
	
	private static void printStringArray(String[] stringArray) {
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i]);
		}
	}
}
