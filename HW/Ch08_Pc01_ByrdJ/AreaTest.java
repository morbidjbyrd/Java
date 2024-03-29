/*
Grading Criteria:

    AreaTest must meet the following requirements:

        declare variables (primitive and referential data types); declare Area class objects here. 
        input section gets the circle's radius, the rectangle's length and width, and the cylinder's radius and height
        input section can obtain the radii by any means you choose: user, file, or hardcoded.
        output section displays a report of the circle, rectangle and cylinder’s information in user-friendly, tabular, formatted output
*/

//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      11/12/23
//*   Purpose   Learn static classes
//***********************************************************************************************************

public class AreaTest                                                                                                              // Declare Area test                         
{
   public static void main(String[] args) 
   {
      double circleRadius = 1, rectangleLength = 1, rectangleWidth = 1, cylinderRadius = 1;                                        // declare and initialize values 
      float cylinderHeight = 1f;                                                                                                   // declare and initialize value 
      long  hollowCylinderHeight = 1;                                                                                              // declare and initialize values 
        
      // Test Circle                                                                               
      System.out.printf( "Circle Area: %.2f units squared%n", Area.getArea( circleRadius ));                                       // print circle results
   
      // Test Rectangle
      System.out.printf( "Rectangle Area: %.2f units squared%n", Area.getArea( rectangleLength, rectangleWidth ) );                // print rectangle results
   
      // Test Cylinder
      System.out.printf("Hollow Cylinder Area: %.2f units squared%n", Area.getArea( cylinderRadius, hollowCylinderHeight ) );      // print cylinder results
      
      // Test Cylinder
      System.out.printf("Cylinder Area: %.2f units squared%n", Area.getArea( cylinderRadius, cylinderHeight ) );                   // print cylinder results

   } // main()
} // AreaTest