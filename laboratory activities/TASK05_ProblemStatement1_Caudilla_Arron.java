import java.util.Scanner;

public class TASK05_ProblemStatement1_Caudilla_Arron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                        // Lets you add typing capability
        final double EXCHANGE_RATE = 57.15;                         // Constant value

        System.out.print("Enter amount in PHP: ");
        double peso = sc.nextDouble();                              // User input

        double usd = peso / EXCHANGE_RATE;                          // Conversion using arithmetic operation division
        System.out.printf("Equivalent in USD: %.2f\n", usd);        // Displays result

        sc.close();                                                 // Clean up
    }
}