import java.util.Scanner;

public class adkq_two_sum {
    public static void main(String[] args) {
        System.out.println("[TWO SUM PROBLEM]\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("[code] raw_numbers size in integer... "); int raw_numbers_count = sc.nextInt();

        int[] raw_numbers = new int[raw_numbers_count];
        System.out.println("[debug] raw_numbers.length >>> " + raw_numbers.length);

        for (int i = 0; i < raw_numbers.length; i++) {
            System.out.print("[code] enter a number for index " + (i + 1) + " >>> "); raw_numbers[i] = sc.nextInt();
        }

        System.out.println("[code] now, enter your target value >>> "); int target_sum = sc.nextInt();

        // goal:
        // assume this is target = 13
        // it should output 5 and 8 because it adds up to 13, if not return "no value supported"

        for (int i = 1; i < raw_numbers.length; i++) {
            for (int j = i + 1; j < raw_numbers.length; j++) {
                if  (raw_numbers[i] + raw_numbers[j] == target_sum) System.out.println("code] Found two values! >>> " + raw_numbers[i] + " + " + raw_numbers[j] + " = " + target_sum);
            }
        }
    }
}
