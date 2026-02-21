import java.util.Scanner;

// TODO: Hardcode now, dynamic later.
public class Prob001_Caudilla {
    public static void main(String[] args) {
        // TODO: Hardcode now, dynamic later
        Scanner sc = new Scanner(System.in);

        // declaration and initialization
        final int GROUP = 5;
        final String[] NAMES = new String[GROUP];

        // focuses solely on storing data to the array, AND adding all values in the array.
        for (int i = 0; i < NAMES.length; i++) {
            System.out.print("enter student #" + (i + 1) + " name >>> ");
            NAMES[i] = sc.nextLine();
        }

        // i added a dummy header
        System.out.println("Element\t\tValues");

        // we make use of indices as numbered list for the names
        // FIXME: note that in the instructions, numbering explicitly starts at 0!
        for (int i = 0; i < GROUP; i++) {
            System.out.println(i + "\t\t\t" + NAMES[i]);
        }
    }
}
