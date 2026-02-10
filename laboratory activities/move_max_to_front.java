// caudilla, arron
import java.util.Scanner;

public class move_max_to_front {
    public static void main(String[] args) {
        // TODO: hardcode now, dynamic later

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your array >>> "); int array_size = sc.nextInt();

        int[] input = new int[array_size];

        System.out.println("you've requested to create an array with " + array_size + " values, so enter numbers " + array_size + "times.");
        for (int i = 0; i < input.length; i++) {
            System.out.print("value no." + (i + 1) + " >>> "); input[i] = sc.nextInt();
        }

        System.out.print("original array >>> ");
        for (int j = 0; j < input.length; j++) {
            System.out.print(input[j] + " ");
        }

        // MAIN PROCESS...
        int getMaxOfInput = input[0];
        int indexOfMax = 0;

        for (int i = 0; i < input.length; i++) {
            if (getMaxOfInput < input[i]) {
                getMaxOfInput = input[i];
                indexOfMax = i;
            }
        }

        System.out.println("\nfound max >>> " + getMaxOfInput);
        System.out.println("index of max >>> " + indexOfMax);

        int tempStore = input[0];

        // we then for loop again until the max index
        // ✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅
        // REVERSE SHIFT METHOD.
        for (int i = indexOfMax; i > 0; i--) {
            input[i] = input[i - 1];
        }

        // then. strictly put first index value with the getMaxOfInput
        input[0] = getMaxOfInput;

        System.out.print("\nnew number structure >>> ");
        for (int j = 0; j < input.length; j++) {
            System.out.print(input[j] + " ");
        }

        sc.close();
    }
}
