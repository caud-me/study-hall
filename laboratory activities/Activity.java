import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("the numbers (from 1 to " + n + ") that are divisible by 2 and 3 includes...");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}