import java.util.Scanner;

public class TASK04_ProblemStatement2_Caudilla_Arron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                        // Lets you add typing capability

        System.out.print("Enter student name: ");
        String name = sc.nextLine();                                // User input

        System.out.print("Enter numerical grade (0-100): ");
        int grade = sc.nextInt();                                   // User input

        String letterGrade;                                         // If the grade satisfies a condition, letter will be determined
        if (grade >= 90 && grade <= 100) {
            letterGrade = "A";
        } else if (grade >= 80) {
            letterGrade = "B";
        } else if (grade >= 70) {
            letterGrade = "C";
        } else if (grade >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        System.out.println("\n--- Student Grade Report ---");       // Displays result
        System.out.println("Name: " + name);
        System.out.println("Numerical Grade: " + grade);
        System.out.println("Letter Grade: " + letterGrade);

        sc.close();                                                 // Clean up
    }
}
