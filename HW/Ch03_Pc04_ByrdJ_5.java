/*

-0, so, if a student’s average is 89.9, you believe that they should get a “B”…interesting. The specs only specify integer valued averages, not the grade transitions, e.g., >89 and <90. Since you decided to calculate the average as a float, then you defined what to do in these intervals. 
-0, because a switch allows sequential processing until hitting a break, you could have merged them by deleting lines 62-63, 65-66, 68-69, 71-72, 74-76. Or, since the specs indicated that there would not be values above 100, you could have made the cases 9 & 10 for a “A” and let the “default” handle all of the “F” grades. 
-0, I would prefer you not use class fields, lines 15-20, for global reference convenience. If two methods need the same value, then declare it in the outer one (calling method) and pass the value to a parameter. This helps control the scope. In your case, it appears that all of your class fields are only used in your method isValidInput(), so they should be declared inside of it, constraining the scope appropriately. 
-2, “bonus” is a constant, so it should be in all caps. 
-2, line 98 is a prompt, so it should be after all variables are declared, i.e., after line 99. And line 102 is a primitive declaration, so it should be before line 97. 
-0, in general, never use a “return” statement except as the last statement in a method. I realize that in your case, you were trying to loop without any loop statements. Should not be a problem going forward. The proper way to handle it in this case would be to set a flag, and then have an if statement as your last statement that would either return formattedStr or call isValidInput(). 
-0, the proper way to indent an else following a brace is to place it on the same line, i.e., “} else {“, and then indent the following lines one step and align the closing else brace with the closing brace of the “if”. 
-0, I want you to use the bracing style of placing the starting brace on the line following its statement. This generally helps students get their indentation correct. In later programming classes, you can use this vertically tighter style. It is common, just not in this class. 
-0, your switch statement would be more transparent by making it vertically tighter, e.g., place your first case statement on the same line as the case, e.g., case 8 
+5, use of switch statement 
+5, validation – clever use of recursion to provide your validation loop.

*/



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
   static final double BONUS = 20;                                                            // static constant double.      
   static final String ERROR1 = "Error: You have entered a string!\n",                        // static constant string Error Prompt 
                       ERROR2 = "Error: You have entered an invalid number!\n",               // static constant string Error Prompt
                       PATTERN = "^\\d+(\\.\\d+)?",                                           // static constant string pattern
                       TEST_PROMPT = "Enter test score ",                                      // Prompt for Test Score
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
      switch ((int) roundedAvg / 10) {                                                               // switch casting int.  avg / 10  
         case 8: letterGrade = GRADE_B;                                                            // assign letter grade B             
            break;                                                                            // break.  immediately exits the switch statement and continues with the code that follows it  
         case 7: letterGrade = GRADE_C;                                                            // assign letter grade C               
            break;                                                                            // break.       
         case 6: letterGrade = GRADE_D;                                                            // assign letter Grade D               
            break;                                                                            // break.       
         case 5: letterGrade = GRADE_F;                                                            // assign letter grade F
            break;                                                                            // break
         case 4: letterGrade = GRADE_F;                                                            // assign letter grade F
            break;                                                                            // break  
         case 3: letterGrade = GRADE_F;                                                            // assign letter grade F
            break;                                                                            // break  
         case 2: letterGrade = GRADE_F;                                                            // assign letter grade F
            break;                                                                            // break  
         case 1: letterGrade = GRADE_F;                                                            // assign letter grade F
            break;                                                                            // break  
         case 0: letterGrade = GRADE_F;                                                            // assign letter grade F
            break;                                                                            // break
         default:                                                                             // default value if the above aren't true
            letterGrade = GRADE_A;                                                            // assign letter grade A. This handles the bonus, regardless of how large it becomes.           
      } // end switch                                                                   
                                                                                                                                                                     
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
   {                                                                                          // "int  testNum" Parameter list of method. Method expects one parameter, type int, named testNum
      Scanner keyboard = new Scanner(System.in);                                              // Referential: Scanner object to read input.  This has to be here for my recursion to work!
      System.out.printf( TEST_PROMPT + testNum + COLON );                                      // prompts the user for a Test Score value
      String testSc = keyboard.next();                                                        // Stores the user input into testSc as a string        
                                                                                              // 
      if (testSc.matches(PATTERN)) 
      {                                                          // if testSc matches pattern
         double formattedStr = Double.parseDouble(testSc);                                    // turn string into double named formattedStr                             
         if (formattedStr >= 0 && formattedStr <= 100 + BONUS) 
         {                              // if formattedStr, #, is btn 0 - (100 + bonus)
            return formattedStr;                                                              // return double value to main
         } else {                                                                               // Else
            System.out.printf( ERROR2 );                                                      // Print error invalid #                                                  
            return isValidInput(testNum);                                                     // call back to this method.  recursion
         }                                                                                    // end nested else    
      }                                                                                       // end IF
      else {                                                                                  // else ( not a #) 
         System.out.printf( ERROR1 );                                                         // print error string
         return isValidInput(testNum);                                                        // call back to this method.  recursion                                 
      }                                                                                       // end else
   } // isValid()
} // Ch03_Pc04_ByrdJ_5