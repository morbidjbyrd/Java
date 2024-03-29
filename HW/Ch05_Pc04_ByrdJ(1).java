/*
9. Paint Job Estimator
A painting company has determined that for every 115 square feet of wall space, one gallon of paint
and eight hours of labor will be required. The company charges $20.00 per hour for labor. Design a
modular program that asks the user to enter the square feet of wall space to be painted and the price
of the paint per gallon. The program should display the following data:
The number of gallons of paint required
The hours of labor required
The cost of the paint
The labor charges
The total cost of the paint job

Added Specifications:

    Do not allow zero or negative numbers for any inputs
    User should not be allowed to continue to enter a new input until the current input has been validated
    Code should be properly indented, with only limited, strategic vertical whitespace
    Opening braces, {, must be directly under the first character of the statement they go with
    All statement starting lines within braces shall be indented 3 spaces, and the indentation should be consistent throughout your code.  (Note that continuation lines should be indented "strategically" or at least 5 spaces.
    Closing braces, }, must be directly under their corresponding opening brace, {
    Solution is commented
        Header Comment ( author, date, purpose, with titles )
        each statement is commented as to functionality (do not comment {, class, or method lines)
        (separate line comments should appear on the line before the code they reference, inline comment should appear on the same line and after the referenced code, and be aligned with each other)
        all ending curly braces are commented sufficiently to reference the structure they close, for example, if the condition is not too long
        PASTE THE STRUCTURE STATEMENT ITSELF, e.g., "}  // if (x<y)"
        If it is too long, then you can use a descriptor, e.g., instead of "} // if ( (usersInput < lowerBounds) || (usersInput > upperBounds) )" you might instead simply have:  "} // if (out of bounds)".  The point is to make it more transparent to a maintainer which block you are intending to close.
    Due to undeserved inflation, the company now charges $41.50 per hour.
    Due to an epidemic of hebetude, it will take 15 hours to apply one gallon of paint, the coverage of which will remain as defined in the textbook.
    
     you can declare a constant to have the index value and thereby give the constant a mnemonic name, e.g., MIN = 1, MAX = 2, then array[MIN] and array[MAX], instead of array[1] and array[2].
    
*/



//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      10/08/23
//*   Purpose   To get acquainted wit methods
//***********************************************************************************************************

import java.util.Scanner;                                                                                          // used to create object to get input from user

public class Ch05_Pc04_ByrdJ                                                                                       // declares Ch05_Pc04_ByrdJ class
{
   public static void main(String[] args)                                                                          // declares main method
   {
      // declare constant primitives
      final double LABOR_RATE = 41.50,                                                                             // Rate of Labor per hour
                   PAINT_RATE = 15,                                                                                // Cost of paint per gallon
                   COVERAGE = 115;                                                                                 // 115 sq Ft per gallon of paint
      
      // declare constant object               
      final String ESTIMATE = "       Gallons of Paint: %.2f%n"
                            + "       Hours Labor: %.2f%n"       
                            + "       Cost of Paint: $%.2f%n"
                            + "       Cost of Labor: $%.2f%n"
                            + "       Total Cost: $%.2f";  
      
      //declare primitives         
      double sqFt = 0, paintPrice = 0, gallons, hours, laborCost, paintCost, totalCost;                            // declare and initialize a couple primitives                                            

      // Referential variables.                    
      double[] paintArray = { sqFt, paintPrice };                                                                  // declare int[] paintArray: This is an object of the array class (int[]
      Scanner keyboard = new Scanner(System.in);                                                                   // declare Scanner keyboard: This is an object of the Scanner class
  
      // calls that Get valid input 
      getValidInput( keyboard, paintArray );                                                                       // call method to get sqFt
      getValidInput( keyboard, paintArray );                                                                       // call method to get price
      
      // Processing
      sqFt = paintArray[ 0 ];                                                                                      // set sqFt to array value 
      paintPrice = paintArray[ 1 ];                                                                                // set price to array value          
   
      gallons = sqFt / COVERAGE;                                                                                   // calculate gallons                                           
      hours = gallons *PAINT_RATE;                                                                                 // calc hours
      paintCost = gallons * paintPrice;                                                                            // calc paint cost
      laborCost = hours * LABOR_RATE;                                                                              // calc labor cost            
      totalCost = laborCost + paintCost;                                                                           // calc total cost
      
      // output estimate  
      System.out.printf( ESTIMATE, gallons, hours, paintCost, laborCost, totalCost );                                                                   
   } // main

   // declare getValidInput method.  Sends int[] -> paintArray.  Receives Keyboard, paintArray.
   public static double[] getValidInput( Scanner keyboard, double[] paintArray )
   {
      // Declare constants, primitives 
      final int MIN = 0;
      final String RANGE_PROMPT = "Your input is outside the valid range.%n" ,                                     // static constant string prompt Valid Range
                   INT_PROMPT = "Please enter a valid value.%n",                                                   // static constant string prompt valid input
                   INPUT_PROMPT = ( paintArray[ 0 ] == 0 )                                                         // ternary input prompt.   array[0] is initalized as 0, so the 1st time it gets the 1st prompt.  
                   ? "Enter the square feet of wall space to be painted: "                                         // then array[0] has to get a value that is not zero
                   : "Enter the price of the paint per gallon: " ;                                                 // so when it's called a 2nd time, it gets 2nd prompt. 
                          
      int index = ( paintArray[ 0 ] == 0 ) ? 0 : 1;                                                                // ternary operator to determine the index of the array to store values.
                                                                                                                   // works the same as the input prompt                                           
      // do while loop.
      do 
      {
         System.out.printf( INPUT_PROMPT );                                                                        // print Guessprompt:  paintArray[1] = Min, paintArray[2] = max
         
         while ( !keyboard.hasNextFloat() )                                                                        // nested while loop to force int input.
         {
            System.out.printf(INT_PROMPT);                                                                         // print not Int
            keyboard.next();                                                                                       // clear invalid input
            System.out.printf( INPUT_PROMPT );                                                                     // print Guessprompt:  paintArray[1] = Min, paintArray[2] = max 
         } // gets valid float input
         paintArray[ index ] = keyboard.nextFloat();                                                               // sqFt gets float from input
      
         if ( paintArray[ index ] <= MIN ) System.out.printf(RANGE_PROMPT);                                        // if not valid #, print error message 
      } while (paintArray[ index ] <= MIN );                                                                       // keeps looping while out of range
      return paintArray;                                                                                           // return array with valid input      
   } // getValidInput()
} // Ch05_Pc04_ByrdJ