//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      11/06/23
//*   Purpose   Array List, Parsing files, try catch, constructors, and objects  
//***********************************************************************************************************

import java.io.File;                                                                 // Import the File class to read the file
import java.io.FileNotFoundException;                                                // Import FileNotFoundException to handle file-related errors
import java.util.ArrayList;                                                          // Import ArrayList
import java.util.Scanner;                                                            // Import Scanner 

public class ArrayOperationsTest                                                     // declare arrayopeerationstest class   
{     
   private static ArrayList<Float> numbersArrayList = new ArrayList<>();             // declare and initialize numberArrayList  an ArrayList type float            
   
   public static void main(String[] args)                                            // declare main method    
   {  
      // calls 
      fileReader( "numbers.txt" );                                                   // calls fileReader method, and sends the numbers.txt
      float total = ArrayOperations.getTotalFloat( numbersArrayList );               // calls ArrayOperations and gets the total
      float average = ArrayOperations.getAverageFloat( numbersArrayList );           // calls ArrayOperations and gets the avg 
      float highest = ArrayOperations.getHighestFloat( numbersArrayList );           // calls ArrayOperations and gets the max 
      float lowest = ArrayOperations.getLowestFloat( numbersArrayList );             // calls ArrayOperations and gets the min 

      // Print output 
      System.out.printf("Total: %.2f%n", total );                                    // gets total and prints it
      System.out.printf("Average: %.2f%n",  average );                               // gets avg and prints it              
      System.out.printf("Lowest: %.2f%n", lowest );                                  // gets lowest and prints it          
      System.out.printf("Highest: %.2f%n", highest );                                // gets highest and prints it                  
   } // main()
      
   public static void fileReader( String fileName ) 
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
} // ArrayOperationsTest