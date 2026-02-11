import java.util.Scanner;

public class TASK08_Valid_Triangle_Caudilla_Arron {
    public static void main(String[] args) {
        // introduction and description for context
        System.out.println("the triangle inequality theorem");
        System.out.println("[rule] the sum of the lengths of any two\nsides of a triangle is greater than the\nlength of the third side.\n");


        // the program uses a scanner java utility to make the code interactive, so that the user can input a value.
        // correct value gets assigned to a variable the program declared.
        Scanner sc = new Scanner(System.in);

        System.out.print("a: "); int a = sc.nextInt();
        System.out.print("b: "); int b = sc.nextInt();
        System.out.print("c: "); int c = sc.nextInt();

        sc.close();

        // [rule] sum of any two sides must be greater than the third side
        boolean rule = (a + b) > c && (a + c) > b && (b + c) > a;

        // displays the code output and ends the program
        System.out.println();
        System.out.println("[verdict] " + (rule ? "values given can form a triangle." : "values given cannot form a triangle."));

        // [extras] detailed output
        System.out.println(
                "a: " + ((b + c) > a) + ", because... " + b + " + " + c + " > " + a + "\n" +
                        "b: " + ((a + c) > b) + ", because... " + a + " + " + c + " > " + b + "\n" +
                        "c: " + ((a + b) > c) + ", because... " + a + " + " + b + " > " + c
        );
    }
}