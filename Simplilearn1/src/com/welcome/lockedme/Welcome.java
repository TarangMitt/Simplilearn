package com.welcome.lockedme;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) throws IOException{
		
		System.out.println("Welcome to Lockedme.com");
		System.out.println("--------------------------");
		System.out.println("Please Select From The Below Options To Proceed:\n");
		System.out.println("1. List Of Files in Current Directory");
		System.out.println("2. Add/Delete/Search File");
		System.out.println("3. Close The Application");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please Select an Option:");
		int n = s.nextInt();
		while(n <3) {
			System.out.println("Please Select From The Below Options To Proceed:\n");
			System.out.println("1. List Of Files in Current Directory");
			System.out.println("2. Add/Delete/Search File");
			System.out.println("3. Close The Application");
			n = s.nextInt();
		switch(n) {
		case 1:
			 //Creating a File object for directory
		      File directoryPath = new File("D:\\Certificates");
		      //List of all files in the directory
		      String contents[] = directoryPath.list();
		      System.out.println("List of files and directories in the specified directory:");
		      for(int i=0; i<contents.length; i++) {
		         System.out.println(contents[i]);
		      }
            break;
        case 2:
            System.out.println("Add a New File");
            System.out.println("Delete a New File");
            System.out.println("Search a New File");
            Scanner num = new Scanner(System.in);
            int Op = num.nextInt();
            switch(Op) {
            case 1:
            	System.out.println("Enter the File Name to be created:");
            	Scanner name = new Scanner(System.in);
            	String fileName = name.nextLine();
            	try {
            	      File myObj = new File(fileName);
            	      if (myObj.createNewFile()) {
            	        System.out.println("File created: " + myObj.getName());
            	      } else {
            	        System.out.println("File already exists.");
            	      }
            	    } catch (IOException e) {
            	      System.out.println("An error occurred.");
            	      e.printStackTrace();
            	    }
            	break;
            case 2:
            	System.out.println("Enter the File Name to be Deleted:");
            	Scanner deleteName = new Scanner(System.in);
            	String deleteFileName = deleteName.nextLine();
            	try  
            	{         
            	File f= new File(deleteFileName);           //file to be delete  
            	if(f.delete())                      //returns Boolean value  
            	{  
            	System.out.println(f.getName() + " deleted");   //getting and printing the file name  
            	}  
            	else  
            	{  
            	System.out.println("failed");  
            	}  
            	}  
            	catch(Exception e)  
            	{  
            	e.printStackTrace();  
            	} 
            	
            	break;
            case 3:
            	System.out.println("Enter the File Name to be Deleted:");
            	Scanner directory = new Scanner(System.in);
            	String directoryName = directory.nextLine();
            	File directory1 = new File(directoryName);
            	  
                // store all names with same name
                // with/without extension
                String[] flist = directory1.list();
                int flag = 0;
                if (flist == null) {
                    System.out.println("Empty directory.");
                }
                else {
                	  
                    // Linear search in the array
                    for (int i = 0; i < flist.length; i++) {
                        String filename = flist[i];
                        if (filename.equalsIgnoreCase("file.cpp")) {
                            System.out.println(filename + " found");
                            flag = 1;
                        }
                    }
                }
          
                if (flag == 0) {
                    System.out.println("File Not Found");
                }
                break;
                default:
                	System.out.println("Opps! Wrong Choice");
                    break;
            	
            }
            break;
        case 3:
            System.out.println("Closing The Application. GoodBye....!!");
            break;
        default:
            System.out.println("Opps! Wrong Choice");
            break;
		}
		}
	}
}
