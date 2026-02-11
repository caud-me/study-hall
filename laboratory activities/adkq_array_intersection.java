import java.util.Scanner;

public class adkq_array_intersection {
    public static void main(String[] args) {
        System.out.println("[ARRAY INTERSECTION]\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("[code] arr1 number size in integer... "); int number_count1 = sc.nextInt();
        System.out.println("[code] arr2 number size in integer... "); int number_count2 = sc.nextInt();

        int[] arr1 = new int[number_count1];
        int[] arr2 = new int[number_count2];

        System.out.println("[debug] arr1.length >>> " + arr1.length);
        System.out.println("[debug] arr2.length >>> " + arr2.length);

        System.out.println("ARR1 PROPERTIES...");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("[code] enter a number for index " + (i + 1) + " >>> "); arr1[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("ARR2 PROPERTIES...");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("[code] enter a number for index " + (i + 1) + " >>> "); arr2[i] = sc.nextInt();
        }

//        demo arr1 = {5, 10, 15, 20};
//        demo arr2 = {20, 50, 15, 64};

        int array_intersection_count = 0;

        // THIS SERVES AS COUNTER
        for (int j : arr1) {
            for (int k : arr2) {
                if (j == k) {
                    array_intersection_count++;
                }
            }
        }

        int [] intersection = new int [array_intersection_count];
        int intersection_index = 0;

        // THIS ACTUALLY STORES THE MUTUAL NUMBERS TO THE NEW ARRAY
        for (int j : arr1) {
            for (int k : arr2) {
                if (j == k) {
                    intersection[intersection_index] = k;
                    intersection_index++;
                }
            }
        }

        System.out.println("\n[code] if the intersection array has value,\nit means it has found that arr1, and arr2 has\nmutual numbers. if not, there isnt.");
        for (int i = 0; i < intersection.length; i++) {
            System.out.println(intersection[i]);
        }
    }

}
