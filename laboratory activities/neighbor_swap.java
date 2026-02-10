// caudilla, arron
import java.util.Scanner;

public class neighbor_swap {
    public static void main(String[] args) {
        // TODO: hardcode now, dynamic later

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your array >>> "); int array_size = sc.nextInt();

        int[] input = new int[array_size];

        System.out.println("you've requested to create an array with " + array_size + " values, so enter numbers " + array_size + "times.");
        for (int i = 0; i < input.length; i++) {
            System.out.print("value no." + (i + 1) + " >>> "); input[i] = sc.nextInt();
        }

        // this just displays the raw array.
        System.out.print("original array >>> ");
        for (int j = 0; j < input.length; j++) {
            System.out.print(input[j] + " ");
        }

        // MAIN PROCESS...
        int TEMP_ODD = input[0];
        int TEMP_EVEN = input[0];

        for (int i = 0; i < input.length; i++) {
            // step 1, get the even indexes first.

            if ((i + 1) % 2 == 0) { // is index even?
                // the if block should run the second
                                                                                                        // System.out.println("EVEN INDEX:" + input[i]);
                // we need to store the value somewhere before overwriting it with TEMP_ODD.
                // i need to use TEMP_EVEN.
                TEMP_EVEN = input[i];
                // TEMP_EVEN = 1;
                                                                                                        // System.out.println("TEMP_EVEN >>> " + TEMP_EVEN);
                // now that TEMP_EVEN has value, i need to switch the values now.
                input[i - 1] = TEMP_EVEN;
                input[i] = TEMP_ODD;
            } else  { // is index odd?
                                                                                                        // System.out.println("ODD INDEX:" + input[i]);
                // the else block should run first, because first index is always odd.
                // (that is, if we were to ignore zero indexing.)
                // TEMP_ODD = 2.
                TEMP_ODD = input[i];
                // System.out.println("TEMP_ODD >>> " + TEMP_ODD);
            }
        }

        // this just displays the output.
        System.out.print("\nnew number structure >>> ");
        for (int j = 0; j < input.length; j++) {
            System.out.print(input[j] + " ");
        }

        sc.close();
    }
}
