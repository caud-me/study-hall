import java.util.Scanner;

public class TASK05_ProblemStatement3_Caudilla_Arron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                            // Lets you add typing capability

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();                                  // User input

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();                                  // User input

        System.out.println("Addition: " + (num1 + num2));               // Adds two values
        System.out.println("Subtraction: " + (num1 - num2));            // Subtracts two values
        System.out.println("Multiplication: " + (num1 * num2));         // Multiplies two values

        if (num2 != 0) {                                                // Divisor must first be checked if it is not 0 before attempting to divide
            System.out.println("Division: " + (num1 / num2));           // If not 0, then proceed to divide two values
        } else {
            System.out.println("Division: Cannot divide by zero!");     // If 0, Division can't be done
        }

        sc.close();                                                     // Clean up
    }
}
