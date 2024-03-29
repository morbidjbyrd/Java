/*
• The ParkingMeter Class: This class should simulate a parking meter.
The class’s only responsibility is as follows:
– To know the number of minutes of parking time that has been purchased.
*/

//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      11/19/23
//*   Purpose   Pass objects
//***********************************************************************************************************

// ParkingMeter Class
public class ParkingMeter                                                                     // declare class
{
   private int purchasedTime;                                                                 // delcare primitive                                 
   
   // Constructor for parking meter
   public ParkingMeter(int purchasedTime) { this.purchasedTime = purchasedTime; }

   // Getter for the ParkingMeter class
   public int getPurchasedTime() { 
      return purchasedTime; }    
} // ParkingMeter