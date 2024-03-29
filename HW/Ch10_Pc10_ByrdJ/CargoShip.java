/*
Design a CargoShip class that extends the Ship class. The CargoShip
class should have the following members:
• A field for the cargo capacity in tonnage (an int).
• A constructor and appropriate accessors and mutators.
• A toString method that overrides the toString method in the base
class. The CargoShip class’s toString method should display only
the ship’s name and the ship’s cargo capacity.

       Each class must have both a no-args constructor and a constructor with arguments
Each of your three ship classes must have a decommissioned() method that receives a year of withdrawal from the fleet and stores that in an int field in the Ship.java class named decommissioned -- only the Ship.java class will have this field.


*/

//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      12/10/23
//*   Purpose   Inheritance and override
//***********************************************************************************************************

public class CargoShip extends Ship                                                          // Declare class
{
   private int cargoCapacity;                                                                // declare int

   // no-args constructor
   public CargoShip() 
   {
      super();                                                                               // Call super ship
   } // create Cargo ship

   // Constructor 3 arguments
   public CargoShip(String name, String yearBuilt, int cargoCapacity) 
   {
      super(name, yearBuilt);                                                                // Call the constructor in ship
      this.cargoCapacity = cargoCapacity;                                                    // this obj gets cargo capacity
   } // create Cargo ship

   // Accessor and Mutator methods
   public int getCargoCapacity() { return cargoCapacity; }                                   // getter cargo capac          
   public void setCargoCapacity(int cargoCapacity) { this.cargoCapacity = cargoCapacity; }   // setter cargo capac            

   // toString method
   @Override                                                                                 // override method         
   public String toString() 
   {
      return "Cargo " + super.toString() + "\nCargo Capacity: " + cargoCapacity + " tons";   // returns output text.  
   } // toString()
    
   // decommissioned Method
   public void decommissioned( int year )                                                    
   {
      this.yearDecommissioned = year;                                                        // this obj gets year decom    
   } // decommissioned()
} // CargoShip