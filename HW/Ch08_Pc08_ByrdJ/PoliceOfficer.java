/* 
• The PoliceOfficer Class: This class should simulate a police officer
inspecting parked cars. The class’s responsibilities are as follows:
– To know the police officer’s name and badge number
– To examine a ParkedCar object and a ParkingMeter object, and
determine whether the car’s time has expired
– To issue a parking ticket (generate a ParkingTicket object) if the
car’s time has expired

– fine, which is $25 for the first hour or part of
an hour that the car is illegally parked, plus $10 for every additional hour
or part of an hour that the car is illegally parked

*/

//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      11/19/23
//*   Purpose   Pass objects
//***********************************************************************************************************

// PoliceOfficer Class
public class PoliceOfficer                                                                // declare class
{
   private String name, badge;                                                            // declare strings
   
   // Constructor for police officer
   public PoliceOfficer( String name, String badge ) 
   {
      this.name = name;                                                                   // Set the name of this object to the input  
      this.badge = badge;                                                                 // Set the badge of this object to the input  
   } // creates a police officer

   // Getters for the PoliceOfficer class
   public String getName()  { 
      return name;  }                                                                     // PoliceOffice Name getter
   public String getBadge() { 
      return badge; }                                                                     // Police officer badge getter

   // Method to check if the car's time has expired and issue a ticket
   public ParkingTicket checkParkedCar(ParkedCar car, ParkingMeter meter) 
   {  
      final double TEN = 10.0, TWENTYFIVE = 25.0, SIXTY = 60.0;                           // Declare constant primitives
      double fineDue;                                                                     // declare primitive
      int minutesOver;                                                                    // declare primitive
       
      if (car.getTimeParked() > meter.getPurchasedTime())                                 // If Car has exceeded the purchased parking time.
      {
         // Calculate fine amount
         minutesOver = car.getTimeParked() - meter.getPurchasedTime();                    // calculates minutes over
         fineDue = TWENTYFIVE + Math.ceil( minutesOver / SIXTY ) * TEN;                   // calculates the fine due.  Math.ceil Rounds UP 
      
         // Issue a parking ticket
         return new ParkingTicket( car, fineDue, this );                                  // creates a new parking ticket with the fields: Car, Fine, and this current instance of the PoliceOfficer.  And returns it.
      } else {
         return null; 
      }  // No ticket issued
   } // creates tickket or null
} // PoliceOfficer