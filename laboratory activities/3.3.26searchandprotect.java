import java.util.Scanner;

public class searchandprotect {
    public static void main(String[] args) {
        // initialization
        Scanner sc = new Scanner(System.in);

        // input
        // final just makes the variable unchanged all through-out. entirely optional.
        System.out.print("enter number of rows >>> ");          final int matrix_rows = sc.nextInt();
        System.out.print("enter number of columns >>> ");       final int matrix_columns = sc.nextInt();
        System.out.print("enter protected number >>> ");        final int protected_number = sc.nextInt();

        // build the matrix, traversing area
        final int[][] matrix = new int[matrix_rows][matrix_columns];
        for (int i = 0; i < matrix_rows; i++) {
            for (int j = 0; j < matrix_columns; j++) {
                System.out.print("enter element for matrix[" + (i) + "][" + (j) + "] >>> ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // filter out the matrix by only keeping the protected_number
        // then directly print it.
        for (int i = 0; i < matrix_rows; i++) {
            for (int j = 0; j < matrix_columns; j++) {
                if (matrix[i][j] != protected_number) matrix[i][j] = 0;
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

    }
}