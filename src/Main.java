import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    private static PrintStream out = new PrintStream(System.out);
    private static Scanner in = new Scanner(System.in);

    public static int addTwoNumbers (int firstNumber, int secondNumber){

//        int result = firstNumber+secondNumber;
//        return result;
        return firstNumber + secondNumber;


    }

    /**
     * This function requieres an amount of money without tax and it computes the
     * total amount plus a tax of 14%
      * @param amount - the amount without taxes
     * @return the total amount with taxes
     */
    public static double computeAmountPlusIVATax (double amount){

        return amount*(1+0.14);

    }

    public static void main(String[] args) {

        // Conjunto: coleccion de elementos cuales quiera

        int result = addTwoNumbers(10,45);
        out.println(result);

        for( int initialAmount = 1000; initialAmount < 2000; ++initialAmount){
            double amountWithTaxes = computeAmountPlusIVATax(initialAmount);
            out.println("Amount + taxes is: "+ amountWithTaxes);
        }

        double amountWithTaxes = computeAmountPlusIVATax(1000);
        out.println("Amount + taxes is: "+ amountWithTaxes);

    }
}
