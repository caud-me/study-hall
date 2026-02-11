import java.util.Scanner;

public class Task12_01_Caudilla_Arron {
    public static void main(String[] args) {
        // initializations
        Scanner scanner = new Scanner(System.in);
        String tryAgain;

        do {
            // program input
            System.out.print("Enter starting number: "); int start = scanner.nextInt();
            System.out.print("Enter ending number: "); int end = scanner.nextInt();

            // just checking if numbers need to be swapped if necessary
            if (start > end) {
                int temp = start;
                start = end;
                end = temp;
                System.out.println("inputs have been swapped so the starting number is smaller");
            }

            // Initialize counters and iterators
            int count_even = 0;
            int count_odd = 0;
            int currentNum = start;

            // even generator
            System.out.println("\nEven numbers between " + start + " and " + end + ":");

            currentNum = start;
            while (currentNum <= end) {
                if (currentNum % 2 == 0) {
                    System.out.print(currentNum + " ");
                    count_even++;
                }
                currentNum++;
            }

            // odd generator
            System.out.println("\n\nOdd numbers between " + start + " and " + end + ":");

            currentNum = start;
            while (currentNum <= end) {
                if (currentNum % 2 != 0) {
                    System.out.print(currentNum + " ");
                    count_odd++;
                }
                currentNum++;
            }

            // program output
            System.out.println("\n\nTotal even numbers: " + count_even);
            System.out.println("Total odd numbers: " + count_odd);

            // ask if user wants to repeat
            System.out.print("\nDo you want to try again? (Y/N): ");
            tryAgain = scanner.next();

            System.out.println();
            //  outer loop repeats as long as user enters 'Y' or 'y'
            // equalsIgnoreCase removes the need to do next().toUpperCase().charAt[0]
        } while (tryAgain.equalsIgnoreCase("Y"));

        System.out.println("Thank you for using the program!");

        // end all process
        scanner.close();
        
        
    }
}
