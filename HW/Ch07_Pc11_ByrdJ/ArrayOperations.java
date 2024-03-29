/*
Chapter 7 Programming Challenge 11 Array Operations

7-10. Array Operations

Demonstrate your methods using arrays of 10 different values.
You should have an ArrayOperations.java file for the class and call the methods on test arrays in a ArrayOperationsTest.java class that houses your main.  

Write a class name ArrayOperations with the following static methods. 

 - getTotal  This method should accept one dimensional array as it argument and return the total of the values in the array.  
 - getAverage This method should accept 1 dimensional array as it's argument and return the average of the values in the array.  
 - getHighest  This method should accept 1 dimensional array as it's argument and return the Highest of the values in the array.  
 - getLowest This method should accept 1 dimensional array as it's argument and return the lowest of the values in the array. 
 Create overloaded methods for each of these data types.  Float, double, int and long. 
 
 
7-11. Number Analysis Class
Write a class with a constructor that accepts a file name as its argument. Assume
the file contains a series of numbers, each written on a separate line. The class
should read the contents of the file into an array, and then displays the following
data:
• The lowest number in the array
• The highest number in the array
• The total of the numbers in the array
• The average of the numbers in the array

  
Added Specifications:

    must implement this assignment using a class for the data and methods
    must submit the UML and ensure it is correct and complete (shows relationships between classes)
    all constructors must initialize all class fields
    must submit both the Number java class file and the NumberTest file.
    all Number java class methods are commented    
    all Number class properties are commented
    NumberTest must have the comments for every statement, e.g., lines that end in a semi-colon
    NumberTest must have comments for end curly braces of all structures
    Must implement using an ArrayList instead of an array
    All occurrences of "should" in the textbook-specs must be read as if they were "must"

Grading Criteria:

    NumberTest must meet the following requirements AND IN THIS ORDER:
    1. Only create string constants for literals that are unusually long, or if used in more than one place and are not trivial
    2. declare variables (primitive and referential data types); declare Number class objects here. 
    3. initialize variables (primitive and referential data types) after declaration (you can use the declare&define format) and within housekeeping
    4. ONLY INITIALIZE VARIABLES IF THEY ARE REFERENCED BEFORE THEY ARE DEFINED -- ASSUME THAT THIS REQUIREMENT APPLIES TO ALL FUTURE ASSIGNMENTS
    5. input section gets the contents from the Numbers.txt file (can be found in the Chapter 4 student data folder) -- note that it is far easier to copy this file into the same folder in which you have your program
    6. code cannot exploit any "insider knowledge" of the contents of the Numbers.txt file, other than it being a file of floats
    7. input section calls appropriate setter passing in the correct array information
    8. output section has report header information
    9. output section displays a report of the lowest, highest, total and average of the numbers be calling the appropriate class methods

    
    Your tester class will also create an ArrayList, initialize it from the data file, and send it to those methods for processing. No arrays should be used in this assignment, use the ArrayList type instead.
    Note that since ArrayList can only holds objects, you will have to also ignore the textbook’s demand to “Use any primitive data type”. So, to use the ArrayList, you will need to use an object, e.g., String, Integer, etc. 
    Hope this helps reduce confusion,
*/


//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      11/06/23
//*   Purpose   Array List, Parsing files, try catch, constructors, and objects 
//***********************************************************************************************************

import java.util.ArrayList;                                                       // import array list utility             

public class ArrayOperations                                                      // declare ArrayOperations class 
{  
   // getTotal methods 
   // My text was missing pages, so I am unsure as what the specs were for 7-11
   public static double getTotalDouble( ArrayList< Double > numbersArrayList )    // declare getTotal method 1 double arg       
   {                                                                              // originally these were overloaded methods with arrays, because that's what the specs I found on the internet said, but I could not figure out how to do that with array list. So I changed the names.
      double total = 0;                                                           // declare and initialize total  
      for ( double element : numbersArrayList) total += element ;                 // For loop.  Parses through each element of the array adding each to total.  
      return total;                                                               
   } // return total from array list
   
   public static float getTotalFloat( ArrayList< Float > numbersArrayList )       // declare getTotal method 1 float arg 
   {
      float total = 0;                                                            // declare and initialize total  
      for ( float element : numbersArrayList) total += element ;                  // For loop.  Parses through each element of the array adding each to total.      
      return total;                                                               
   } // return total from array list
   
   public static int getTotalInteger( ArrayList< Integer > numbersArrayList )     // declare getTotal method 1 int arg     
   {
      int total = 0;                                                              // declare and initialize total  
      for ( int element : numbersArrayList) total += element ;                    // For loop.  Parses through each element of the array adding each to total.    
      return total;                                                               
   } // return total from array list
   
   public static long getTotalLong( ArrayList< Long > numbersArrayList )          // declare getTotal method 1 long arg        
   {
      long total = 0;                                                             // declare and initialize total  
      for ( long element : numbersArrayList) total += element ;                   // For loop.  Parses through each element of the array adding each to total.      
      return total;                                                               
   } // return total from array list
   
