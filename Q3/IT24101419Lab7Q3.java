import java.util.Scanner;

public class IT24101419Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double DISCOUNT_RATE = 0.05;
        final int NUMBER_OF_CUSTOMERS = 5;

        double billAmount, amountToPay;
        char paymentMode;

        double discount=0;

        for (int customerCount=1; customerCount<=5; customerCount++) {
            System.out.println("Customer " +customerCount);
            
            System.out.print("Enter total bill amount: ");
            billAmount = input.nextDouble();
            
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            paymentMode = input.next().toUpperCase().charAt(0);

          
            if (paymentMode == 'C') {
                 discount = billAmount * DISCOUNT_RATE;
                 amountToPay = billAmount - discount;

                System.out.println("Discount is : "+ discount);
                System.out.println("Amount to be paid: "+ amountToPay);
                System.out.println();
            }
   
            else if (paymentMode == 'O') {
                amountToPay = billAmount;
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: "+ amountToPay);
                System.out.println();
            } 

            else {
                System.out.println("Payment Mode is Not Valid");
                System.out.println();

                continue; 
            }
            
          
        }
    }
}
