import javax.swing.JOptionPane;


public class RestaurantBill2
{
    public static void main(String[] args) {
        String input;
        String bill;
        double mealCharge;
        final double tax = 0.0675; // 6.75% constant amount of meal charge
        double taxAmount;
        double totalWithTax;
        final double tip = 0.20; // 20% constant amount of total amount after adding tax amount
        double tipAmount;
        double totalBill;

        //user has to enter the charge for the meal
        input = JOptionPane.showInputDialog("Please enter the charge for your meal £");
        mealCharge = Double.parseDouble(input);

        //calculate meal charge, tax amount, tip amount, and total bill
        taxAmount = mealCharge * tax;
        totalWithTax = mealCharge + taxAmount;
        tipAmount = totalWithTax * tip;
        totalBill = totalWithTax + tipAmount;

        //display to user meal charge, tax amount, tip amount, and total bill
        bill = "Your meal charge amount is £" + mealCharge + "." + "\n" +
                "Your tax amount is £" + taxAmount + "." + "\n" +
                "Your tip amount is £" + tipAmount + "." + "\n" +
                "-----------------------------------" + "\n" +
                "Your total bill amount is £" + totalBill + ".";

        JOptionPane.showMessageDialog(null, bill);

        //end the program
        System.exit(0);
    }
}