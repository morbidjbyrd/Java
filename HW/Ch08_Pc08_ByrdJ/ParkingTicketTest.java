/*
    ParkingTicketTest must meet the following requirements:
        all numeric literals and long or repeated string literals are declared as constants
        declare variables (primitive and referential data types);
        initialize variables which require initialization (primitive and referential data types) after declaration and within housekeeping
        do NOT initialize variables that do not require initialization
        input section gets:
            the information needed for the car (make, model, color, license number and number of minutes parked);
            information needed for the meter (number of minutes purchased);
            information about the police officer (name, badge number, determine if parked cars are illegally parked, issue a parking ticket if car is illegally parked) 
        input section calls appropriate object’s methods to set the object's values (constructor's / setters)
        output section displays a ticket for the illegally parked car OR a message that an officer might say if your car is legally parked.
            information needed for the meter (number of minutes purchased);
            information about the police officer (name, badge number, determine if parked cars are illegally parked, issue a parking ticket if car is illegally parked)
        the only print methods that are permitted are fully functioning printf() methods
*/

//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      11/19/23
//*   Purpose   Pass objects
//***********************************************************************************************************

public class ParkingTicketTest                                                                                                     // declare class
{   
   private String make, model, color, licensePlate;                                                                                // declare strings
   private int timeParked;                                                                                                         // declare primitive   

   public static void main(String[] args)                                                                                          // main method
   {
      ParkingTicket parkingTicket;                                                                                                 // declare parkingTicket object
      
      // Create a parked car
      ParkedCar parkedCar1 = new ParkedCar("Toyota", "Corolla", "Blue", "AZZKIKR", 90);                                              
   
      // Create a parking meter
      ParkingMeter parkingMeter1 = new ParkingMeter(60);
   
      // Create a Meter maid
      PoliceOfficer policeOfficer1 = new PoliceOfficer("Sheriff Bart", "00001");
   
      // Check if Ticketed:  Initalies the parking ticket
      parkingTicket = policeOfficer1.checkParkedCar( parkedCar1, parkingMeter1 );                                                  // policeOfficer is an object of the PoliceOfficer class, and checkParkedCar is a method of that class
                                                                                                                                   // sending parked car object and parkingMeter object
      // Display the result
      if (parkingTicket != null)                                                                                                   // if the parkingTicket is not null
      {
         System.out.printf("Illegally Parked!%n");                                                                                 // print illegal parked
         System.out.printf("Make: %s%n", parkingTicket.getMake());                                                                 // print make
         System.out.printf("Model: %s%n", parkingTicket.getModel());                                                               // print model                                                          
         System.out.printf("Color: %s%n", parkingTicket.getColor());                                                               // print color 
         System.out.printf("License Plate: %s%n", parkingTicket.getLicensePlate());                                                // print LP
         System.out.printf("Fine Amount: $%.2f%n", parkingTicket.getFineDue());                                                    // print fine due 
         System.out.printf("Officer Name: %s%n", parkingTicket.getName());                                                         // print office name
         System.out.printf("Badge Number: %s%n",  parkingTicket.getBadge());                                                       // print badge#
      } else {                                                                                                                     // IF not null Print ticket, otherwise 
         System.out.printf("Hmm... I'll be back in %d minutes", parkingMeter1.getPurchasedTime() - parkedCar1.getTimeParked() );   // print back statement
      } // print output
   } // main()
} // ParkingTicketTest