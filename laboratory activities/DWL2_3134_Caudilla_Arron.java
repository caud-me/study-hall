import java.util.Scanner;

public class DWL2_3134_Caudilla_Arron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char x;

        do {
            System.out.println("[code] do you wish to proceed?");
            x = sc.next().toUpperCase().charAt(0);
        } while ((x != 'Y') && (x != 'N'));

        // explanation...
        // the loop should only happen when the user inputs an invalid value
        // so, it makes sense for expressions in while loop to have negation

        // if x is not equal to 'y' and x is not equal to 'n',
        // the do-while loop terminates.

        // how the logic work together...
        // if the character given is `y`, the expression would be...
        // ('Y' != 'Y') && ('Y' != 'N')
        // notice that the lowercase 'y' turned to 'Y'. that is made possible by `.toUpperCase()`
        // evaluating them would be (False) && (True)
        // since the outermost expression uses logical AND, both must be True, however, one of them is False
        // resulting to `False` altogether

        // therefore, the while condition is no longer met and the loop will end,
        // printing the final line as shown below.

        System.out.println("[code] goodbye");
    }
}
