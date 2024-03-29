/* 
Design a CruiseShip class that extends the Ship class. The CruiseShip
class should have the following members:
• A field for the maximum number of passengers (an int).
• A constructor and appropriate accessors and mutators.
• A toString method that overrides the toString method in the base
class. The CruiseShip class’s toString method should display
only the ship’s name and the maximum number of passengers.

       Each class must have both a no-args constructor and a constructor with arguments
Each of your three ship classes must have a decommissioned() method that receives a year of withdrawal from the fleet and stores that in an int field in the Ship.java class named decommissioned -- only the Ship.java class will have this field.


*/

//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      12/10/23
//*   Purpose   Inheritance and override
//***********************************************************************************************************


public class CruiseShip extends Ship                                                          // declare class
{
   private int maxPassengers;                                                                 // declare int

   // no-args constructor
   public CruiseShip() 
   {
      super();                                                                                // Call super class ship
   } // create CruiseShip

   // Constructor 3 arguments
   public CruiseShip( String name, String yearBuilt, int maxPassengers ) 
   {
      super(name, yearBuilt);                                                                  // Call super class ship
      this.maxPassengers = maxPassengers;                                                      // this obj gets max passengers
   } // create CruiseShip

   // Accessor and Mutator 
   public int getMaxPassengers(){ return maxPassengers; }                                      // getter passengers                 
   public void setMaxPassengers(int maxPassengers)  { this.maxPassengers = maxPassengers; }    // setter passsengers
   
   // toString method
   @Override                                                                                   // override method
   public String toString() 
   { 
      return "Cruise " + super.toString() + "\nMax Passengers: " + maxPassengers;              // Get the ship info
   } // toString()
    
   // decommissioned Method
   public void decommissioned( int year ) 
   {
      this.yearDecommissioned = year;                                                          // this obj getss year decom
   } // decommissioned()
} // CruiseShip