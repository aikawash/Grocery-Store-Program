/*
 * Grocery Store Program - calculates the price of an item based on cost per 
pound and
 *       the items weight
 */

import javax.swing.JOptionPane;
public class GroceryStore
{
   public static void main(String[] args)
   {
/*
 * Defining variables used in this program
 */
      double PoundsOfItem;
      double PricePerPoundOfItem;
      double TotalCostOfItem;

/*
 * Using te JOptionsPane prompting for input values for pounds and cost per pound
 */
         PoundsOfItem =
            Double.parseDouble(JOptionPane.showInputDialog (null,
             "Enter the total pounds needed"));
         PricePerPoundOfItem =
                     Double.parseDouble(JOptionPane.showInputDialog (null,
             "Enter the price per pound"));
/*
 * Calculating the results of the inputed values
 */
         TotalCostOfItem = PoundsOfItem * PricePerPoundOfItem;
         
/*
*Outputing to the screen the results of the calculations
*/

       JOptionPane.showMessageDialog(null, "\nGrocery Store Program" +
          "\n\nThe total pounds of the item needed:" +
          + PoundsOfItem + "\nPrice Per Pound Of Item....$" +
PricePerPoundOfItem + 
             "\nTotal Cost of Item....$" + TotalCostOfItem);
        System.exit(0);
   }
}