public class Task12_02_Caudilla_Arron {
    public static void main(String[] args) {

        // while version
        System.out.println("Multiplication Table using WHILE LOOP:\n");

        int i = 1; // row
        while (i <= 10) {
            int j = 1; // column
            while (j <= 10) {
                System.out.print( (i * j) + "\t");
                j++;
            }

            System.out.println();
            i++;
        }

        // do-while version
        System.out.println("\nMultiplication Table using DO-WHILE LOOP:\n");

        int k = 1; // row
        do {
            int l = 1; // column
            do {
                System.out.print( (k * l) + "\t");
                l++;
            } while (l <= 10);
            
            System.out.println();
            k++;
        } while (k <= 10);
    }
}
