import java.util.Scanner;

public class dsa_2_11_retail_discount_applicator_ENHANCED {
    public static void main(String[] args) {
        // initialization
            //todo: dynamic "cart", customizable discount rate, create a method.
            Scanner input = new Scanner(System.in);

            // i will let the user enter the "cart" size first,
            // this is pertaining to the array that we'll going to make.
            System.out.print("[agent] hi user. enter cart size >>> ");
            final int originalPrices_length = input.nextInt();

            // i will use the originalPrice_length variable to create the array programmatically.
            final double[] originalPrices = new double[originalPrices_length];
            // i will let the user type values inside of that array using for loop.
            for (int i = 0; i < originalPrices_length; i++) {
                System.out.print("\t\tenter cart no. " + (i+1) + " >>> ");
                originalPrices[i] = input.nextInt();
            }

            // i will the ask how much discount rate they want using int: from 0 to 100.
            // if the user types 5, the formula would be...
            //          >>> 1 - (5 * 0.01)
            //          >>> 1 - 0.05
            //          >>> 0.95
            // then, original price is being multiplied by 90% of itself.
            System.out.print("[agent] how much discount rate would you like to have? (0% to 100%) >>> ");
            final double intended_discount = input.nextInt();
            final double discount_rate = 1 - (intended_discount * 0.01);

            system_printer(originalPrices, discount_rate);
    }

    static void system_printer(double[] originalPrices, double discount_rate) {
        // processing
        // this method simply prints a discounted version of your cart.
        // requirements: originalPrices[] array, discount_rate double.
            // note: we we're explicitly told to use an enhanced for here.
            System.out.println("[agent] discounted prices...");
            for (double current_price : originalPrices) {
                current_price = current_price * discount_rate;

                // output
                System.out.println("\t\t\t\t\t\t >>> " + current_price);
            }
            // note: that this does NOT alter the original values inside the array.
    }
}

// fixme: question answered.
// you cannot use enhanced for loop if you want to modify the values of an array.
// you are just updating the local variable inside the for loop, not the value inside the array itself.

// for (int i = 0; i < originalPrices.length; i++) {
//      originalPrices[i] = originalPrices[i] * discount_rate;
// }

// this code snippet will actually modify the values of the array
// because the standard for loop gives us ability to access the array indices `i`