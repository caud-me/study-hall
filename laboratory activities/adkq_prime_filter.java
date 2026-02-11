import java.util.Scanner;

public class adkq_prime_filter {
    public static void main(String[] args) {
        System.out.println("[PRIME FILTER]\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("[code] number size in integer... "); int number_count = sc.nextInt();

        int[] raw_numbers = new int[number_count];
        System.out.println("[debug] raw_numbers.length >>> " + raw_numbers.length);

//        int[] prime_filter = new int[number_count];

        for (int i = 0; i < raw_numbers.length; i++) {
            System.out.print("[code] enter a number for index " + (i + 1) + " >>> "); raw_numbers[i] = sc.nextInt();
        }

        for(int i = 0; i < raw_numbers.length; i++){
            // numbers less than 2 (0,1) are never prime.
            if (raw_numbers[i] < 1) raw_numbers[i] = 0;

            // iterate from 2 to half of the current number, iterating to full is redundant
            for (int j = 2; j <= raw_numbers[i] / 2; j++)

                // once its passed the if modulo its considered a prime number
                // if we find a number that divides it evenly, it's not prime!

                if (raw_numbers[i] % j == 0) {
                    raw_numbers[i] = 0;
                    break;
                }

        }

        System.out.println("\n[code] this is prime numbers filtered out");
        for (int i = 0; i < raw_numbers.length; i++){
            System.out.print(raw_numbers[i] + ", ");
        }
    }
}
