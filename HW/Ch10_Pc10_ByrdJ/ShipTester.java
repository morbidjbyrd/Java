
/*
Demonstrate the classes in a program that has a Ship array. Assign various
Ship, CruiseShip, and CargoShip objects to the array elements. The
program should then step through the array, calling each object’s toString
method. (See Code Listing 11-25 as an example.)

       Each class must have both a no-args constructor and a constructor with arguments=


 ShipTester file must instantiate at least 2 of each ship type, i.e., Ship, CruiseShip, and CargoShip;
  You must test each constructor, i.e., for each ship type, create a ship using the no-args constructor and mutator methods to customize the fields and create a ship using the argumented constructor, and mutator methods, if necessary
    Your tester file must test every method at least once, i.e., constructors, mutators, accessors, toString, etc.

ShipTester should meet the following requirements:

    input section asks the user for the information for the various ship instantiations and validates input (only accept sensical answers).
    input section calls appropriate object’s methods to set the object's values; all methods of all classes must be called (implicitly or explicitly)
    output section displays information that reflects that all methods were demonstrated. 
    the only printf method that is permitted is the printf method, and you must use the printf formatting features, e.g., %d for integer variable output




            ((CruiseShip) ships[i]).setMaxPassengers( Integer.parseInt(inputValidation.getValidInput(
               "Enter maximum number of passengers: ", "\\d+", keyboard )));        

*/




//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      12/10/23
//*   Purpose   Inheritance and override
//***********************************************************************************************************

import java.util.Scanner;                                                                                                                                                   // import scanner

