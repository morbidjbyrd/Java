//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      11/06/23
//*   Purpose   Array List, Parsing files, try catch, constructors, and objects 
//***********************************************************************************************************

import java.io.File;                                                                 // Import the File class to read the file
import java.io.FileNotFoundException;                                                // Import FileNotFoundException to handle file-related errors
import java.util.ArrayList;                                                          // Import ArrayList
import java.util.Scanner;                                                            // Import Scanner 

public class Number                                                                  // declare NumberTest Class
{
   private ArrayList<Float> numbersArrayList;                                        // declare numberArrayList  an ArrayList type float            
   
   // Constructor that accepts a file name and reads numbers from the file
   public Number( String fileName ) 
   {
      numbersArrayList = new ArrayList<>();                                          // Create an ArrayList     
      fileReader( fileName );                                                        // Call the method to read numbers from the file
   } // NumberTest Constructor 
   
   // File reader method
   public void fileReader( String fileName ) 
   {
      float number;                                                                  // declare primitive float number
      File file = new File(fileName);                                                // Create a new file named file
   
   // try-catch                                                                      // used in programming to handle potential errors or exceptions that may occur during the execution of code.
      try                                                                            // This block contains the code that might cause an error or exception.                                                             
      {
         Scanner inputFile = new Scanner(file);                                      // Create a new Scanner object inputFile
         while (inputFile.hasNext())                                                 // while loop.  Reads entire file contents
         {
            number = inputFile.nextFloat();                                          // number gets input from file
            numbersArrayList.add(number);                                            // adds number to the array list
         } // while loop
         inputFile.close();                                                          // closes file
      } // try this 
      catch (FileNotFoundException e)                                                // if an error or exception occurs within the "try" block, the code inside the "catch" block is executed.   "e" is a commonly used variable name for the exception object
      {                                                                              // if file is not found, print error. 
         System.out.printf("File not found: " + fileName);
      } // if catch errors
                                                                                     // for ( float element : numbersArrayList ) { System.out.printf( "%.2f%n", element );}                                                                     
   } //fileReader()
   
   // accessor methods
   public double getTotalFloat()                                                     // getTotalFloat method                                              
   {
      return ArrayOperations.getTotalFloat(numbersArrayList);                        // calc total of array list and return
   }
   
   public double getAverageFloat()                                                   // getavgFloat method     
   {
      return ArrayOperations.getAverageFloat(numbersArrayList);                      // calc avg of array list and return
   }
   
   public double getLowestFloat()                                                    // getlowestFloat method    
   {
      return ArrayOperations.getLowestFloat(numbersArrayList);                       // calc min of array list and return
   }

   public double getHighestFloat()                                                   // getHighestFloat method    
   {
      return ArrayOperations.getHighestFloat(numbersArrayList);                      // calc max of array list and return
   }
} // NumberTest class
