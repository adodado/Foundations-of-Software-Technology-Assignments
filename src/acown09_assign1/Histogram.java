package acown09_assign1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by: Admir Cosic, 2017-08-27
 * Last changed by: Admir Cosic, 2017-09-07
 *
 * Exercise 8: Histogram
 */

public class Histogram {

	public static void main(String[] args) {
		String file = "";
        
        if(args.length != 0) {
        	file = args[0];
        }
        else {
            System.out.println("Error: Filepath parameter is missing!");
            System.exit(1);
        }
        
		try {
			System.out.println("Reading integers from the file: " + file);
			readAndPrint(file);
		}
        catch(Exception e) {
            e.printStackTrace();
        }
	}
	
	public static void readAndPrint(String file) throws FileNotFoundException{
		int numbers1To10 = 0;
		int numbers11To20 = 0;
		int numbers21To30 = 0;
		int numbers31To40 = 0;
		int numbers41To50 = 0;
		int numbers51To60 = 0;
		int numbers61To70 = 0;
		int numbers71To80 = 0;
		int numbers81To90 = 0;
		int numbers91To100 = 0;
		int numbers101To200 = 0;
		File inputFile = new File(file);
		Scanner fileScanner = new Scanner(inputFile);
		
		while(fileScanner.hasNext()){
			if(fileScanner.hasNextInt()) {
				int number = fileScanner.nextInt();
				if(number >= 1 && number <= 10){ numbers1To10++; }
				else if(number >= 11 && number <= 20){ numbers11To20++; }
				else if(number >= 21 && number <= 30){ numbers21To30++; }
				else if(number >= 31 && number <= 40){ numbers31To40++; }
				else if(number >= 41 && number <= 50){ numbers41To50++; }
				else if(number >= 51 && number <= 60){ numbers51To60++; }
				else if(number >= 61 && number <= 70){ numbers61To70++; }
				else if(number >= 71 && number <= 80){ numbers71To80++; }
				else if(number >= 81 && number <= 90){ numbers81To90++; }
				else if(number >= 91 && number <= 100){ numbers91To100++; }
				else if(number >= 101 && number <= 200){ numbers101To200++; }
			}
			else {
				fileScanner.next();
			}
		}
		fileScanner.close();
		printHistogram(numbers1To10, numbers11To20, numbers21To30, numbers31To40, numbers41To50, numbers51To60, numbers61To70, numbers71To80, numbers81To90, numbers91To100, numbers101To200);
	}

	private static void printHistogram(int numbers1To10, int numbers11To20, int numbers21To30, int numbers31To40, int numbers41To50, int numbers51To60, int numbers61To70, int numbers71To80,
			int numbers81To90, int numbers91To100, int numbers101To200) {
		int numbers1To100 = numbers1To10 + numbers11To20 + numbers21To30 + numbers31To40 + numbers41To50 + numbers51To60 + numbers61To70 + numbers71To80 + numbers81To90 + numbers91To100;
		System.out.println("Number of integers in the interval [1, 100]: " + numbers1To100);
		System.out.println("in the interval [101, 200]: " + numbers101To200);
		System.out.println("\n");		
		System.out.println("Histogram");
		printToConsole("1   - 10  |", numbers1To10);
		printToConsole("11  - 20  |", numbers11To20);
		printToConsole("21  - 30  |", numbers21To30);
		printToConsole("31  - 40  |", numbers31To40);
		printToConsole("41  - 50  |", numbers41To50);
		printToConsole("51  - 60  |", numbers51To60);
		printToConsole("61  - 70  |", numbers61To70);
		printToConsole("71  - 80  |", numbers71To80);
		printToConsole("81  - 90  |", numbers81To90);
		printToConsole("91  - 100 |", numbers91To100);
		printToConsole("101 - 200 |", numbers101To200);
	}
	public static void printToConsole(String string, int amount){
		System.out.print(string);
		for(int i = 0; i < amount; i++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
