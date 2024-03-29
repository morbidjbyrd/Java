//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      11/06/23
//*   Purpose   Array List, Parsing files, try catch, constructors, and objects  
//***********************************************************************************************************

import java.util.ArrayList;                                               // import array list utility 

public class NumberTest                                                   // declare arrayopeerationstest class   
{
   public static void main(String[] args)                                 // declare main method    
   {
      Number test = new Number( "numbers.txt" );                          // create a new number, test.  Send fileName numbers.txt        
   
      System.out.printf("Total: %.2f%n", test.getTotalFloat() );          // gets total and prints it
      System.out.printf("Average: %.2f%n",  test.getAverageFloat() );     // gets avg and prints it              
      System.out.printf("Lowest: %.2f%n", test.getLowestFloat() );        // gets lowest and prints it          
      System.out.printf("Highest: %.2f%n", test.getHighestFloat() );      // gets highest and prints it            
   } // main()
} // ArrayOperationsTest