import java.util.Scanner;

public class Task09_Caudilla_Arron_SwitchActivity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // allows the program to request user values

        // requesting values
        System.out.println();
        System.out.print("input number 1: "); double x = sc.nextDouble();
        System.out.print("input number 2: "); double y = sc.nextDouble();

        System.out.println("operator to perform. supports addition [+] subtraction [-] multiplication [*] division [/]");
        char operator = sc.next().charAt(0); // ensures the first letter is always taken

        // memory
        double res = 0;

        sc.close();
        // determining calculation through the operator the client put in
        switch (operator) {
            // code block for addition [+]
            case '+':
                res = x + y;
                System.out.println(x + " " + operator + " " + y + " = " + res);
                break;
            // code block for subtraction [-]
            case '-':
                res = x - y;
                System.out.println(x + " " + operator + " " + y + " = " + res);
                break;
            // code block for multiplication [*]
            case '*':
                res = x * y;
                System.out.println(x + " " + operator + " " + y + " = " + res);
                break;
            // code block for division [/]
            case '/':
                if (x == 0 || y == 0) // uses if statement to check if either x or y values are zero. this prevents the program from executing division.
                    System.out.println("[code] error. division by zero");
                else {
                    res = x / y;
                    System.out.println(x + " " + operator + " " + y + " = " + res);
                }
                break;
            // default behavior. aka error handler.
            default: System.out.println("[code] error. invalid operator"); break;
        }

        // OPTIONAL + displays console output [removes unnecessary decimals if res is a whole number]
        // just learned about conversion in google :)
        // String builderX = x % 1.0 == 0 ? String.valueOf((int) x) : String.valueOf(x);
        // String builderY = y % 1.0 == 0 ? String.valueOf((int) y) : String.valueOf(y);
        // String builderZ = res % 1.0 == 0 ? String.valueOf((int) res) : String.valueOf(res);
        //
        // System.out.println(builderX + " " + operator + " " + builderY + " = " + builderZ);
    }
}

