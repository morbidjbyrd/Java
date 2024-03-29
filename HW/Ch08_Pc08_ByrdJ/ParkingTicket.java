/*

• The ParkingTicket Class: This class should simulate a parking
ticket. The class’s responsibilities are as follows:
– To report the make, model, color, and license number of the illegally
parked car
– To report the amount of the fine, which is $25 for the first hour or part of
an hour that the car is illegally parked, plus $10 for every additional hour
or part of an hour that the car is illegally parked
– To report the name and badge number of the police officer issuing the
ticket

*/
//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      11/19/23
//*   Purpose   Pass objects
//***********************************************************************************************************

public class ParkingTicket                                                          // Declare class parkingTicket
{
   private String make, model, color, licensePlate, name, badge;                    // Delcare strings    
   private double fine;                                                             // Declare double
   
   // ParkingTicket constructor
   public  ParkingTicket(ParkedCar car, double fine, PoliceOfficer officer)         // creates a parking ticket with these fields: Car Object, Fine, PoliceOffice object. 
   {
      make = car.getMake();                                                         // Copying the make attribute from the Car object to the ParkingTicket
      model = car.getModel();                                                       // Copying the model attribute from the Car object to the ParkingTicket
      color = car.getColor();                                                       // Copying the color attribute from the Car object to the ParkingTicket
      licensePlate = car.getLicensePlate();                                         // Copying the licensePlate attribute from the Car object to the ParkingTicket
      this.fine = fine;                                                             // Set the fine of this object to the input 
      name = officer.getName();                                                     // Copying the name attribute from the cop object to the ParkingTicket
      badge = officer.getBadge();                                                   // Copying the badge attribute from the cop object to the ParkingTicket
   } // creates a parking ticket

   // Getters for the ParkingTicket class
   public String getMake() { 
      return make;  }                                // ParkingTicket MAKE getter                            
   public String getModel() { 
      return model; }                                // ParkingTicket model getter  
   public String getColor() { 
      return color; }                                // ParkingTicket color getter  
   public String getLicensePlate() { 
      return licensePlate; }                         // ParkingTicket LP getter  
   public double getFineDue() { 
      return fine;  }                                // ParkingTicket Fine getter  
   public String getName() { 
      return name;  }                                // ParkingTicket name getter  
   public String getBadge() { 
      return badge; }                                // ParkingTicket badge getter  
} // ParkingTicket