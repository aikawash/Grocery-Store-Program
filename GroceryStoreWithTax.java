/*
 * Grocery Store Program - calculates the price of an item based on cost per 
pound and
 *       the items weight
 */

import javax.swing.JOptionPane;
public class GroceryStoreWithTax
{
   public static void main(String[] args)
   {
/*
 * Defining variables used in this program
 */
      double PoundsOfItem;
      double PricePerPoundOfItem;
      double TotalCostOfItemBeforeTax;
      double SalesTax;
      double TotalCostOfItemAfterTax;
      double YourTax;

/*
 * Using te JOptionsPane prompting for input values for pounds and cost per pound
 */
         PoundsOfItem =
            Double.parseDouble(JOptionPane.showInputDialog (null,
             "Enter the total pounds needed"));
         PricePerPoundOfItem =
                     Double.parseDouble(JOptionPane.showInputDialog (null,
             "Enter the price per pound"));
         SalesTax =
                        Double.parseDouble(JOptionPane.showInputDialog (null,
             "Enter your sales tax e.g 0.06 for 6%"));
         
/*
 * Calculating the results of the inputed values
 */
         TotalCostOfItemBeforeTax = PoundsOfItem * PricePerPoundOfItem;
         
         YourTax = TotalCostOfItemBeforeTax * SalesTax;
         
         TotalCostOfItemAfterTax = TotalCostOfItemBeforeTax + YourTax;
         
        
         
/*
*Outputing to the screen the results of the calculations
*/

       JOptionPane.showMessageDialog(null, "\nGrocery Store Program" +
          "\n\nThe total pounds of the item needed:" +
          + PoundsOfItem + "\nPrice Per Pound Of Item....$" +
PricePerPoundOfItem + 
             "\nTotal cost of item before tax....$" + TotalCostOfItemBeforeTax +
                     "\nSales Tax....$" + YourTax +
                           "\nTotal Cost of item after tax...$" + TotalCostOfItemAfterTax);
                                      System.exit(0);
   }
}