public class ShipTester                                                                                                                                                     // declare class         
{
   // declare main
   public static void main(String[] args)                                                                                                                                   // declare main()
   {
      final int MAX_SHIPS = 6;                                                                                                                                              // Max number of ships in the array
      final String ALPHA_PATTERN = "^[A-Za-z\\s]+$", NUM_PATTERN = "^[0-9]{4}$", NAME_QUERY = "Enter ship name: ", YEAR_QUERY = "Enter year built: ";                          // declare strings
      int decommissionQuery, maxPassengers = 0, cargoCapacity = 0;                                                                                                          // declare ints        

      Ship[] ships = new Ship[MAX_SHIPS];                                                                                                                                   // new ship array
      Scanner keyboard = new Scanner(System.in);                                                                                                                            // create scanner    
   
      // Instantiate ships with no-args constructors
      ships[0] = new Ship();                                                                                                                                                // create ship in array0      
      ships[1] = new CruiseShip();                                                                                                                                          // create ship in array1  
      ships[2] = new CargoShip();                                                                                                                                           // create ship in array2               
   
      // Input for Ship
      System.out.printf( "Enter information for Ship:\n" );                                                                                                                 // print intro
      ships[0].setName( inputValidation.getValidInput( NAME_QUERY, ALPHA_PATTERN, keyboard ));                                                                              // ship obj at [0] set name.  Use validation class to get input
      ships[0].setYearBuilt( inputValidation.getValidInput( YEAR_QUERY, NUM_PATTERN, keyboard ));                                                                           // ship obj at [0] set year built.  Use validation class  to get input
   
      // Input for CruiseShip
      System.out.printf( "Enter information for CruiseShip:\n" );                                                                                                           // print intro                        
      ships[1].setName( inputValidation.getValidInput( NAME_QUERY, ALPHA_PATTERN, keyboard ));                                                                              // ship obj at [1] set name.  Use validation class to get input
      ships[1].setYearBuilt( inputValidation.getValidInput( YEAR_QUERY, NUM_PATTERN, keyboard ));                                                                           // ship obj at [1] set year built.  Use validation class  to get input   
      ((CruiseShip) ships[1]).setMaxPassengers( Integer.parseInt( inputValidation.getValidInput( "Enter maximum number of passengers: ", "\\d+", keyboard )));              // ship obj at [1] set max passengers.  Use validation class  to get input            
   
      // Input for CargoShip
      System.out.printf("\nEnter information for CargoShip:\n" );                                                                                                           // print intro  
      ships[2].setName( inputValidation.getValidInput( NAME_QUERY, ALPHA_PATTERN, keyboard ));                                                                              // ship obj at [2] set name.  Use validation class to get input                           
      ships[2].setYearBuilt( inputValidation.getValidInput( YEAR_QUERY, NUM_PATTERN, keyboard ));                                                                           // ship obj at [2] set year built.  Use validation class  to get input    
      ((CargoShip) ships[2]).setCargoCapacity( Integer.parseInt( inputValidation.getValidInput( "Enter cargo capacity in tons: ", "\\d+", keyboard )));                     // ship obj at [2] set max cargo.  Use validation class  to get input       
   
      // Input for remaining ships
      for ( int i = 3; i < MAX_SHIPS; i++ )                                                                                                                                 // for loot, 3-6                  
      {
         System.out.printf( "\nEnter information for Ship %d:%n", i + 1 );                                                                                                  // print intro      
      
      // Initialize the ship based on the user's choice
         if (Integer.parseInt(inputValidation.getValidInput("Enter ship type:\n1. CruiseShip\n2. CargoShip ", "[1-2]", keyboard )) == 1)                                    // if menu choice is 1 (validated), then 
         {                                                                                                                                                                  
            ships[i] = new CruiseShip();                                                                                                                                    // create a new cruise ship
            ships[i].setName( inputValidation.getValidInput( NAME_QUERY, ALPHA_PATTERN, keyboard ));                                                                        // ship obj at sub[i]. set name.  Use validation class to get input   
            ships[i].setYearBuilt( inputValidation.getValidInput( YEAR_QUERY, NUM_PATTERN, keyboard ));                                                                     // ship obj at sub[i]. set year built.  Use validation class  to get input           
            ((CruiseShip) ships[i]).setMaxPassengers( Integer.parseInt( inputValidation.getValidInput( "Enter maximum number of passengers: ", "\\d+", keyboard )));        // Casting ship at sub[i] to type Cruise Ship. set max passengers.  Use validation class  to get input.  Parse int               
         } else {                                                                                                                                                            
            ships[i] = new CargoShip();                                                                                                                                     // create a new cargo ship                        
            ships[i].setName( inputValidation.getValidInput( NAME_QUERY, ALPHA_PATTERN, keyboard ));                                                                        // ship obj at sub[i]. set name.  Use validation class to get input         
            ships[i].setYearBuilt( inputValidation.getValidInput( YEAR_QUERY, NUM_PATTERN, keyboard ));                                                                     // ship obj at sub[i]. set year built.  Use validation class  to get input         
            ((CargoShip) ships[i]).setCargoCapacity( Integer.parseInt(inputValidation.getValidInput( "Enter cargo capacity in tons: ", "\\d+", keyboard )));                // Casting ship at sub[i] to type Cruise Ship. set max cargo.  Use validation class  to get input.  Parse int           
         } // create cargo or cruise ship
      
         if (Integer.parseInt( inputValidation.getValidInput( "Has the ship been decommissioned? (1 Yes or 2 No): ", "[1-2]", keyboard )) == 1)                             // if menu choice is 1 (validated), then                      
         {
            ships[i].decommissioned( Integer.parseInt(inputValidation.getValidInput( "Enter decommissioned year: ", NUM_PATTERN, keyboard )));                              // ship obj at sub[i]. set decom year.  Use validation class to get input             
         } // Decommissioned? 
      } // For loop. Fill array
      
      // Output 
      System.out.printf("\nShip Information:");                                                                                                                             // print outro                                                                                                                       
      for (Ship element : ships)                                                                                                                                            // for each loop                                                                                                                                              
      {
         System.out.printf( "%n%s%n", element.toString());                                                                                                                  // print ship info for each eleement.  calls toString method                                                                                                                                             
      }  // print output
      keyboard.close();                                                                                                                                                     // close keyboard                                                                                                                                                                                                                                                                                                            
   } // main()
} // ShipTester