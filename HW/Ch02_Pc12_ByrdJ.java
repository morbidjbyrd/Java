//***********************************************************************
//*     @author     James Byrd                                                
//*     Date        9/10/23
//*     Purpose     To get acquainted with string manipulation and 
//*                 general formating.
//***********************************************************************

import java.util.Scanner;                                                                 // used to create object to get input from user

public class Ch02_Pc12_ByrdJ                                                              // declares Ch02_Pc12_ByrdJ class
{
   public static void main(String[] args)                                                 // declares main() method
   {
      // declare constants
      final String NUM_LETTERS_OUTPUT = "The number of letters in the city, ";            // output for city string size 
      final String IS = " is ";                                                           // output msg for verb " is "
      final String PERIOD = ".";                                                          // output for  . punctuation
      final String COMMA = ",";                                                           // output for , punctuation
      final String INPUT_CITY_PRMPT = "Enter your favorite city: ";                       // prompt to get city
      final String INPUT_OUTPUT1 = "You entered: ";                                       // output msg for input
      final String INPUT_OUTPUT2 = " as your favorite city.";                             // 2nd output msg for input
      final String FIRST_CHAR_OUTPUT = "The first letter of the city: ";                  // output msg for 1st char
      final String UPPERCASE_OUTPUT = "The city name in all upper case letters: ";        // output msg for upper case
      final String LOWERCASE_OUTPUT = "The city name in all lower case letters: ";        // output msg for lower case
      
      // declare primitive data types, needed to hold calculated values 
      int stringSize;                                                                     // holds the length of city name
      char firstLetter;                                                                   // holds first letter of city
      
      // declare referential data types
      String city;                                                                        // holds the city name 
      Scanner keyboard = new Scanner(System.in);                                          // Scanner object to read input
      String outputMsg;                                                                   // holds the formatted output
      String upperCaseCity;                                                               // holds the uppercase city name 
      String lowerCaseCity;                                                               // holds the lowercase city name 
      
      // initialize declared variables by setting default values
      city = "";                                                                          // set city empty string
      stringSize = 0;                                                                     // set default 0
      firstLetter = ' ';                                                                  // set to empty "space" character
      outputMsg = "";                                                                     // set to empty buffer
      upperCaseCity = "";                                                                 // set to empty string
      lowerCaseCity = "";                                                                 // set to empty string
       
      // prompt user for city and store the city in a variable      
      System.out.printf(INPUT_CITY_PRMPT);                                                // prompts the user for a city name
      city = keyboard.nextLine();                                                         // stores city name
      
      // manipulating and concatenation of strings
      stringSize = city.length();                                                         // get the length of the city
      firstLetter = city.charAt(0);                                                       // get the first letter of the city
      upperCaseCity = city.toUpperCase();                                                 // get the uppercase of the city
      lowerCaseCity = city.toLowerCase();                                                 // get the lowercase of the city
      
      // formatting output 
      outputMsg = INPUT_OUTPUT1 + city + INPUT_OUTPUT2 + "\n" +                           // output line 1
                  NUM_LETTERS_OUTPUT + city + COMMA + IS + stringSize + PERIOD + "\n" +   // output line 2
                  UPPERCASE_OUTPUT + upperCaseCity + PERIOD + "\n" +                      // output line 3
                  LOWERCASE_OUTPUT + lowerCaseCity + PERIOD + "\n" +                      // output line 4
                  FIRST_CHAR_OUTPUT + firstLetter + PERIOD;                               // output line 5
      
      // output
      System.out.print(outputMsg);
   } // main()

} // Ch02_Pc12_ByrdJ



/*
-0, since the first time you use your variable “city” is online 47, where it receives a value, there is no need for it be initialized, line 38.  Similarly, for stringSize, firstLetter, outputMsg, upperCaseCity, and lowerCaseCity.
-2, specs state “no … string literals within … output … part of program”.  Technically, while your addition of “\n” is a much better way to do this, it does violate the explicit specs.
-0, I believe that it is more transparent to begin continuation lines with the operators, if relevant.  So lines 57-60 would be better begun with the “+” with which you terminated their previous lines.
*/