//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      10/08/23
//*   Purpose   To get acquainted with loops
//***********************************************************************************************************

import java.util.Random;                                                                                            // used to create Random #
import java.util.Scanner;                                                                                           // used to create object to get input from user

public class Ch04_Pc18_ByrdJ7                                                                                       // declares Ch04_Pc18_ByrdJ7 class
{
   public static void main(String[] args)                                                                           // declares main method
   {
      // declare constants
      final int TWO = 2;                                                                                            // constant int two
      final String RNG_GAME = "Random Number Guessing Game!%n",                                                     // constant string intro
                   INT_PROMPT = "Please enter a valid integer.",                                                    // static constant string prompt valid input
                   YOU_WIN = "Congratulations! You guessed the number ( %d ) in %d attempts!",                      // constant string you win
                   TOO_LOW = "Too low, try %d.%n",                                                                  // constant string too low
                   TOO_HIGH = "Too high, try %d.%n";                                                                // constant string too low
      
      //declare primitives         
      int attempts = 0,  min = 1, max = 100, guess = 0, randomNumber;                                               // These aren't really needed, since I can store these values in the array, but I feel it makles it more readable.
         
      // Referential variables. 
      Random rng = new Random();                                                                                    // dclare Random rng: This is an object of the Random class
      randomNumber = rng.nextInt( max ) + 1;                                                                        // randomNumber gets random number 
                      
      int[] guessArray = {attempts, min, max, guess};                                                               // declare int[] guessArray: This is an object of the array class (int[]
   
      Scanner keyboard = new Scanner(System.in);                                                                    // declare Scanner keyboard: This is an object of the Scanner class
   
      // Print intro to game
      System.out.printf( RNG_GAME );                                                                                
   
      // While loop.   Gets input, does processing.
      while ( guess != randomNumber )
      {
         guessArray = getValidGuess( keyboard, guessArray );                                                        // declare and initalize guess. Calls getValidinput. Sends keyboard, guessArray
         attempts = ++guessArray[0];                                                                                // updates attempts to the value stored in array
         guess = guessArray[3];                                                                                     // updates guess to the value stored in array
                                                                                                                          
         if ( guess < randomNumber )                                                                                // if guess is less than randomNumber
         {                                                                                         
            min = guessArray[1] = guess + 1;                                                                        // update  min
            System.out.printf( TOO_LOW, ( min + max)/ TWO );                                                        // print too low, try this #
         } // sets new min
         if ( guess > randomNumber )                                                                                // can't be else, otherwise it prints when you input correct answer
         {
            max = guessArray[2] = guess - 1;                                                                        // update  max
            System.out.printf( TOO_HIGH, ( min + max)/ TWO );                                                       // print too high, try this #
         } // Sets new max                                                                            
      } // while loop                                                                                               // for (int element : guessArray) System.out.printf("%d%n", element);   
      
      // output YOU WIN!!!  
      System.out.printf( YOU_WIN, randomNumber, attempts);                                                               
   } // main

   // declare getValidGuess method.  Sends int[] -> guessArray.  Receives Keyboard, guessArray.
   public static int[] getValidGuess( Scanner keyboard, int[] guessArray )
   {
      // Declare constants, primitives 
      final String RANGE_PROMPT = "Your guess is outside the valid range.%n" ,                                      // static constant string prompt Valid Range
             GUESS_PROMPT = "Enter your guess between %d and %d: ",                                                 // static constant string prompt guess btn
             INT_PROMPT = "Please enter a valid integer.%n";                                                        // static constant string prompt valid input
      int guess;                                                                                                    // declare guess 
      int attempts = guessArray[0];                                                                                 // ** declare attempts, gets guessArray[0] **
      int min = guessArray[1];                                                                                      // ** declare int min gets guessArray[1] **
      int max = guessArray[2];                                                                                      // ** declare int max gets guessArray[2] **
                                                                                                                    // ** Not needed, added for clarity ** 
      // do while loop.
      do 
      {
         System.out.printf(GUESS_PROMPT, min, max);                                                                 // print Guessprompt:  guessArray[1] = Min, guessArray[2] = max
         
         while (!keyboard.hasNextInt())                                                                             // nested while loop to force int input.
         {
            System.out.printf(INT_PROMPT);                                                                          // print not Int
            attempts = ++guessArray[0];                                                                             // updates attempts to the value stored in array
            keyboard.next();                                                                                        // clear invalid input
            System.out.printf(GUESS_PROMPT, min, max);                                                              // print Guessprompt:  guessArray[1] = Min, guessArray[2] = max 
         } // gets valid int input
         guess = keyboard.nextInt();                                                                                // guess gets int from input
      
         if (guess < min || guess > max)                                                                            // if out ot range
         {
            System.out.printf(RANGE_PROMPT);                                                                        // print error message 
            attempts = ++guessArray[0];                                                                             // updates attempts to the value stored in array
         } // error if out of range
      } while (guess < min || guess > max);                                                                         // keeps looping while out of range
      
      // update array, sends it back  
      guessArray[3] = guess;                                                                                        // update guess in array
      return guessArray;                                                                                            // return array with valid input      
   } // getValidGuess()
} // Ch04_Pc18_ByrdJ7