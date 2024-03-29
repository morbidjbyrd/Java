//***********************************************************************
//*     @author     James Byrd                                                
//*     Date        9/10/23
//*     Purpose     To get acquainted with float/double, 
//***********************************************************************

import java.util.Scanner;                                                                          // used to create object to get input from user

public class Ch02_Pc07_ByrdJ_1                                                                     // declares Ch02_Pc07_ByrdJ_1 class
{
   public static void main(String[] args)                                                          // declares main() method
{
      // declare string constants
      final String OUTPUT_BUS_NAME = "\t THE HAPPY MART\n";                                        // output for Business NAME
      final String OUTPUT_BUS_ADD = "\t 123 Sunny Avn \n";                                         // output for Business Address
      final String OUTPUT_BUS_CSZ = "\t Abingdon, Va 24266 \n";                                    // output for city state zip
      final String OUTPUT_BUS_PH = "\t 555-555-5555 \n\n";                                         // output for Business Phone
      final String PROMPT_PRICE = "Enter price: $";                                                // Prompt for price
      final String OUTPUT_PRICE = "Price: $";                                                      // output for price
      final String OUTPUT_STATE_TAX = "State Tax: $";                                              // output State Tax
      final String OUTPUT_CNTY_TAX = "County Tax: $";                                              // output country Tax
      final String OUTPUT_TOTAL_TAX = "Total Tax: $";                                              // output total tax
      final String OUTPUT_TOTAL_SALE = "Total Sale Price: $";                                      // output total sale
      final String OUTPUT_OUTRO = "\n\n\t PLEASE COME AGAIN!";                                     // output for outro
      final String NEW_LINE = "\n";                                                                // output new line
      
      // declare primitive constants needed to hold constant values 
      final float STATE_SALES_TAX_RATE = 0.04f;                                                    // holds the state sales tax rate.  Used float to try different types
      final double CNTY_SALES_TAX_RATE = 0.02;                                                     // holds the county sales tax rate.

      // declare referential data types
      double price;                                                                                // holds the price of the item
      Scanner keyboard = new Scanner(System.in);                                                   // Scanner object to read input
      String outputMsg;                                                                            // declares outputMsg
       
      // prompt user for price and store the price in a variable      
      System.out.printf(PROMPT_PRICE);                                                             // prompts the user for price
      price = keyboard.nextDouble();                                                               // stores price from keyboard input.   Not sure how to do error detection without trying to add loops 
      
      // calculations
      double stateSalesTaxAmt = STATE_SALES_TAX_RATE * price;                                      // get the State Sales tax
      double cntySalesTaxAmt = CNTY_SALES_TAX_RATE * price;                                        // get the county Sales tax
      double totalSalesTax = cntySalesTaxAmt + stateSalesTaxAmt;                                   // Total sales tax
      double totalSale = totalSalesTax + price;                                                    // Total sale price
      
      // formatting output 
      outputMsg =   OUTPUT_BUS_NAME                                                                // output business name
                  + OUTPUT_BUS_ADD                                                                 // output business address 
                  + OUTPUT_BUS_CSZ                                                                 // output business city, state, zip
                  + OUTPUT_BUS_PH                                                                  // output business phone #
                  + OUTPUT_PRICE + String.format("%.2f", price) + NEW_LINE                         // Output price.  String.format("%.2f", value) formats the text to precision 2. 
                  + OUTPUT_STATE_TAX + String.format("%.2f", stateSalesTaxAmt) + NEW_LINE          // Output state tax 
                  + OUTPUT_CNTY_TAX + String.format("%.2f", cntySalesTaxAmt) + NEW_LINE            // Output county tax
                  + OUTPUT_TOTAL_TAX + String.format("%.2f", totalSalesTax) + NEW_LINE             // Output the total tax. Rounding the sum of taxes may reflect real-life accuracy.
                  + OUTPUT_TOTAL_SALE + String.format("%.2f", totalSale)                           // Output the total sale price
                  + OUTPUT_OUTRO;                                                                  // Output outro
                  
      System.out.print(outputMsg);                                                                 // print output msg
   } // main()
} // Ch02_Pc07_ByrdJ_1