public class arrays_caudilla_3134 {
    public static void main(String[] args) {
        int arr[] = new int[5];

        // someone mentioned array index starts at zero
        arr[0] = 29;
        arr[1] = 39;
        arr[2] = 99;
        arr[3] = 69;
        arr[4] = 19;

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }

        System.out.println(max + " is the largest number");
    }
}
