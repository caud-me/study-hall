import java.util.Scanner;

public class TASK05_ProblemStatement2_Caudilla_Arron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                            // Lets you add typing capability
        final double CONVERSION_RATE = 0.6214;                          // Constant value

        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();                                    // User input

        double miles = km * CONVERSION_RATE;                            // Conversion using arithmetic operation multiplication
        System.out.printf("Equivalent in miles: %.2f\n", miles);        // Displays result

        sc.close();                                                     // Clean up
    }
}
