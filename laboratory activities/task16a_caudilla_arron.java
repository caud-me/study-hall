public class task16a_caudilla_arron {
    public static void main(String[] args) {

        int[] numbers = {1, 5, 2, 5, 3, 5, 4};

        int target = 5;
        int count = 0;

        for (int num : numbers) {
            if (num == target) count++;
        }

        System.out.println("the number " + target + " appeared " + count + " times.");
    }
}