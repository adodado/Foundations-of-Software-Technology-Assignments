package acown09_assign1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by: Admir Cosic, 2017-08-27
 * Last changed by: Admir Cosic, 2017-09-07
 *
 * Exercise 9: CountJava
 */

public class CountJava {
	public static Scanner fileScanner;
	
	public static void main(String[] args) {
        if(args.length != 0) {
    		try {
    			File directoryParameter = new File(args[0]);
    			System.out.println("Root directory: " + directoryParameter);
    			scanJavaFilesInDirectory(directoryParameter);
    		} 
            catch(Exception e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Error: directory parameter is missing!");
            System.exit(1);
        }
	}

	public static void scanJavaFilesInDirectory(File directory) throws FileNotFoundException{
		try {
			for(File file: directory.listFiles()) {
				if(file.isDirectory()) {
					scanJavaFilesInDirectory(file);
				} else if(file.getName().contains(".java")){
					int numberOfLines = scanFileForLines(file);
					print(file.getName(), numberOfLines);
				}
			}
		} 
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static int scanFileForLines(File file) throws FileNotFoundException {
		int numberOfLines = 1;
		fileScanner = new Scanner(file);
			while(fileScanner.hasNextLine()) {
				fileScanner.nextLine();
				numberOfLines++;
			} 
			fileScanner.close();
		return numberOfLines;
	}

	public static void print(String string, int numberOfLines){
		System.out.println(string + " - Lines: " + numberOfLines);
	}

}