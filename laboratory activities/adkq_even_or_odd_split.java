import java.util.Scanner;

public class adkq_even_or_odd_split {
    public static void main(String[] args) {
        // goal: create two arrays that sorts odd and even numbers.
        // formula: if number % 2 = 0, it is odd, else its even.

        Scanner sc = new Scanner(System.in);
        System.out.println("[code] number size in integer... ");
        int number_count = sc.nextInt();

        int[] raw_numbers = new int[number_count];
        System.out.println("[debug] raw_numbers.length >>> " + raw_numbers.length);

//        int[] prime_filter = new int[number_count];

        for (int i = 0; i < raw_numbers.length; i++) {
            System.out.print("[code] enter a number for index " + (i + 1) + " >>> ");
            raw_numbers[i] = sc.nextInt();
        }

        // this becomes the basis of the array size
        int count_even = 0;
        int count_odd = 0;

        // we count first how many even or odd numbers are in the array.
        // i am using enhanced for because we are not dealing with comparing per item, we just count.
        for (int number : raw_numbers) {
            if (number % 2 == 0) count_even++;
            else count_odd++;
        }

        // System.out.println("[debug] number of even numbers >>> " + count_even);
        // System.out.println("[debug] number of odd numbers >>> " + count_odd);

        // we then use that count to create an even and odd array.

        int[] even_numbers = new int[count_even];
        int[] odd_numbers = new int[count_odd];

        int even_index = 0;
        int odd_index = 0;

        // System.out.println("[debug] even_number.length >>> " + even_numbers.length);
        // System.out.println("[debug] odd_number.length >>> " + odd_numbers.length);

        for (int number : raw_numbers) {
            // why are we using even_index/ odd_index? we CANNOT rely on for loop index
            // because we're getting out of bounds error.

            if (number % 2 == 0) {
                even_numbers[even_index] = number;
                even_index++;

            } else {
                odd_numbers[odd_index] = number;
                odd_index++;
            }
        }

        System.out.println("[EVEN OR ODD SPLIT]\n");

        // finally, we display the newly created array.
        System.out.println("[code] even numbers...");
        for (int number : even_numbers) System.out.println(">>> " + number);

        System.out.println("[code] odd numbers...");
        for (int number : odd_numbers) System.out.println(">>> " + number);
    }
}
