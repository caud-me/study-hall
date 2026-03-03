import java.util.ArrayList;
import java.util.Scanner;

public class contigoussublistsum {
    static int size = 0;
    static int target_number = 0;

    static int summation = 0;
    static int count_index = 0;

    public static void main(String[] args) {
        // initialization
        Scanner sc = new Scanner(System.in);

        // input
        // final just makes the variable unchanged all through-out. entirely optional.
        System.out.print("enter arraylist size >>> ");          size = sc.nextInt();
        System.out.print("enter target number >>> ");           target_number = sc.nextInt();

        // build the list, traversing area
        ArrayList<Integer> numbers = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            System.out.print("enter element for numbers[" + (i) + "] >>> ");
            numbers.add(sc.nextInt());
        }

        // preview just to let user know
        System.out.println("your current arraylist >>> " + numbers);

        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println("[debug] iteration " + i);

            for (int j = i; j < numbers.size(); j++) {
                summation = summation + numbers.get(j);             // System.out.println("[debug] s: " + summation);
                count_index++;                                      // System.out.println("[debug] i: " + count_index);
                                                                    // System.out.println("[debug] o: " + offset);
                if (summation == target_number) {
                    // found matches
                    System.out.print("[ ");
                    for (int k = i; k < i + count_index; k++) {
                        System.out.print(numbers.get(k) + " ");
                    }
                    System.out.print("] ");
                }
            }

            // reset if iteration fails.
            summation = 0;
            count_index = 0;

        }
    }
}
