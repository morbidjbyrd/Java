/*
5, late 0-1 day
-1, carTest, line 39 declares a reference type variable, the declaration should be before the processing, therefore before line 22.
Bonus (+5):
     Threw an error – lines 46 & 54, nextDouble() doesn’t take an argument.  If it worked on yours, please let me know what version of Java you’re using.
     -0, shouldn’t have variables speedCar1 and speedCar2 – you should be using the fields by way of the getters.  Not sure why you are having the speed increased by change and then also add change to get another speed.
     -0, perc should be PERC
*/

//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      10/22/23
//*   Purpose   Learn Object oriented programming. 
//***********************************************************************************************************

public class Car                                         // declare class Car
{
   public final int SPEED_LIMIT = 120;                   // max velocity
   private int yearModel;                                // delcare string
   private String make;                                  // delcare string
   private int speed;                                    // delcare int
   private double raceSpeed;                             // delcare string


   // Constructor
   public Car(int yearModel, String make)                // constructor creates cars with yearMOdel and make as fields
   {
      this.yearModel = yearModel;                        // Set the year model of this object to the year model we're providing when we create it. 
      this.make = make;                                  // this.XXX = XXX   This line is part of a constructor in a class. It assigns the value of the parameter XXX to the instance variable this.XXX. 
      this.speed = 0;                                    // By using this.XXX, you are explicitly referring to the instance variable XXX to distinguish it from the constructor's parameter XXX.  This sets the initial value for the XXX field when an object of the class is created
      this.raceSpeed = 0;                                // I added this, because the specs require speed to be an int.  I wanted to use double to ensure ties wouldn't happen in the race.
   } // Blueprint to create cars                                                    

   // Accessor methods 
   public int getYearModel()                             // Accessor method to get the year model of the car.  Accessor methods  are special methods that allow you to get (or read) the values of these attributes from outside the class.
   {
      return yearModel;                                  // Return the current year of the car.
   }

   public String getMake()                               // Accessor method to get the make of the car.
   {
      return make;                                       // Return the current make of the car.
   }

   public int getSpeed()                                 // Accessor method to get the speed of the car.
   { 
      return speed; 
   }                                                     // Return the current speed of the car.

   public double getRaceSpeed()                          // Accessor method to get the speed of the car.   
   { 
      return raceSpeed; 
   }                                                     // Return the current speed of the car.
                                  
  

   // Accelerate method
   public void accelerate( int change)                     
   {
      speed = ( speed + change <= SPEED_LIMIT ) ? speed + change : SPEED_LIMIT;               // ternary to determine if speed accumulates. 
   }

   // Brake method
   public void brake( int change) 
   {
      speed = ( speed - change >= 0 ) ? speed - change : 0;                                   // ternary to determine if speed decreases. 
   }
   
   // race method
   public void race(double change)                     
   {
      raceSpeed = ( raceSpeed + change <= SPEED_LIMIT ) ? raceSpeed + change : SPEED_LIMIT;   // ternary to determine if racespeed accumulates. 
   }
} // car