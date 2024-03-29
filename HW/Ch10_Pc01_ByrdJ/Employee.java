/*
10 1. Employee and ProductionWorker Classes
Design a class named Employee. The class should keep the following
information in fields:
• Employee name
• Employee number in the format XXX–L, where each X is a digit within
the range 0–9 and the L is a letter within the range A–M.
• Hire date

Write one or more constructors and the appropriate accessor and mutator
methods for the class.

Added Specifications:

    all constructors should initialize all class fields
    submit Employee.java, ProductionWorker.java, and the WorkDayTest.java file
*/


//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      12/03/23
//*   Purpose   Inheritance
//***********************************************************************************************************

import java.util.Scanner;                                                                          // import scanner for input

// Employee.java
public class Employee 
{
   // Fields
   private String emplLastName, String emplFirstName, String emplNum, String hireDate;             // declare private strings  

   // Constructors
   public Employee( String emplLastName, String emplFirstName, String emplNum, String hireDate ) 
   {  
      this.emplLastName = emplLastName;                                                            // this object gets emplName
      this.emplFirstName = emplFirstName;                                                          // this object gets emplName
      this.emplNum = emplNum;                                                                      // this object gets emplNum
      this.hireDate = hireDate;                                                                    // this object gets hire date
   } // Create Employee Obj

   // Accessor methods 
   public String getEmplLastName() { return emplLastName; }                                        // return name
   public String getEmplFirstName() { return emplFirstName; }                                      // return name
   public String getEmplNum(){ return emplNum; }                                                   // return number
   public String getHireDate() { return hireDate; }                                                // return hire date

   // Mutator methods
   public void setEmplLastName( String emplLastName ) { this.emplLastName = emplLastName; }        // sets the empl name
   public void setEmplFirstName( String emplFirstName ) { this.emplFirstName = emplFirstName; }    // sets the empl name
   public void setEmplNum( String emplNum ) { this.emplNum = emplNum; }                            // sets the emp num
   public void setHireDate( String hireDate ) { this.hireDate = hireDate; }                        // sets the hire date
} // Employee