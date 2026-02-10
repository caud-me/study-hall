// caudilla, arron
import java.util.Scanner;

public class row_vs_column_product {
    public static void main(String[] args) {
        // TODO: hardcode now, dynamic later

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row size of your array >>> "); int array_size_row = sc.nextInt();
        System.out.print("Enter the column size of your array >>> "); int array_size_column = sc.nextInt();

        int[][] input = new int[array_size_row][array_size_column];

        System.out.println("you've requested to create an 2d array with " + array_size_row + "x" + array_size_column + " values, so enter numbers " + (array_size_row * array_size_column) + " times.");
        System.out.println();
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print((i + 1) + ":" + (j + 1) + " value >>> "); input[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        int tempProduct = 1; // if you do 0, you'll always get 0 as a result

        // row product
        System.out.println();
        for (int i = 0; i < array_size_row; i++) {
            for (int j = 0; j < array_size_column; j++) {
                tempProduct *= input[i][j];
            }
            System.out.println("row " + (i + 1) + " product >>> " + tempProduct);
            tempProduct = 1; // reset
        }

        // column product
        System.out.println();
        for (int i = 0; i < array_size_column; i++) {
            for (int j = 0; j < array_size_row; j++) {
                tempProduct *= input[j][i];
            }
            System.out.println("column " + (i + 1) + " product >>> " + tempProduct);
            tempProduct = 1; // reset
        }

        sc.close();
    }
}
