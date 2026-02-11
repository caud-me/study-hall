// note: `continue` to skip an iteration, `break` to terminate the whole loop
public class task15c_caudilla_arron {
    public static void main(String[] args) {
        for (int item = 1; item <= 20; item++) {

            if (item == 12) {
                System.out.println("Cart is full, processing checkout.");
                break;
            }

            System.out.println("Adding item #" + item + " to cart...");
        }
    }
}