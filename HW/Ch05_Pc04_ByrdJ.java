/* 

-2, lines 94 & 95 are continuation lines, so they should be indented more than one step. In this case, I would align the “?” and “:” with the assignment “+” of line 93. 

-0, clever multi-use of getValidInput(), 
but it leaves your main() and getValidInput() having to have “insider knowledge” to work – knowledge that is not transparent to the maintainer until after he has studied your code. 
You can still have the multi-use nature of getValidInput(), but make it clear in main() what is being requested and therefore received. For example, instead of having “getValidInput( keyboard, paintArray );” 
twice, where each time saves a different conceptual value in different positions in your second argument array, make it explicit, e.g., where “final int AREA=0, PRICE=1;” once could have: “paintArray[ AREA ] = getValidInput( keyboard, 
AREA );” and “paintArray[ PRICE ] = getValidInput( keyboard, PRICE );”. This makes it clear in main() what is going on. Unfortunately, it also means that both main() and getValidInput() would have to trust that the other had the same constant values. 
This could be resolved by having those two constants declared as fields of the Ch05_Pc04_ByrdJ class, or to send a String with the request, e.g., “paintArray[ AREA ] = getValidInput( keyboard, “area” );”. A major point of modules is to separate 
cross-knowledge requirements. This is a critical feature of classes themselves. To you a class you should not be required to have any insider knowledge. 

-30, specs state “there must be a separate method for each of the bulleted items in the textbook 
instructions” and “there must also be a separate method(s) for … output. Hence at least 7 methods.”. You only had one method, the required input method. This requirement of seven methods was to test/practice your use of methods, i.e., the subject of 
this chapter and were assessed at 5 points each.

*/










//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      10/15/23
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
         System.out.printf( INPUT_PROMPT );                                                                        // print 
         
         while ( !keyboard.hasNextFloat() )                                                                        // nested while loop to force int input.
         {
            System.out.printf(INT_PROMPT);                                                                         // print not Int
            keyboard.next();                                                                                       // clear invalid input
            System.out.printf( INPUT_PROMPT );                                                                     // print 
         } // gets valid float input
         paintArray[ index ] = keyboard.nextFloat();                                                               // array gets float from input
      
         if ( paintArray[ index ] <= MIN ) System.out.printf(RANGE_PROMPT);                                        // if not valid #, print error message 
      } while (paintArray[ index ] <= MIN );                                                                       // keeps looping while out of range
      return paintArray;                                                                                           // return array with valid input      
   } // getValidInput()
} // Ch05_Pc04_ByrdJ