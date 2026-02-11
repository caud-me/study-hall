import java.util.Scanner;

public class Task14_01_Caudilla_Arron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // this lets the user interact with the program
        double[] day = new double[7]; // we have set up a fixed amount of items in the array
        int i; // this will be our main counter

        System.out.println();
        System.out.println("------ WEEKLY SALES TRACKING SYSTEM ------");

        // we instantiate the counter for loop use
        // this area simply saves all the input as long as they are positive values
        for (i = 0; i < day.length; i++) {
            do {
                System.out.printf("Enter sales for Day %d: ", i + 1);
                day[i] = sc.nextDouble();

                if (day[i] < 0) System.out.println("Invalid input. Sales cannot be negative");
            } while (day[i] < 0);
        }

        System.out.println();
        System.out.println("------ DAILY SALES LIST ------");

        // we reuse the counter and re-instantiate it
        // this area is in-charge of listing down the stored input
        for (i = 0; i < day.length; i++) {
            System.out.printf("Day %d sales: P%.2f\n", i + 1, day[i]);
        }

        System.out.println();
        System.out.println("------ WEEKLY SALES SUMMARY ------");

        // too many instantiations
        double summation = 0; // will hold the sum of all values in the array
        double min = day[0]; int daymin = 0; // will find the smallest number in the array AND get the array index
        double max = day[0]; int daymax = 0; // will find the largest number in the array AND get the array index

        for (i = 0; i < day.length; i++) {
            summation += day[i]; // add all values from the array

            // get the smallest number
            if (min > day[i]) {
                min = day[i];
                daymin = i + 1;
            }

            // get the largest number
            if (max < day[i]) {
                max = day[i];
                daymax = i + 1;
            }
        }

        // it is possible to condense the code to use just one for loop. however, readability wise ill separate them.

        System.out.printf("Total Sales P%.2f\n", summation);
        System.out.printf("Average Daily Sales P%.2f\n", summation / day.length);
        System.out.printf("Highest Sales P%.2f (Day %d)\n", max, daymax);
        System.out.printf("Lowest Sales P%.2f (Day %d)\n", min, daymin);
    }
}
