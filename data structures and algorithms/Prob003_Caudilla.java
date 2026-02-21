import java.util.Scanner;

public class Prob003_Caudilla {
    public static void main(String[] args) {
        // TODO: Hardcode now, dynamic later
        Scanner sc = new Scanner(System.in);

        // declaration and initialization
        final int STUDENT_COUNT = 30;
        final int[] STUDENTS = new int[STUDENT_COUNT];
              int summation = 0;

        System.out.println("[assistive instructor tool]");
        // focuses solely on storing data to the array, AND adding all values in the array.
        for (int i = 0; i < STUDENTS.length; i++) {
            System.out.print("enter student #" + (i + 1) + " score >>> ");
            STUDENTS[i] = sc.nextInt();
            summation += STUDENTS[i];
        }

        // we used the accumulator variable to divide it with the size of the array to get its average temperature.
        final double average = (double) summation / STUDENT_COUNT;

        // display outputs
        System.out.println("\ntotal accumulated score of " + STUDENT_COUNT + " students >>> " + summation);
        System.out.println("average score of " + STUDENT_COUNT + " students >>> " + average);
    }
}
