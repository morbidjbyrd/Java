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
area. Returns the area of the circle, which is calculated as area = PI * radius * radius  XXX
diameter. Returns the diameter of the circle, which is calculated as diameter = radius * 2  XXX
circumference. Returns the circumference of the circle, which is calculated as circumference = 2 * PI * radius   XXX
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

public class Circle                                                                   // declare class   
{
   public final double PI = 3.14159;                                                  // declare and initialize PI
   private double radius;                                                             // declare radius                 
   
   // Constructor. Accepts the radius of the circle as an argument.
   public Circle( double radius )               
   {
      this.radius = radius;                                                           // Set the radius of this object to the user input
   }
 
   // Constructor. A no-arg constructor that sets the radius field to 0.0.
   public Circle() 
   {
      this.radius = 0.0;                                                              // sets radius to 0.0
   }

   // setRadius. A mutator method for the radius field.
   public void setRadius( double radius ) 
   {
      this.radius = radius;                                                           // Set the radius of the circle 
   }

   // getRadius. An accessor method for the radius field.  
   public double getRadius() 
   {
      return radius;                                                                  // return's radius
   }

   // area. Returns the area of the circle
   public double area() 
   {
      return PI * radius * radius;                                                    // return area
   }

   // diameter. Returns the diameter of the circle
   public double diameter() 
   {
      return radius * 2;                                                              // return diameter
   }

   // circumference. Returns the circumference of the circle
   public double circumference() 
   {
      return 2 * PI * radius;                                                         // return Circumference
   } 
} // Circle