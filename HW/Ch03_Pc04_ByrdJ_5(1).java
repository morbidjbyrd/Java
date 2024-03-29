//***********************************************************************
//*     @author     James Byrd                                                
//*     Date        9/24/23
//*     Purpose     To get acquainted with if statements
//                  Added recursion for fun
//                  Bonus:  Use switch
//***********************************************************************

import java.util.Scanner;                                                                     // used to create object to get input from user

public class Ch03_Pc04_ByrdJ_5                                                                // declares Ch03_Pc04_ByrdJ_5 class
{  
   // static variables for the class. Maybe these should be in the isValidInput method,  
   // since they are only used there, but that arguably violates the specs? IDK!
   static final double bonus = 20;                                                            // static constant double.      
   static final String ERROR1 = "Error: You have entered a string!\n",                        // static constant string Error Prompt 
                       ERROR2 = "Error: You have entered an invalid number!\n",               // static constant string Error Prompt
                       PATTERN = "^\\d+(\\.\\d+)?",                                           // static constant string pattern
                       TESTPROMPT = "Enter test score ",                                      // Prompt for Test Score
                       COLON =": ";                                                           // Prompt Colon
                                                                   
   public static void main(String[] args)                                                     // declares main() method
   {
      // declare constants
      final char GRADE_A = 'A',                                                               // constant letter grade A
                 GRADE_B = 'B',                                                               // constant letter grade B
                 GRADE_C = 'C',                                                               // constant letter grade C
                 GRADE_D = 'D',                                                               // constant letter grade D
                 GRADE_F = 'F';                                                               // constant letter grade F
      final int TEST1 = 1,                                                                    // constant test1 
                TEST2 = 2,                                                                    // constant test2 
                TEST3 = 3;                                                                    // constant test3                     
      final String AVGOUTPUT = "The average score is ",                                       // Output avg text      
                   COMMA  = ", ",                                                             // Output comma                         
                   PERIOD = ".";                                                              // Output period 
      
      // declare variables                           
      char letterGrade;                                                                       // Primitive: declare letterGrade  
      String outputMsg;                                                                       // Referential: declares outputMsg
   
      // INPUT CALLS.  calls for input and validates input
      double formattedTestSc1 = isValidInput(TEST1);                                          // calls isInvalidInput to get a value for testScore 1
      double formattedTestSc2 = isValidInput(TEST2);                                          // calls isInvalidInput to get a value for testScore 2    
      double formattedTestSc3 = isValidInput(TEST3);                                          // calls isInvalidInput to get a value for testScore 3
      
      // Processing:  Calc avg, convert to string, and assign a value to letterGrade    
      double avg = ( formattedTestSc1 + formattedTestSc2 + formattedTestSc3 ) / 3.0;          // calculates avg
      long roundedAvg = Math.round(avg);                                                      // Rounds avg.  Stored as long, because math.round is long.  no casting
                                                                                                                                                                        
      // Switch for handling letter Grade Assignment.                                                                                 
      switch ((int) avg / 10) {                                                               // switch casting int.  avg / 10  
         case 8:                                                                              // in case avg/10 = 8   
            letterGrade = GRADE_B;                                                            // assign letter grade B             
            break;                                                                            // break.  immediately exits the switch statement and continues with the code that follows it  
         case 7:                                                                              // in case avg/10 = 7  
            letterGrade = GRADE_C;                                                            // assign letter grade C               
            break;                                                                            // break.       
         case 6:                                                                              // in case avg/10 = 6   
            letterGrade = GRADE_D;                                                            // assign letter Grade D               
            break;                                                                            // break.       
         case 5:                                                                              // in case avg/10 = 5     
            letterGrade = GRADE_F;                                                            // assign letter grade F
            break;                                                                            // break
         case 4:                                                                              // in case avg/10 = 4     
            letterGrade = GRADE_F;                                                            // assign letter grade F
            break;                                                                            // break  
         case 3:                                                                              // in case avg/10 = 3     
            letterGrade = GRADE_F;                                                            // assign letter grade F
            break;                                                                            // break  
         case 2:                                                                              // in case avg/10 = 2     
            letterGrade = GRADE_F;                                                            // assign letter grade F
            break;                                                                            // break  
         case 1:                                                                              // in case avg/10 = 1     
            letterGrade = GRADE_F;                                                            // assign letter grade F
            break;                                                                            // break  
         case 0:                                                                              // in case avg/10 = 0     
            letterGrade = GRADE_F;                                                            // assign letter grade F
            break;                                                                            // break
         default:                                                                             // default value if the above aren't true
            letterGrade = GRADE_A;                                                            // assign letter grade A. This handles the bonus, regardless of how large it becomes.           
      }                                                                    
                                                                                                                                                                     
      // formatting output                                                                              
      outputMsg = AVGOUTPUT                                                                   // output text          
                + roundedAvg                                                                  // + rounded avg           
                + COMMA                                                                       // + comma      
                + letterGrade                                                                 // + letter grade            
                + PERIOD;                                                                     // + period       
                                                                                                          
      // output                                                                                        
      System.out.printf(outputMsg);                                                                                        
   } // main()                                                                                                                                    
                                                                                                                                       
   // isValidInput method.  Uses recursion to validate input!                                                                                                                                     
   public static Double isValidInput( int testNum)                                            // Declares isValidInput. "Double" returns double                                                     
   {  
      Scanner keyboard = new Scanner(System.in);                                              // Referential: Scanner object to read input.  This has to be here for my recursion to work!
      System.out.printf( TESTPROMPT + testNum + COLON );                                      // prompts the user for a Test Score value
      String testSc = keyboard.next();                                                        // Stores the user input into testSc as a string        
                                                                                              // "int  testNum" Parameter list of method. Method expects one parameter, type int, named testNum
      if (testSc.matches(PATTERN)) {                                                          // if testSc matches pattern
         double formattedStr = Double.parseDouble(testSc);                                    // turn string into double named formattedStr                             
         if (formattedStr >= 0 && formattedStr <= 100 + bonus) {                              // if formattedStr, #, is btn 0 - (100 + bonus)
            return formattedStr;                                                              // return double value to main
         } 
         else {                                                                               // Else
            System.out.printf( ERROR2 );                                                      // Print error invalid #                                                  
            return isValidInput(testNum);                                                     // call back to this method.  recursion
         }
      } 
      else {                                                                                  // else ( not a #) 
         System.out.printf( ERROR1 );                                                         // print error string
         return isValidInput(testNum);                                                        // call back to this method.  recursion                                 
      }
   } // isValid()
} // Ch03_Pc04_ByrdJ_5