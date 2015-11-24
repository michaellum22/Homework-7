/* I had help from the site http://www.avajava.com/tutorials/lessons/how-do-i-recursively-display-all-files-and-directories-in-a-directory.html,
as well as the site:http://tutorials.jenkov.com/java-io/file.html#makeDir for this homework. I also learned that some Java packages provide
the appropiate functions for this type of work, such as .getCanonicalPath from the  java.io.File package. I also found a handy getName() function from http://www.tutorialspoint.com/java/lang/class_getname.htm
to get the names of the folders.
*/

import java.io.*;
//import java.io.File;
//import java.io.IOException; Not needed since I don't have an exceptions

public class FileSearch {
    
    public static void main(String[] args)
    {
        
        int num = 0;
        File findfile = new File("/Users/"); //Finds all folders on the Mac
        Search(findfile, num);				 // Searches for files
        
    }
    public static void Search(File file2, int num) // I needed a function to find all the files instead of using main
    {
        File[] files = file2.listFiles();
        for (File filefolder: files)
        {
        	/*  if (filefolder.isDirectory()) { This code only finds the folders in the current folder, which is pointless
                  try {
                      System.out.println(filefolder.getCanonicalPath());
                  } catch (IOException e) {
                     
                      e.printStackTrace();
                  }
                  
                  System.out.print(fileNames[j]);
                  j++;
                  
              }
          } */
            if (filefolder.isDirectory())// function I found from http://tutorials.jenkov.com/java-io/file.html#makeDir
            {
                if (num == 0)	// Prints the file name and is the base case
                    System.out.println(filefolder.getName()); 
                else if (num > 0)
                    System.out.println(filefolder.getName()); // Prints the file name
                  Search(filefolder, num); // Recursively finds the folders
            }
        }
        
    }
}


