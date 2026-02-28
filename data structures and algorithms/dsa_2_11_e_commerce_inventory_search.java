public class dsa_2_11_e_commerce_inventory_search {
    public static void main(String[] args) {
        // initialization
        final int[] product_stock = {101, 202, 303, 404, 505};
        final int target_stock = 303;
        boolean found = false;

        // processing
        // for loop runs through array indices
        for (int current_product : product_stock) {
            if (current_product == target_stock) {
                found = true;
                break;
            }
            // it's a way of saying: is the current product matches target stock? then STOP THE LOOP!
        }

        // output
        if (found) System.out.println("product " + target_stock + " is in stock.");
        else System.out.println("product " + target_stock + " is out of stock.");
    }
}