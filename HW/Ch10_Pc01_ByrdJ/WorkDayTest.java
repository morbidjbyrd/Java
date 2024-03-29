/*
    WorkingDayTest should meet the following requirements:
        all task-specific numeric literals and long or repeated natural-language string literals are declared as constants
            -- see Assignment Ch09PC08 instructions for description & details).
        declare variables (primitive and referential data types); declare ProductionWorker object here. 
        initialize variables which require initialization (primitive and referential data types) after declaration and within housekeeping
        do NOT initialize variables that do not require initialization
        
            input section gets:
        the information needed for the employee;
        information needed for the shift; 
    input section calls appropriate object’s methods to set the object's values (constructor's / setters)
    output section displays information that reflects that all methods (constructors, mutators, accessors, etc.) of Employee and ProductionWorker were demonstrated in the WorkDayTest class. 
    the only print method that is permitted is the printf method, and you must use the printf formatting features, e.g., %d for integer variable output
*/


//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      12/03/23
//*   Purpose   Inheritance
//***********************************************************************************************************

import java.util.Scanner;                                                                                                                        // import keyboard                      
import java.io.*;                                                                                                                                // import file writer          

public class WorkDayTest                                                                                                                         // declare class
{
   public static void main(String[] args) 
   {
      // Declarations
      String emplLastName,emplFirstName, emplNum, hireDate;                                                                                      // String declarations
      int shift,save;                                                                                                                            // int declarations             
      double hourlyPayRate;                                                                                                                      // double delcarations
      
      // Input
      Scanner keyboard = new Scanner(System.in);                                                                                                 // create Keyboard 4 input
      System.out.printf( "Enter employee information: (Must Include Hyphens)\n" );                                                               // Input Prompt
                            
      emplLastName = inputValidation.getValidInput( "Employee's Last name: ", "^[A-Za-z]+$", keyboard );                                         // get Valid Name.  Calls a method named getValidInput from the inputValidation class 
      emplFirstName = inputValidation.getValidInput( "Employee's First name: ", "^[A-Za-z]+$", keyboard );                                       // get Valid Name                                                                     
      emplNum = inputValidation.getValidInput( "Employee number (XXX-L): ", "[0-9]{3}-([A-M]|[a-m])", keyboard );                                // get valid emp num
      hireDate = inputValidation.getValidInput( "Hire date: (YYYY-MM-DD)", "^[0-9]{4}-(0[1-9]|1[0-2])-([0-2][1-9]|3[01])$", keyboard );          // get valid hire date                     
      shift = Integer.parseInt( inputVal`idation.getValidInput( "Shift (1 for day, 2 for night): ", "[1-2]", keyboard ));                         // get valid shift.   A string is returned, and is parsed into int.  
      hourlyPayRate = Double.parseDouble( inputValidation.getValidInput( "Hourly pay rate: ", "^[0-9]+(\\.[0-9]{1,2})?$", keyboard ));           // get valid Rate.  A string is returned, and is parsed into double.                    
   
      // Create Worker
      ProductionWorker worker = new ProductionWorker(emplLastName, emplFirstName, emplNum, hireDate, shift, hourlyPayRate);                           
   
      // Output 
      System.out.printf("\nEmployee Information:\nName: %s %s\nEmployee Number: %s\nHire Date: %s\n"                                             // print worked info 
                       ,worker.getEmplLastName(), worker.getEmplFirstName(), worker.getEmplNum(), worker.getHireDate());                         // cont
      System.out.printf("\nShift Information:\nShift: %d\nHourly Pay Rate: $%.2f\n"                                                              // print worker shift pay
                       ,worker.getShift(), worker.getHourlyPayRate());                                                                           // cont
      
      // Save the worker information to a text file                 
      if ( Integer.parseInt( inputValidation.getValidInput( "\nSave? 1 for YES, 2 for NO: ", "[1-2]", keyboard )) == 1) writeToFile( worker );   // if they enter 1 then write to file.  
      
      keyboard.close();                                                                                                                          // closes keyboard
   }

   // Write the worker information to a text file   
   private static void writeToFile( ProductionWorker worker )                                                                                    // declares method.  Sends void.  Gets Worker
   {
      try (FileWriter file = new FileWriter("workersList.txt", true))                                                                            // Try this.  Create a filewriter.  True = Append rather than overwrite.  Closes fileWriter
      {
         file.write( worker.getEmplLastName() + ","                                                                                              // write empl info
                   + worker.getEmplFirstName() + ","                                                                                             // write empl info
                   + worker.getEmplNum()  + ","                                                                                                  // write empl info
                   + worker.getHireDate()  + ","                                                                                                 // write empl info
                   + worker.getShift() + ","                                                                                                     // write empl info
                   + worker.getHourlyPayRate() + "\n");                                                                                          // write empl info
      } catch (IOException e) {                                                                                                                  // Catches IOexception
         e.printStackTrace();                                                                                                                    // prints the stack trace to the console for debugging
      } // catch exception                       
   } // writeToFile()
} // WorkDayTest