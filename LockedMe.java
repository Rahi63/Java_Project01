package mypackage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LockedMe {

	public static void main(String[] args) throws IOException {
		System.out.println("\t\tWelcome to LockedMe.com");
		System.out.println("\t\tDeveloper: Raheleh Samadi\n");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. Add a file to the application");
		System.out.println("2. Delete a file from the application");
		System.out.println("3. Search a file from the application");
		System.out.println("4. Back to Home");
		
		System.out.println("\nPlease enter a desired operation number:");
		int number = scan.nextInt();
		
		switch(number) {
		case 1:
			LockedMe.addFile();
			break;
		case 2:
			System.out.println("Code for Delete a file");
			break;
		case 3:
			System.out.println("Code for Search a file");
			break;
		case 4:
			System.out.println("Code for Sort file names");
			break;
		case 5:
			System.out.println("Code for back to home");
			break;
		case 6:
			return;
		}
	
		
		
	}
	
	public static void addFile() throws IOException {
		Scanner sc = new Scanner(System.in);
		boolean success = false;
		
		System.out.println("Enter file name to be created: ");
		String filename = sc.nextLine();
		
		File file = new File("D:\\Java_workspace\\Archive_Files\\", filename);
		if(file.exists())
			System.out.println("File already exists");
		else
		{
			//System.out.println("No such file exists, creating now");
			success = file.createNewFile();
			if(success)
				System.out.printf("%s successfully created%n" , filename);
			else
				System.out.printf("Failed to create new file: %s%n", filename);
		}
		sc.close();
			
		
	}

}
