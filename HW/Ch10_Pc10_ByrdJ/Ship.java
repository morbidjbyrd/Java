/*
10. Ship, CruiseShip, and CargoShip Classes

Design a Ship class that the following members:
• A field for the name of the ship (a string).
• A field for the year that the ship was built (a string).
• A constructor and appropriate accessors and mutators.
• A toString method that displays the ship’s name and the year it was
built.

       Each class must have both a no-args constructor and a constructor with arguments
Each of your three ship classes must have a yearDecommissioned() method that receives a year of withdrawal from the fleet and stores that in an int field in the Ship.java class named yearDecommissioned -- only the Ship.java class will have this field.



Added Specifications:

    all constructors should initialize all class fields
    submit Ship.java, CruiseShip.java, CargoShip.java, and the ShipTester.java file.
    all class files methods are commented    
    all class properties are commented
    you must name all classes in accordance with the standard established by me for earlier assignments (so that your classes are uniquely named)
    abide by the information provided in the writeup on Comments provided in Unit 3
   
           Each of the toString methods must indicate whether the ship has been yearDecommissioned, and if so, when.


*/

//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      12/10/23
//*   Purpose   Inheritance and override
//***********************************************************************************************************

public class Ship                                                                          // Declare class
{ 
   public String name, yearBuilt;                                                          // Declare Strings      
   public int yearDecommissioned;                                                          // Declare int                     

   // no-args constructor                                
   public Ship() {}                                

   // Constructor with 2 arguments
   public Ship(String name, String yearBuilt)                 
   {
      this.name = name;                                                                    // this object gets names               
      this.yearBuilt = yearBuilt;                                                          // this object gets year built     
      this.yearDecommissioned = 0;                                                         // this object gets year Decomm           
   } // create a ship

   // Accessors and Mutators
   public String getName() { return name; }                                                // name getter                            
   public void setName(String name)  { this.name = name;}                                  // set name           

   public String getYearBuilt() { return yearBuilt;}                                       // get year built      
   public void setYearBuilt( String yearBuilt ){ this.yearBuilt = yearBuilt;}              // set year built                 

   public int getYearDecommissioned(){return yearDecommissioned;}                          // get year decom         
   public void setYearDecommissioned( String yearBuilt ){ this.yearBuilt = yearBuilt;}     // set year decomm                       

   // decommissioned Method. 1 arg
   public void decommissioned( int year )                                                                                                                        
   {
      this.yearDecommissioned = year;                                                      // this obj gets year decom                                                          
   } // decommissioned Method()

   // toString method. no arg
   public String toString()                                                             
   {
      return ( yearDecommissioned == 0) ?                                                                       // Ternary: if yearDecom is deafult, 0.
         "Ship Name: " + name + "\nYear Built: " + yearBuilt :                                                  // print this
         "Ship Name: " + name + "\nYear Built: " + yearBuilt + "\nDecommissioned: " + yearDecommissioned;       // otherwise print this
   } // toString method()
} // Ship