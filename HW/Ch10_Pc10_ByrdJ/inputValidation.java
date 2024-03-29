//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      12/10/23
//*   Purpose   Inheritance and override
//***********************************************************************************************************

import java.util.Scanner;                                                                       // Declare class        

public class inputValidation                                                                    // Declare getValidInput method             
{  
   public static String getValidInput( String prompt, String pattern, Scanner keyboard )
   { 
      String input;                                                                             // Declare String
      
      //do while loop  
      do {
         System.out.print( prompt );                                                            // Print prompt
         input = keyboard.nextLine();                                                           // input gets next keyboard line
      
         if (!input.matches( pattern ))                                                         // if it does NOT matches pattern sent                           "^[A-Za-z]+$"  "[0-9]{3}[A-M]" 
         {
            System.out.printf( "Invalid Input%n" );                                             // print invalid
         }
      } while (!input.matches( pattern ));                                                      // while pattern does not match, loop
      
      return input;                                                                             // return input 
   } // getValidInput()
} // inputValidation