//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      10/22/23
//*   Purpose   Learn Object oriented programming. 
//***********************************************************************************************************

import java.util.Scanner;                                                                                             // import scanner   

public class CarTest                                                                                                  // declare class         
{
   static final int YEAR1 = 1940, YEAR2 = 2015, YEAR3 = 2014;                                                         // declare static constant Ints ( Didn't you say we could use these now? )                                                                          
   static final String MAKE1 = "Studebaker", MAKE2 = "Alfa Romeo", MAKE3 = "Audio S5";                                // declare static constant strings 
                                                  
   public static void main(String[] args)                                                                             // declare main method                           
   {
      
      final String OUTPUT = "%d %s: Current speed: %d mph %n";                                                        // constant strings  
      int menu, i, yearChosen;                                                                                        // declare ints
      String makeChosen;                                                                                              // declare strings 
        
      Scanner keyboard = new Scanner(System.in);                                                                      // declare Scanner keyboard: This is an object of the Scanner class
      menu = getValidInput( keyboard );                                                                               // menu gets valid input.  Sends keyboard, returns int
         
      switch (menu)                                                                                                   // Switch for menu
      {
         case 1:                                                                                                      // menu option 1, then  
            yearChosen = YEAR1;                                                                                       // yearChosen gets 1940
            makeChosen = MAKE1;                                                                                       // makeChosen gets Studebaker   
            break;                                                                                                    // break                    
         case 2:                                                                                                      // menu = 2   
            yearChosen = YEAR2;                                                                                       // yearChosen gets 2015  
            makeChosen = MAKE2;                                                                                       // makeChosen gets Alfa Romeo   
            break;                                                                                                    // break     
         default:                                                                                                     // menu = 3       
            yearChosen = YEAR3;                                                                                       // yearChosen gets 2014
            makeChosen = MAKE3;                                                                                       // makeChosen gets Audio S5   
      }
                                                                                                                                                                                                                                 
      Car myCar = new Car( yearChosen, makeChosen );                                                                  // creating myCar from the Car class.
   
                                               
        // Accelerate five times                                                                                      // for loop to acclerate up to 5x.                
      for ( i = 0; i < 5; i++) 
      {
         myCar.accelerate(5);                                                                                         // calls accelerate method to see if speed accumulates or reaches max                                               
         System.out.printf( OUTPUT, myCar.getYearModel(), myCar.getMake(), myCar.getSpeed());                         // prints velocity                             
      } // Has myCar accelerate 5 times. 
   
        // Brake five times
      for ( i = 0; i < 5; i++)                                                                                        // for loop to decelerate up to 5x.                                                        
      {
         myCar.brake(5);                                                                                              // calls brake method to see if speed accumulates or reaches min                                              
         System.out.printf( OUTPUT, myCar.getYearModel(), myCar.getMake(), myCar.getSpeed() );                        // prints velocity                                                  
      } // has myCar decelerate
   } // main()
    
   public static int getValidInput( Scanner keyboard )
   {
      // Declare constants, primitives 
      final int MIN = 0,
                MAX = 4;                                                                                      
      final String RANGE_PROMPT = "Your input is outside the valid range.%n" ,                                        // static constant string prompt Valid Range
                     INT_PROMPT = "Please enter a valid value.%n",                                                    // static constant string prompt valid input
                   INPUT_PROMPT = "Select Your Car: %n1. %d %s %n2. %d %s %n3. %d %s%n";
      int menu;                                                                                                       // declare int menu.   Not static, because I didn't want to make a variable static.            
                 
      // do while validation loop.
      do 
      {
         System.out.printf( INPUT_PROMPT, YEAR1, MAKE1, YEAR2, MAKE2, YEAR3, MAKE3 );                                 // print 
         
         while ( !keyboard.hasNextInt() )                                                                             // nested while loop to force int input.
         {
            System.out.printf(INT_PROMPT);                                                                            // print not Int
            keyboard.next();                                                                                          // clear invalid input
            System.out.printf( INPUT_PROMPT );                                                                        // print 
         } // gets valid float input
         menu = keyboard.nextInt();                                                                                   // menu gets int from input
      
         if ( menu <= MIN || menu >= MAX) System.out.printf(RANGE_PROMPT);                                            // if not valid #, print error message 
      } while ( menu <= MIN || menu >= MAX);                                                                          // keeps looping while out of range
      return menu;                                                                                                    // return array with valid input      
   } // getValidInput()
} // carTest





