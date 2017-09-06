package acown09_assign1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by: Admir Cosic, 2017-08-26
 * Last changed by: Admir Cosic, 2017-08-31
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
		int upperCase = 0;
        int lowerCase = 0;
        int whitespace = 0;
        int numbers = 0;
        int other = 0;
        Scanner fileScan = null;

        try {
            File file = new File(filepath);
            fileScan = new Scanner(file);

            while(fileScan.hasNext()) {
                String row = fileScan.nextLine();
                for(int i = 0; i < row.length(); i++) {
                    char character = row.charAt(i);

                    if(Character.isUpperCase(character)) {
                        upperCase++;
                        continue;
                    }

                    if(Character.isLowerCase(character)) {
                        lowerCase++;
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
            System.out.println("Error: The file was not found!");
            System.exit(1);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally
        {
        	fileScan.close();
        }
		String[] resultPrintout = { "Uppsercase: " + upperCase,"Lowercase: " + lowerCase, "Whitespaces: " + whitespace,"Numbers: " + numbers, "Others: " + other};
		printStringArray(resultPrintout);
	}
	
	private static void printStringArray(String[] stringArray) {
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i]);
		}
	}
}
