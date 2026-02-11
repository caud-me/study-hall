import java.util.Scanner;

public class TASK04_ProblemStatement1_Caudilla_Arron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                        // Lets you add typing capability

        System.out.println("Enter five numbers:");
        double num1 = sc.nextDouble();                              // User input
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
        double num5 = sc.nextDouble();

        double sum = num1 + num2 + num3 + num4 + num5;              // Finding average with arithmetic operations: addition and division
        double average = sum / 5;
        System.out.println("The average is: " + average);           // Displays result

        sc.close();                                                 // Clean up
    }
}
