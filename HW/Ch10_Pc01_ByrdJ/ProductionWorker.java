/*
Next, write a class named ProductionWorker that extends the Employee
class. The ProductionWorker class should have fields to hold the following
information:
• Shift (an integer)
• Hourly pay rate (a double)

The workday is divided into two shifts: day and night. The shift field will be an
integer value representing the shift that the employee works. The day shift is
shift 1 and the night shift is shift 2. Write one or more constructors and the
appropriate accessor and mutator methods for the class. Demonstrate the classes
by writing a program that uses a ProductionWorker object.
*/

//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      12/03/23
//*   Purpose   Inheritance
//***********************************************************************************************************

public class ProductionWorker extends Employee                                                                                 // Declare Class ProductionWorker
{
   // Declartions        
   private int shift;                                                                                                          // Declare primitive
   private double hourlyPayRate;                                                                                               // Declare primitive

   // Constructors
   public ProductionWorker( String emplLastName, String emplFirstName, String emplNum, String hireDate, int shift, double hourlyPayRate )                 
   {
      super( emplLastName, emplFirstName, emplNum, hireDate );                                                                 // Call the constructor of the employee superclass with employee information.                  
      this.shift = shift;                                                                                                      // this object gets shift         
      this.hourlyPayRate = hourlyPayRate;                                                                                      // this object gets hourly pay rate          
   }

   // Accessor methods
   public int getShift() { return shift; }                                                                                     // getter.  returns shift      
   public double getHourlyPayRate() { return hourlyPayRate; }                                                                  // getter.  returns hourly pay rate                                                                  

   // Mutator methods                                                                                                          // setter.  sets shift      
   public void setShift(int shift) { this.shift = shift; }                                                                     // setter.  sets hourly pay rate           
   public void setHourlyPayRate(double hourlyPayRate) { this.hourlyPayRate = hourlyPayRate; }                                                
} // ProductionWorker