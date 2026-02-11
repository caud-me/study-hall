import java.util.Scanner;

public class WL2_3134_caudilla_arron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get, value
        int user_limit = sc.nextInt();
        int x = 1;
        int y = 0;

        // utility cleanup
        sc.close();

        // loop runs until x reaches the user_limit
        while ( x <= user_limit ) {
            // sum of all integers from 1 to n
            // n * ( n + 1 ) / 2
            // modified for while loop
            y += x;
            x++;
        }

        // display, result
        System.out.println(y);
    }
}
