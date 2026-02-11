import java.util.Scanner;

public class TASK08_LeapYearChecker_Caudilla_Arron {
    public static void main(String[] args) {
        // introduction and description for context
        System.out.println("leap year checker");
        System.out.println("[rule] a year must be divisible by 4\nand not divisible by 100, unless its\ndivisible by 400");

        // the program uses a scanner java utility to make the code interactive, so that the user can input a value.
        // correct value gets assigned to a variable the program declared.
        Scanner sc = new Scanner(System.in);

        System.out.print("year: "); int year = sc.nextInt();

        sc.close();

        // [rule] divisible by 4 and not 100, unless divisible by 400
        boolean rule = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

        // displays the code output and ends the program
        System.out.println();
        System.out.println("[verdict] " + (rule ? "year given is a leap year" : "year given is not a leap year"));
    }
}