package mypackage;

import java.io.*;
import java.util.*;


public class LockedMe01 {
	
	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(System.in);
		int choice = -1;
		int subChoice = -1;
		
		System.out.println("Welcome to LockedMe.com");
		System.out.println("Application Developer : Raheleh Samadi");
		System.out.println("\nFile Menu Related Application");
		
		do {
			
			System.out.println("--------------------------------");
			System.out.println("1: Display list of Files");
			System.out.println("2: Display the user interface");
			System.out.println("0: Exit");
			
			System.out.print("\nChoose your option: ");
			
			choice =scan.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("You are in Case 1");
				System.out.println("-----------------");
				LockedMe01.displayFile();		
				break;
			case 2:
				System.out.println("You are in Case 2");
				System.out.println("-----------------");
				System.out.println("11: Add File");
				System.out.println("12: Delete File");
				System.out.println("13: Search File");
				System.out.println("14: Back to Main Menu");
				
				System.out.print("Choose the operation to do...");
				subChoice=scan.nextInt();
				switch(subChoice)
				{
				case 11:
					LockedMe01.addFile();
					break;
				case 12:
					LockedMe01.deleteFile();
					break;
				case 13: 
					LockedMe01.searchFile();
					break;
				case 0:
					System.out.println("You are in Case 1");
					break;
				}
				break;
			case 0: 
				System.out.println("You exit from application");
				return;
			
			
			}
			
		}while(choice != 0);
		

	}
		
	public static void addFile() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter File name: ");
		String name = sc.nextLine();
		
        File fileObj = new File("D:\\Java_workspace\\Archive_Files\\\"",name);
        if (fileObj.createNewFile()) {
            System.out.println("File created: " + fileObj.getName());
        } else {
            System.out.println("File Exists Already");
        }
        sc.close();
	}
	
	public static void deleteFile() throws Exception {
		boolean success = false;
		Scanner sc = new Scanner(System.in);
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
				System.out.println(filename + " successfully created");
			else
				System.out.println("Failed to create new file:"+ filename);
		}
		
	    sc.close();
	}
	
	public static void searchFile() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter File name to search: ");
		String name = sc.nextLine();
			
			File fileObj = new File("D:\\Java_workspace\\Archive_Files\\",name);
		    if (fileObj.exists()) {
		      System.out.println("File_Name: " + fileObj.getName());
		      System.out.println("File_Readable " + fileObj.canRead());
		      System.out.println("File_Writeable: " + fileObj.canWrite());
		      System.out.println("File_Size in bytes " + fileObj.length());
		    }
		    else {
		    System.out.println("File not exist");
		   }

	    sc.close();
	}
	
	public static void sortFile() {
		File dir = new File("D:\\Java_workspace\\Archive_Files\\");

	    File[] files = dir.listFiles();

	    Arrays.sort(files, (f1, f2) -> f1.compareTo(f2));

	      for (File file : files) {
	         if (!file.isHidden()) {
	            if (file.isDirectory()) {
	               System.out.println("DIR \t" + file.getName());
	            } else {
	               System.out.println("FILE\t" + file.getName());
	            }
	         }
	      }
	   }
	
	public static void displayFile() {
		File folder = new File("D:\\Java_workspace\\Archive_Files\\");
		
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) 
			  System.out.println("File " + listOfFiles[i].getName());
			else
				System.out.println("There is No file");
	
		}
	}
}
