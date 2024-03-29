/*
Chapter 8 Programming Challenge 1 Area Class

        
Area Class
 - static mehtods that calc the area of shapes
 - overloaded methods nameed getArea: 
 - 1st: Circle: Get radius as Double, return double area.  A = pi * r^2
 - 2nd: Rectangle.  Get length and width as doubles, return double area.  A = L * W
 - 3rd: Cylinder: Can't find from book ??  A = 2*pi*r*h + 2* pi * r^2
 

Added Specifications:

    you must name the class and test class in accordance with the standard established by me for earlier assignments (so that your class is uniquely named)
    submit UML for your class and tester files

*/

//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      11/12/23
//*   Purpose   Learn static classes
//***********************************************************************************************************

public class Area                                                                 // Declare class area
{                                                                                       
   public static double getArea(double radius)                                    // Declare getArea method Circle   
   {
      return Math.PI * radius * radius;                                           
   } // getArea() circle                                                        

   public static double getArea(double length, double width)                      // Declare getArea method Rectrangle 
   {
      return length * width;                                                          
   } // getArea() rectangle                                                          

   public static double getArea(double radius, long height)                       // Declare getArea method Hollow Cylinder.   
   {                                                                              // More interesting solution. 
      return 2 * Math.PI * radius * height;                                        // returning the total area
   } // getArea() Hollow cylinder
   
   public static double getArea(double radius, float height)                      // Declare getArea method Cylinder.   
   {                                                                              // More interesting solution. 
      double width = height;                                                      // casting height as double, so I can use rectangle method
      double baseSurfaceArea = getArea( radius );                                 // calc base area of cylinder         
      double lateralSurfaceArea = getArea( 2 * Math.PI * radius , width );        // calc the lateral surface area of cylinder.   2 * Math.PI * radius = Length       
      return 2 * baseSurfaceArea + lateralSurfaceArea;                            // returning the total area
   } // getArea() cylinder
   
} // Area