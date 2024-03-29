// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      10/02/23
//*   Purpose   To get acquainted with loops
//***********************************************************************************************************

import java.util.Random;                                                                                                // used to create Random #
import java.util.Scanner;                                                                                               // used to create object to get input from user

public class Ch04_Pc18_ByrdJ2                                                                                           // declares Ch04_Pc18_ByrdJ2 class
{
    public static void main(String[] args)                                                                              // declares main method
    {
        // declare constants
        final int TWO = 2;                                                                                              // constant int two
        final String MAX_RANGE_PROMPT = "Enter the maximum range for the random number: ",                              // constant string maxRange prompt
                RNG_GAME = "Random Number Guessing Game!\n",                                                            // constant string intro
                INT_PROMPT = "Please enter a valid integer.",                                                           // static constant string prompt valid input
                YOU_WIN = "Congratulations! You guessed the number in ",                                                // constant string you win
                ATTEMPTS = " attempts.",                                                                                // constant string attempts
                TOO_LOW = "Too low, try again.",                                                                        // constant string too low
                TOO_HIGH = "Too high, try again.",                                                                      // constant string too high
                MAYBE_TRY = "\nMaybe Try: ",                                                                            // constant string try #
                NL = "\n";                                                                                              // constant string new line
        
        //declare primitives         
        int count = 0,  min = 1, max = 100, guess = 0;                                                                  // These aren't really needed, since I can store these values in the array, but I feel it makles it more readable.
        boolean guessAgain = true;                                                                                      // declare and initalize loop flag.

        // Referential variables. 
        Random rng = new Random();                                                                                      // dclare Random rng: This is an object of the Random class
        int randomNumber = rng.nextInt( max ) + 1;                                                                      // randomNumber gets random number 
                        
        int[] guessArray = {count, min, max, guess};                                                                    // declare int[] guessArray: This is an object of the array class (int[]

        Scanner keyboard = new Scanner(System.in);                                                                      // declare Scanner keyboard: This is an object of the Scanner class

        // Print intro to game
        System.out.printf( RNG_GAME );                                                                                  // print intro

        // While loop.   Gets input, does processing.
        while ( guessAgain )
        {
            guessArray = getValidGuess( keyboard, guessArray );                                                         // declare and initalize guess. Calls getValidinput. Sends keyboard, guessArray

            guessArray[0]++;                                                                                            // count increment + 1
            count = guessArray[0];                                                                                      // updates count to the value stored in array
            guess = guessArray[3];                                                                                      // updates guess to the value stored in array
                                                                                                                             
            if ( guess == randomNumber )
            {                                                                                                           // if guess == randomNumber
                guessAgain = false;                                                                                     // End of loop flag
            } // you win
            else if ( guess < randomNumber )
            {                                                                                                           // Else if guess < randomNumber
                min = guess + 1;                                                                                        // min gets (guess + 1)
                System.out.printf( TOO_LOW + MAYBE_TRY + (int)(( min + max)/ TWO ) + NL );                              // print too low, try this #
                guessArray[1] = min;                                                                                    // update array
            } // sets new min
            else 
            {
                max = guess - 1;                                                                                        // max gets (guess - 1)
                System.out.printf( TOO_HIGH + MAYBE_TRY + (int)(( min + max)/ TWO ) + NL );                             // print too high, try this #
                guessArray[2] = max;                                                                                    // update array
            } // sets new max
            
         /* for (int element : guessArray) System.out.printf("%d%n", element);                                          To read inside the array. */    // for each element of the array, print element.  new line. 
         
        } // while loop
        keyboard.close();                                                                                               // close the scanner object keyboard
        // output
        System.out.printf( YOU_WIN + count + ATTEMPTS );
    } // main

    // declare getValidGuess method.  Sends int[] -> guessArray.  Receives Keyboard, guessArray.
    public static int[] getValidGuess( Scanner keyboard, int[] guessArray )
    {
        // Declare constants, primitives 
        final String RANGE_PROMPT = "Your guess is outside the valid range.\n" ,                                        // static constant string prompt Valid Range
                GUESS_PROMPT = "Enter your guess between ",                                                             // static constant string prompt guess btn
                INT_PROMPT = "Please enter a valid integer.\n",                                                         // static constant string prompt valid input
                AND = " and ",                                                                                          // static constant string prompt and
                COLON = ": ";                                                                                           // static constant string prompt
        int guess;                                                                                                      // declare int guess
        int count = guessArray[0];                                                                                      // ** declare count, gets guessArray[0] **
        int min = guessArray[1];                                                                                        // ** declare int min gets guessArray[1] **
        int max = guessArray[2];                                                                                        // ** declare int max gets guessArray[2] **
                                                                                                                        // ** Not needed, but added for readability. ** 
        // while true loop
        while (true)
        {
            System.out.print( GUESS_PROMPT + min + AND + max + COLON );                                                 // print Guessprompt:  guessArray[1] = Min, guessArray[2] = max
            if ( keyboard.hasNextInt() )                                                                                // if keyboard input is int
            {
                guess = keyboard.nextInt();                                                                             // then guess gets keyboard input
                if (guess >= min && guess <= max)                                                                       // if guess within range
                {
                    guessArray[3] = guess;                                                                              // update guess in array
                    return guessArray;                                                                                  // return valid input
                } else {
                    count++;                                                                                             // incremenet count.   Bad guesses count against you!
                    guessArray[0] = count;                                                                              // guessArray[0] gets count
                    System.out.printf( RANGE_PROMPT );                                                                  // print out of range
                } // else print out of range
            } else {
                count++;                                                                                                // count ++
                guessArray[0] = count;                                                                                  // guessArray[0] gets count
                System.out.printf( INT_PROMPT );                                                                        // print not Int
                keyboard.next();                                                                                        // Discards invalid input
            } // print int prompt error ++
        }  // while true loop
    } // getValidGuess()
} // Ch04_Pc18_ByrdJ2