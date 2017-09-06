package acown09_assign1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by: Admir Cosic, 2017-08-27
 * Last changed by: Admir Cosic, 2017-08-31
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
		int to10 = 0;
		int to20 = 0;
		int to30 = 0;
		int to40 = 0;
		int to50 = 0;
		int to60 = 0;
		int to70 = 0;
		int to80 = 0;
		int to90 = 0;
		int to100 = 0;
		int to200 = 0;
		File fileToScan = new File(file);
		Scanner scanner = new Scanner(fileToScan);
		while(scanner.hasNext()){
			if(scanner.hasNextInt()) {
				int number = scanner.nextInt();
				if(number >= 1 && number <= 10){ to10++; }
				else if(number >= 11 && number <= 20){ to20++; }
				else if(number >= 21 && number <= 30){ to30++; }
				else if(number >= 31 && number <= 40){ to40++; }
				else if(number >= 41 && number <= 50){ to50++; }
				else if(number >= 51 && number <= 60){ to60++; }
				else if(number >= 61 && number <= 70){ to70++; }
				else if(number >= 71 && number <= 80){ to80++; }
				else if(number >= 81 && number <= 90){ to90++; }
				else if(number >= 91 && number <= 100){ to100++; }
				else if(number >= 101 && number <= 200){ to200++; }
			}
			else {
				scanner.next();
			}
		}
		scanner.close();
		printHistogram(to10, to20, to30, to40, to50, to60, to70, to80, to90, to100, to200);
	}

	private static void printHistogram(int to10, int to20, int to30, int to40, int to50, int to60, int to70, int to80,
			int to90, int to100, int to200) {
		int oneTo100 = to10 + to20 + to30 + to40 + to50 + to60 + to70 + to80 + to90 + to100;
		System.out.println("Number of integers in the interval [1, 100]: " + oneTo100);
		System.out.println("in the interval [101, 200]: " + to200);
		System.out.println("\n");		
		System.out.println("Histogram");
		printToConsole("1   - 10  |", to10);
		printToConsole("11  - 20  |", to20);
		printToConsole("21  - 30  |", to30);
		printToConsole("31  - 40  |", to40);
		printToConsole("41  - 50  |", to50);
		printToConsole("51  - 60  |", to60);
		printToConsole("61  - 70  |", to70);
		printToConsole("71  - 80  |", to80);
		printToConsole("81  - 90  |", to90);
		printToConsole("91  - 100 |", to100);
		printToConsole("101 - 200 |", to200);
	}
	public static void printToConsole(String string, int amount){
		System.out.print(string);
		for(int i = 0; i < amount; i++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
