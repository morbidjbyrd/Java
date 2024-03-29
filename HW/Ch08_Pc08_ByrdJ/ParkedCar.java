/*
8. Parking Ticket Simulator

Added Specifications:

must submit UML, ParkedCar.java, ParkingMeter.java, ParkingTicket.java, PoliceOfficer.java class files and the ParkingTicketTest.java file.


• The ParkedCar Class: This class should simulate a parked car. The
class’s responsibilities are as follows:
– To know the car’s make, model, color, license number, and the number of
minutes that the car has been parked.
*/

//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      11/12/23
//*   Purpose   Pass objects
//***********************************************************************************************************

// ParkedCar Class
public class ParkedCar                                                                                   // Declare calss 
{
   private String make, model, color, licensePlate;                                                      // Declare strings      
   private int time;                                                                                     // Declare primitive

   // constructor for parked car
   public ParkedCar( String make, String model, String color, String licensePlate, int timeParked )      // creates a car with these fields: make, model, color, lp, timeParked
   {
      this.make = make;                                                                                  // Set the make of this object to the input                                                                           
      this.model = model;                                                                                // Set the model of this object to the input                                                                                          
      this.color = color;                                                                                // Set the color of this object to the input                                                                                         
      this.licensePlate = licensePlate;                                                                  // Set the licence plate of this object to the input                                                                         
      this.time = timeParked;                                                                            // Set the timeParked of this object to the input                                                                                          
   } // creates a parked car

   // Getters for the ParkedCar class
   public String getMake() { 
      return make;  }                                                                                    // ParkedCar Make getter
   public String getModel() { 
      return model; }                                                                                    // ParkedCar model getter
   public String getColor() { 
      return color; }                                                                                    // ParkedCar color getter
   public int getTimeParked() { 
      return time;  }                                                                                    // ParkedCar time getter
   public String getLicensePlate() { 
      return licensePlate; }                                                                             // ParkedCar LP getter
} // ParkedCar