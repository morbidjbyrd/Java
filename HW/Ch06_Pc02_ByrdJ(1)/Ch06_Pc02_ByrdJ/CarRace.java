//*********************************************************************************************************
//*   @author   James Byrd
//*   Date      10/22/23
//*   Purpose   Learn Object oriented programming. 
//***********************************************************************************************************

import java.util.Random;

public class CarRace                                                                                                       // declare class carRace 
{
   public static void main(String[] args)                                                                                  // declare main
   {
      // declarations
      final int YEAR1 = 2023, YEAR2 = 2022;                                                                                // declare int YEAR constants
      final double ACC = 5;                                                                                                // declare double acceleration constant
      final String OUTPUT = "%d %s: Distance Completed: %.1f miles %n",                                                    // constant declare string output   
                   MODEL1 = "Toyota",                                                                                      // constant declare string Model1  
                   MODEL2 = "Honda",                                                                                       // constant declare string Mode2
                   TRACK = "=======",                                                                                      // constant declare string Track
                   NL = "%n",                                                                                              // constant String New Line
                   perc = "%",                                                                                             // constant string perc
                   STRING = "s",                                                                                           // constant string s
                   BLANK = "",                                                                                             // constant strin blank
                   WINNER = "%d %s is the winner!!!";                                                                      // constant declare string WINNER!      
      int k;                                                                                                               // declare primitive int
      double change, speedCar1 = 0 , speedCar2 = 0;                                                                        // declare primitive doubles                
      Car car1 = new Car(YEAR1, MODEL1 );                                                                                  // create car1 object
      Car car2 = new Car(YEAR2, MODEL2 );                                                                                  // create car2                   
      Random rand = new Random();                                                                                          // creat random# object
      
      // starting positions for race
      System.out.printf( OUTPUT, car1.getYearModel(), car1.getMake(), car1.getRaceSpeed());                                // prints car1 current distance
      System.out.printf( OUTPUT, car2.getYearModel(), car2.getMake(), car2.getRaceSpeed());                                // prints car2 current distance
      for ( k = 0; k < 18; k++) System.out.printf( TRACK );                                                                // Prints the edge of the track.  
      System.out.printf( NL );                                                                                             // prints a new line
      System.out.printf( MODEL1.substring(0, 1) + NL );                                                                    // prints T.
      System.out.printf( MODEL2.substring(0, 1) + NL );                                                                    // prints H. 
      for ( k = 0; k < 18; k++) System.out.printf( TRACK );                                                                // Prints the edge of the track.
      System.out.printf( NL );                                                                                             // prints a new line 

      // Race loop
      while (car1.getRaceSpeed() < car1.SPEED_LIMIT  && car2.getRaceSpeed() < car2.SPEED_LIMIT)                            // While Car1 AND car2 have not passed the finish line, loop
      {
         if ( car1.getRaceSpeed() < car1.SPEED_LIMIT )                                                                     // if car1 has not not reached the finish line
         { 
            change = rand.nextDouble( ACC ) + ACC;                                                                         // change gets a random # 
            car1.race( change );                                                                                           // call accelerate method.  Send change to accumulate
            System.out.printf( OUTPUT, car1.getYearModel(), car1.getMake(), car1.getRaceSpeed());                          // prints car1 current distance
            speedCar1 =  car1.getRaceSpeed() + change;                                                                     // a second accumulator to break ties.                                          
         }
      
         if ( car2.getRaceSpeed() < car2.SPEED_LIMIT )                                                                     //  if car2 has not not reached the finish line
         {
            change = rand.nextDouble( ACC ) + ACC;                                                                         // change gets a random #
            car2.race( change );                                                                                           // call accelerate method.  Send change to accumulate
            System.out.printf( OUTPUT, car2.getYearModel(), car2.getMake(), car2.getRaceSpeed());                          // prints car2 current distance
            speedCar2 =  car2.getRaceSpeed() + change;                                                                     // a second accumulator to break ties.                      
         }
         
         // Top Lane
         for ( k = 0; k < 18; k++) System.out.printf( TRACK );                                                             // Prints the edge of the track.   Trial and error.  Seemed to print an almost random # of "="
         System.out.printf( NL );                                                                                          // prints a new line
         System.out.printf( perc + Math.round( car1.getRaceSpeed() ) + STRING + MODEL1.substring(0, 1) + NL , BLANK );     // prints blank spaces based on rounded speed and then the 1st letter of the Model Name.  TEXT.substring = Start at 0 to 1 (exclusive). 
         
         // Bottom lane
         System.out.printf( perc + Math.round( car2.getRaceSpeed() ) + STRING + MODEL2.substring(0, 1) + NL , BLANK );     // prints blank spaces and then the 1st letter of the Model Name.  seems more complicated because of literals requirement. 
         for ( k = 0; k < 18; k++) System.out.printf( TRACK );                                                             // Prints the edge of the track.
         System.out.printf( NL );                                                                                          // prints a new line
      } // while loop.  Ends Race
      
      // Determine winner
      if ( speedCar1 > speedCar2 )                                                                                         // Since, it's adding doubles, the odds of a tie are almost 0.  
      {                                                                                                                    // In the event of a tie, Honda Wins.  
         System.out.printf( WINNER, car1.getYearModel(), car1.getMake() );                                                 // print car 1 is winner
      } else {
         System.out.printf( WINNER, car2.getYearModel(), car2.getMake() );                                                 // else print car2 is winner
      } // Declare winner
   } // main()
} // CarRace