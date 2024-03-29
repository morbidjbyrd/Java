/*
7. Circle Class
Write a Circle class that has the following fields:
radius: a double
PI: a final double initialized with the value 3.14159
The class should have the following methods: 
Constructor. Accepts the radius of the circle as an argument. XXX
Constructor. A no-arg constructor that sets the radius field to 0.0. XXX
setRadius. A mutator method for the radius field. XXX
getRadius. An accessor method for the radius field. XXX
area. Returns the area of the circle, which is calculated as
area = PI * radius * radius
diameter. Returns the diameter of the circle, which is calculated as
diameter = radius * 2
circumference. Returns the circumference of the circle, which is calculated as
circumference = 2 * PI * radius
Write a program that demonstrates the Circle class by asking the user for the circle’s radius, creating
a Circle object, and then reporting the circle’s area, diameter, and circumference.

Grading Criteria:

            meets specifications in book
            CircleTest should meet the following requirements:

    all task-specific numeric literals are declared as constants
    declare and define variables (primitive and referential data types);

            input section prompts user for radius value of a circle
            input section instantiates Circle object with the user’s value
            input section instantiates an object for the no-arg constructor (user should be informed with a prompt, e.g. “Another circle with zero radius is being prepared for you.”)
            input section prompts user for value for new Circle object that currently has a radius of 0.
            input section stores value in correct CircleTest variables;
            process section performs all "setting" by calling appropriate Circle class object mutator methods; sets radius of second circle with user’s input
            output section performs all "getting" by calling appropriate Circle class object accessor methods; displays all Circle objects (circle1 and circle2) information in user-friendly, grammatically correct format. For example, “Your first circle has a radius of 10; an area of 314; a diameter of 20; and a circumference of 62.8 (using a value of 3.14 for PI).”
            you are not to use the print or println methods -- the only print method you may use is the printf method
*/

//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      10/22/23
//*   Purpose   Learn classes
//***********************************************************************************************************

import java.util.Scanner;                                                                                                                          // import scanner

public class CircleTest                                                                                                                            // declare class       
{
   public static void main(String[] args)                                                                                                          // declare main method                                                                                                                       
   {    
      // Declarations  
      final String getRadius1 = "Enter the radius of the circle: ",                                                                                // constant string     
                   zeroPrompt = "Another circle with zero radius is being prepared for you.%n",                                                    // constant string         
                   getRadius2 = "Enter a new radius for the second circle: ",                                                                      // constant string   
                 printCircle1 = "Your first circle has a radius of %.2f; an area of %.2f; a diameter of %.2f; and a circumference of %.2f.\n",     // constant string   
                 printCircle2 = "Your second circle has a radius of %.2f; an area of %.2f; a diameter of %.2f; and a circumference of %.2f.\n";    // constant string   
                  
      double userRadius;                                                                                                                           // Primitive          
      double userRadius2;                                                                                                                          // Primitive         
      Scanner keyboard = new Scanner(System.in);                                                                                                   // scanner object       
   
      // Input: Prompt user for the radius of the circle
      System.out.printf( getRadius1 );                                                                                                             // Print getRadius prompt              
      userRadius = keyboard.nextDouble();                                                                                                          // userRaidus gets keyboard input
   
      // instantiates Circle object with the user’s value
      Circle circle1 = new Circle( userRadius );                                                                                                   // Create a circle with input    
   
      // Prompts user for value for new Circle object that currently has a radius of 0
      System.out.printf( zeroPrompt );                                                                                                             // print 0 radius prompt
   
      // Prompt the user for the value for the second Circle object with a radius of 0 & stores value in correct CircleTest variables
      System.out.printf( getRadius2 );                                                                                                             // print get radius2 prompt 
      userRadius2 = keyboard.nextDouble();                                                                                                         // userRadius2 gets keyboard input
   
      // Processing:  Create a second Circle object with the user's input
      Circle circle2 = new Circle();                                                                                                               // create circle, cirlce2, no args      
      circle2.setRadius( userRadius2 );                                                                                                            // set Radius of Circle2 to userinput                                  
   
      // Output:  Display information about the circles
      System.out.printf( printCircle1, circle1.getRadius(), circle1.area(), circle1.diameter(), circle1.circumference(), circle1.PI);              // print output for circle1
      System.out.printf( printCircle2, circle2.getRadius(), circle2.area(), circle2.diameter(), circle2.circumference(), circle2.PI);              // print output for circle2
   } // main()
} // CircleTest