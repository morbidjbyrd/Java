//*********************************************************************************************************
//*   @author   James Byrd                                              
//*   Date      10/02/23
//*   Purpose   To get acquainted with loops
//*             Bonus: Don't accept a number that is in the "wrong" direction  
//*             Bonus: Don't accept any number that is outside of any previous advice
//*             Bonus: Provide "best blind" advice, i.e., the value half way between the previous two bounds
//***********************************************************************************************************

import java.util.Random;                                                                                        // used to create Random #  
import java.util.Scanner;                                                                                       // used to create object to get input from user 

public class Ch04_Pc17_ByrdJ4                                                                                   // declares Ch04_Pc17_ByrdJ4 class      
{                                                                                                                                   
   public static void main(String[] args)                                                                       // declares main method                                                                                                      
   {   
      // declare constants, and primitives
      final int TWO = 2;                                                                                        // constant int two        
      final String YOU_WIN = "Congratulations! You guessed the number in ",                                     // constant string you win
                  ATTEMPTS = " attempts.",                                                                      // constant string attempts
                   TOO_LOW = "Too low, try again.",                                                             // constant string too low   
                  TOO_HIGH = "Too high, try again.",                                                            // constant string too high             
                 MAYBE_TRY = "\nMaybe Try: ",                                                                   // constant string try #
                        NL = "\n";                                                                              // constant string new line
      
      // declare primitives                                       
      int count = 0, min = 1;                                                                                   // initialize some primitives                 
      boolean guessAgain = true;                                                                                // initalize loop flag
   
      // Declare referential data types. Scanner object                                                                                                                     
      Scanner keyboard = new Scanner(System.in);                                                                // new scanner, keyboard object                                                                                                                      
      int max = getValidRange( keyboard );                                                                      // save rng as randomNumber                                                                                                                                                          
      
      // RNG object
      Random rng = new Random();                                                                                // new random named RNG                                                                                                                      
      int randomNumber = rng.nextInt( max ) + 1;                                                                // save rng as randomNumber                       
                                                                                                                                
      // While loop.   Gets input, does processing.  
      while ( guessAgain )                                                                                                                                                                                                                                 
      {
         int guess = getValidGuess( keyboard, min, max );                                                       // declare and initalize guess.   Calls getValidinput. Sends keyboard, min, max                                                                                                               
         count++;                                                                                               // count increment + 1                                                                                                               
         
         if ( guess == randomNumber ) 
         {                                                                                                      // if guess == randomNumber                                                                                                               
            guessAgain = false;                                                                                 // End of loop flag  
         } // you win                                                                                                                                                                                                                     
         else if ( guess < randomNumber ) 
         {                                                                                                      // Else if guess < randomNumber 
            min = guess + 1;                                                                                    // min gets (guess + 1)   
            System.out.printf( TOO_LOW + MAYBE_TRY + (int)(( min + max)/ TWO ) + NL );                          // print too low, try this #                                                                                                                                                                          
         } // sets new min                                                                                                                                                                                                  
         else 
         {                                                                                                                                                         
            max = guess - 1;                                                                                    // max gets (guess - 1)      
            System.out.printf( TOO_HIGH + MAYBE_TRY + (int)(( min + max)/ TWO ) + NL );                         // print too high, try this #                                                                                                                                                                                                                                                           
         } // sets new max                                                                                                                                                      
      } // while loop                                                                                                                             
                                                                                                                                    
      // output                                                                                                    
      System.out.printf( YOU_WIN + count + ATTEMPTS );   
                                                                                                                                                                                                                                                                                               
   } // main

   // declare getValidGuess method.  Sends guess(int).  Receives Keyboard, min, max.    
   public static int getValidGuess( Scanner keyboard, int min, int max )                                                                                                               
   {
      // Declare constants and 1 int
      final String RANGE_PROMPT = "Your guess is outside the valid range." ,                                    // static constant string prompt Valid Range
                    GUESS_PROMPT = "Enter your guess between ",                                                 // static constant string prompt guess btn
                      INT_PROMPT = "Please enter a valid integer.",                                             // static constant string prompt valid input                       
                             AND = " and ",                                                                     // static constant string prompt and
                           COLON = ": ",                                                                        // static constant string prompt :
                              NL = "\n";                                                                        // constant string new line     
      int guess;                                                                                                // declares int guess                                                                                                                                                                                                                      
      
      // while true loop   
      while (true)                                                                                                                                                                                                                                    
      {
         System.out.print( GUESS_PROMPT + min + AND + max + COLON );                                            // print Guess a number within range                                                                                                           
         
         if ( keyboard.hasNextInt() )                                                                           // if keyboard input is int
         {
            guess = keyboard.nextInt();                                                                         // then guess gets keyboard input                                                
            if (guess >= min && guess <= max) { return guess; }                                                 // if guess >= min AND guess <= max. Return guess to main                                                                                                                                                                                                                                                                                                                                                                                                                                  
            else System.out.printf( RANGE_PROMPT + NL );                                                        // else print out of range                                                                                                                                                                                                                                                                             
         }  // print range error
         else 
         {                                                                                                      // else                                                                                                                        
            System.out.printf( INT_PROMPT );                                                                    // print not Int                                     
            keyboard.next();                                                                                    // Discards invalid input                 
         } // print error.  clear invalid input                                                                                                                                                                                                                                  
      }  // while true loop                                                                                                                                                                                                                                  
   } // getValidGuess()   

   // getValidRange method.  Intro to the game.
   public static int getValidRange( Scanner keyboard )                                                                                                               
   {  
      // decalre constants and 1 int  
      String MAX_RANGE_PROMPT = "Enter the maximum range for the random number: ",                               // constant string maxRange prompt     
                  RNG_GAME = "Random Number Guessing Game!\n",                                                   // constant string intro   
                INT_PROMPT = "Please enter a valid integer.";                                                    // static constant string prompt valid input 
      int maxRange;                                                                                              // declare int maxRange     
                                                                                                                                                                                                                                                                                                            
      System.out.printf( RNG_GAME );                                                                             // print intro                                                                                                                             
      
      // while true loop   
      while (true)                                                                                                                                                                                                                                    
      {
         System.out.printf( MAX_RANGE_PROMPT );                                                                  // print prompt for input                                                                                                                              
         if ( keyboard.hasNextInt() ) 
         {                                                                                                       // if keyboard input is int
            maxRange = keyboard.nextInt();                                                                       // save input to maxRange                                                                                                              
            return maxRange;                                                                                     // return maxRange                                                                                                                                                                                      
         } else {                                                                                                // else                                                                                                                        
            System.out.printf( INT_PROMPT );                                                                     // print not Int                                     
            keyboard.next();                                                                                     // Discards invalid input                 
         } // end else                                                                                                                                                                                                                                   
      }  // while true loop                                                                                                                                                                                                                                  
   } // getValidRange()                                                                                                                                                                                                                                    
} // Ch04_Pc17_ByrdJ4