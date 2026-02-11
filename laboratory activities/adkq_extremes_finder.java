import java.util.Scanner;

public class adkq_extremes_finder {
    public static void main(String[] args) {
        System.out.println("[EXTREMES FINDER]\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("[code] number size in integer... "); int number_count = sc.nextInt();

        int[] raw_numbers = new int[number_count];
        System.out.println("[debug] raw_numbers.length >>> " + raw_numbers.length);

//        int[] prime_filter = new int[number_count];

        for (int i = 0; i < raw_numbers.length; i++) {
            System.out.print("[code] enter a number for index " + (i + 1) + " >>> "); raw_numbers[i] = sc.nextInt();
        }

        int min = raw_numbers[0];
        int max = raw_numbers[0];

        for (int i = 0; i < raw_numbers.length; i++) {
            // update min if current number is less than minimum number
            if (raw_numbers[i] < min) min = raw_numbers[i];
            // update max if current number is greater than minimum number
            if (raw_numbers[i] > max) max = raw_numbers[i];
        }

        System.out.println("[code] highest number in array is: " + min);
        System.out.println("[code] lowest number in array is: " + max);
    }
}