   // getAverage methods
   public static double getAverageDouble( ArrayList< Double > numbersArrayList )  // delcare getAverage method 1 double arg    
   {
      double total = 0;                                                           // declare and initialize total               
      for ( double element : numbersArrayList) total += element ;                 // For loop.  Parses through each element of the array adding each to total.  
      return total / numbersArrayList.size();                                     // calc avg    
   } // return avg from array list
   
   public static float getAverageFloat( ArrayList< Float > numbersArrayList )     // delcare getAverage method 1 float arg      
   {
      float total = 0;                                                            // declare and initialize total     
      for ( float element : numbersArrayList) total += element ;                  // For loop.  Parses through each element of the array adding each to total.  
      return total / numbersArrayList.size();                                     // calc avg
   } // return avg from array list
   
   public static int getAverageInteger( ArrayList< Integer > numbersArrayList )   // delcare getAverage method 1 int arg        
   {
      int total = 0;                                                              // declare and initialize total  
      for ( int element : numbersArrayList) total += element ;                    // For loop.  Parses through each element of the array adding each to total.  
      return total / numbersArrayList.size();                                     // calc avg       
   } // return avg from array list
   
   public static long getAverageLong( ArrayList< Long > numbersArrayList )        // delcare getAverage method 1 long arg           
   {
      long total = 0;                                                             // declare and initialize total            
      for ( long element : numbersArrayList) total += element ;                   // For loop.  Parses through each element of the array adding each to total.  
      return total / numbersArrayList.size();                                     // calc avg        
   } // return avg from array list
   
   // getHighest methods
   public static double getHighestDouble( ArrayList< Double > numbersArrayList )  // delcare getHighest method 1 double arg  
   {
      double max = numbersArrayList.get(0);                                       // declare and initialize max  
      for ( double element : numbersArrayList)                                    // for loop.  Parses through the array.          
      { 
         if ( element > max ) max = element;                                      // if element is greater, it becomes the new max
      }
      return max;                                                                        
   } // return max from array list
   
   public static float getHighestFloat( ArrayList< Float > numbersArrayList )     // delcare getHighest method 1 float arg
   {
      float max = numbersArrayList.get(0);                                        // declare and initialize max 
      for ( float element : numbersArrayList)                                     // for loop.  Parses through the array.        
      { 
         if ( element > max ) max = element;                                      // if element is greater, it becomes the new max
      }
      return max;                                                                       
   } // return max from array list
   
   public static int getHighestInteger( ArrayList< Integer > numbersArrayList )   // delcare getHighest method 1 int arg        
   {
      int max = numbersArrayList.get(0);                                          // declare and initialize max 
      for ( int element : numbersArrayList)                                       // for loop.  Parses through the array.      
      { 
         if ( element > max ) max = element;                                      // if element is greater, it becomes the new max
      }
      return max;                                                                       
   } // return max from array list
   
   public static long getHighestLong( ArrayList< Long > numbersArrayList )        // delcare getHighest method 1 long arg
   {
      long max = numbersArrayList.get(0);                                         // declare and initialize max 
      for ( long element : numbersArrayList)                                      // for loop.  Parses through the array. 
      { 
         if ( element > max ) max = element;                                      // if element is greater, it becomes the new max
      }
      return max;
   } // return max from array list
   
   // getLowest methods
   public static double getLowestDouble( ArrayList< Double > numbersArrayList )   // delcare getLowest method 1 double arg
   {
      double min = numbersArrayList.get(0);                                       // declare and initialize min 
      for ( double element : numbersArrayList)                                    // for loop.  Parses through the array. 
      { 
         if ( element < min ) min = element;                                      // if element is less, it becomes the new min
      }
      return min;
   } // return min from array list
   
   public static float getLowestFloat( ArrayList< Float > numbersArrayList )      // delcare getLowest method 1 float arg
   {
      float min = numbersArrayList.get(0);                                        // declare and initialize min 
      for ( float element : numbersArrayList)                                     // for loop.  Parses through the array. 
      { 
         if ( element < min ) min = element;                                      // if element is less, it becomes the new min
      }
      return min;
   } // return min from array list
   
   public static int getLowestInteger( ArrayList< Integer > numbersArrayList )    // delcare getLowest method 1 int arg
   {
      int min = numbersArrayList.get(0);                                          // declare and initialize min 
      for ( int element : numbersArrayList)                                       // for loop.  Parses through the array. 
      { 
         if ( element < min  ) min = element;                                     // if element is less, it becomes the new min
      }
      return min;
   } // return min from array list
   
   public static long getLowestLong( ArrayList< Long > numbersArrayList )         // delcare getLowest method 1 long arg
   {
      long min = numbersArrayList.get(0);                                         // declare and initialize min 
      for ( long element : numbersArrayList)                                      // for loop.  Parses through the array. 
      { 
         if ( element < min ) min = element;                                      // if element is less, it becomes the new min
      }
      return min;
   } // return min from array list
} // ArrayOperations