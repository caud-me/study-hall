import java.util.Scanner;

public class adkq_shopping_cart_system {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("[code] cart size in integer... "); int cart_count = sc.nextInt();

        int[] cart = new int[cart_count];
        System.out.println("[debug] cart.length >>> " + cart.length);

        for (int i = 0; i < cart.length; i++) {
            System.out.print("[code] enter a price for index " + (i + 1) + " >>> "); cart[i] = sc.nextInt();
        }

        int TEMP_summation_disc = 0;
        int TEMP_summation = 0;
        int TEMP_expensive_item = cart[0];

        System.out.println("[SHOPPING CART SYSTEM]\n");

        System.out.println("[code] your shopping cart...");
        for (int number : cart) {
            System.out.println(">>> PHP " + number);
        }

        System.out.println("------------------------------------------\ndiscount manager...");

        for (int i = 0; i < cart.length; i++) {
            // in charge of calculating the total amount (no discount)
            TEMP_summation += cart[i];
        }

        for (int i = 0; i < cart.length; i++) {
            // in charge of making discounts for items over PHP 100
            if (cart[i] > 100) {
                System.out.println("[10% OFF] PHP " + cart[i] + " >>> PHP " + (int) (cart[i] * 0.9));
                cart[i] *= 0.9;
            }

            // in charge of getting the expensive item in the cart (with discount)
            if (cart[i] > TEMP_expensive_item) TEMP_expensive_item = cart[i];

            // in charge of calculating the total amount
            TEMP_summation_disc += cart[i];
        }

        System.out.println("------------------------------------------\nsummary...");

        System.out.println("[code] total amount: PHP " + TEMP_summation);
        System.out.println("[code] total discounted amount: PHP " + TEMP_summation_disc);
        System.out.println("[code] most expensive item: PHP " + TEMP_expensive_item);
    }
}
