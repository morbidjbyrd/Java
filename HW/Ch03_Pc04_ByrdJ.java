/*Declare RULES 
constant primatives first, 
then constant objects, 
then primitive variables, 
then object variables, 
then have input, processing, 
and output. The only exception to the processing being after all declarations would be initialization coupled with a declaration. 




Write a program that has variables to hold three test scores. The program should ask the user to enter
three test scores and then assign the values entered to the variables. The program should display the
average of the test scores and the letter grade that is assigned for the test score average. Use the
grading scheme in the following table:
Test Score Average Letter Grade
90–100 A
80–89 B
70–79 C
60–69 D
Below 60 F


Added Specifications:
unless there is a compelling reason to do otherwise, in general you should abide by the following code layout:

    Housekeeping
        declare constants
        declare primitive variables
        declare referential variables
        initialize variables, as needed and not initialized in declarations
    Input
    Processing
        This is where calculations are performed
    Output
ALL numeric literals and string literals whose value does not change during run of program are declared as constants, including string literals found in print statements (this is to test your ability, not necessarily the best "real-world coding" decision)
declare variables (primitive and referential data types)
initialize variables (primitive and referential data types) after declaration and within housekeeping -- only initialize those variables that require initialization
use if-else statements to handle the logic
(for 5 extra points solve this problem using a SWITCH statement instead)
input section has appropriate prompts
input section stores input in correct variables
process section performs all processes (calculations, comparisons, etc.)
process section performs processing and formatting of data for output section
process section demonstrates correct use of decision structure
output section does not use println or print method, you can only use the printf method for output
THIS REQUIREMENT CARRIES THROUGH THE END OF THE COURSE
output is user-friendly and contains complete sentences/prompts    
 */











//***********************************************************************
//*     @author     James Byrd                                                
//*     Date        9/24/23
//*     Purpose     To get acquainted with if statements
//***********************************************************************

import java.util.Scanner;                                                                     // used to create object to get input from user

public class Ch03_Pc04_ByrdJ                                                                  // declares Ch03_Pc04_ByrdJ class
{
   public static void main(String[] args)                                                     // declares main() method
   {
      // declare constants
      final double bonus = 20;                                                                // Declares bonus.  Max amt of bonus points possible.  Initialized to 20.  Added for exapandability.                           
      final String TEST_PROMPT1 = "Enter the first test score:  ",                              // Prompt for Test 1            
                   TEST_PROMPT2 = "Enter the second test score: ",                             // Prompt for Test 2             
                   TEST_PROMPT3 = "Enter the third test score:  ",                              // Prompt for Test 3           
                   AVG_OUTPUT   = "The average test score is ",                                    // Output avg text      
                   COMMA       = ", ",                                                        // Output comma                         
                   PERIOD      = ".",                                                         // Output period
                   ERROR1      = "Error: You have entered a string!",                         // Error Prompt 
                   ERROR2      = "Error: You have entered an invalid number!";                // Error Prompt                   
        
      // declare primitive variables             
      char   letterGrade;                                                                     // declare letterGrade  
      double testSc1, testSc2, testSc3;                                                       // declare variables
   
      // declare referential variables
      String outputMsg;                                                                       // declares outputMsg
      Scanner keyboard = new Scanner(System.in);                                              // Scanner object to read input
      
      // Input with validation.  
      // I cannot use loops, so I end program if there is invalid input.
      System.out.printf(TEST_PROMPT1);                                                        // prompts the user for a Test Score 1
      if (keyboard.hasNextDouble()) {                                                         // if input is numeric,                                                                                        
         testSc1 = keyboard.nextDouble();                                                     // then store the inputed value in testSc1                                  
      } else {                                                                                // otherwise
         System.out.printf(ERROR1);                                                           // Output error                          
         return;                                                                              // and end program 
      }                                                                                      
      
      if (testSc1 < 0 || testSc1 > 100 + bonus) {                                             // if test score is less than 0 or above 120 
         System.out.printf(ERROR2);                                                           // output error                          
         return;                                                                              // end program        
      } 
      
      // INPUT with validation: prompt user for Test Scores 2    
      System.out.printf(TEST_PROMPT2);                                                        // prompts the user for a Test Score 2
      if (keyboard.hasNextDouble()) {                                                         // if input is numeric,                                                                                        
         testSc2 = keyboard.nextDouble();                                                     // then store the inputed value in testSc2                                  
      } else {                                                                                // otherwise
         System.out.printf(ERROR1);                                                           // Output error                          
         return;                                                                              // and end program 
      }                                                                                      
      
      if (testSc2 < 0 || testSc2 > 100 + bonus) {                                             // if test score is less than 0 or above 120 
         System.out.printf(ERROR2);                                                           // output error                          
         return;                                                                              // end program        
      } 
   
      // INPUT with validation: prompt user for Test Scores 3 
      System.out.printf(TEST_PROMPT3);                                                        // prompts the user for a Test Score 3
      if (keyboard.hasNextDouble()) {                                                         // if input is numeric,                                                                                        
         testSc3 = keyboard.nextDouble();                                                     // then store the inputed value in testSc3                                  
      } else {                                                                                // otherwise
         System.out.printf(ERROR1);                                                           // Output error                          
         return;                                                                              // and end program 
      }                                                                                      
      
      if (testSc3 < 0 || testSc3 > 100 + bonus) {                                             // if test score is less than 0 or above 120 
         System.out.printf(ERROR2);                                                           // output error                          
         return;                                                                              // end program        
      } 
      
      // Processing:  Calc avg, convert to string, and assign a value to letterGrade
      double avg = (testSc1 + testSc2 + testSc3) / 3.0;                                       // calc avg
      long roundedAvg = Math.round(avg);                                                      // round the avg.  Math.Round is long, so I made roundedAvg long.  
          
      // if-else-if Statement to assign letter grade.  
      if (avg >= 90) {                                                                        // if avg >= 90        
         letterGrade = 'A';                                                                   // assign lettergrade A            
      } else if (avg >= 80) {                                                                 // else if avg >= 80                  
         letterGrade = 'B';                                                                   // assign lettergrade B             
      } else if (avg >= 70) {                                                                 // else if avg >= 70               
         letterGrade = 'C';                                                                   // assign lettergrade C
      } else if (avg >= 60) {                                                                 // else if avg >= 00               
         letterGrade = 'D';                                                                   // assign lettergrade D            
      } else {                                                                                // Else
         letterGrade = 'F';                                                                   // assign lettergrade F            
      }                                                              
         
      // formatting output 
      outputMsg = AVG_OUTPUT                                                                  // outpuit avg output text             
                + roundedAvg                                                                  // output roundedAvg             
                + COMMA                                                                       // output comma        
                + letterGrade                                                                 // output lettergrade              
                + PERIOD;                                                                     // output period           
                  
      // output
      System.out.printf(outputMsg);
   } // main()
} // Ch03_Pc04_ByrdJ