import java.util.Scanner;

public class DWL1_3134_Caudilla_Arron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int x;
        do {
            System.out.println("[code] enter an even number between 1 to 10...");
            x = sc.nextInt();
        } while ((x < 1 || x > 10) || (x % 2 != 0));

        // explanation...

        // x < 1 || x > 10 is first being checked in this expression
        // this ensures that the program only evaluates values from 1 to 10.
        // otherwise, the program will repeatedly prompt the user

        // followed by the x % 2 != 0
        // which checks if the number given is not divisible by 2, making it an odd number.

        // how the logic work together:
        // if the number given is 6, the expression would be 6 < 1 || 6 > 10.
        // which evaluates to `False || False`, returning `False` altogether.

        // now proceed to next expression, it would be 6 % 2 != 0.
        // 6 is divisible by 2, so no remainder. it would output 0
        // but i used a not equal relational operator. it checks if 0 is not equal to 0, which is `False`

        // two expressions result to a `(False) || (False)`, returning `False` altogether
        // therefore, the while condition is no longer met and the loop will end,
        // printing the final line as shown below.

        System.out.println("[code] " + x + " is an even number and is part of 1 to 10");
    }
}
