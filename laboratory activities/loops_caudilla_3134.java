public class loops_caudilla_3134 {
    public static void main(String[] args) {
        int i = 1;

        System.out.println("while count...");
        while (i <= 20) {
            System.out.println(i);
            i++;
        }

        i = 1;
        System.out.println("do-while count...");
        do {
            System.out.println(i);
            i++;
        } while (i <= 20);

        System.out.println("for count...");
        for (i = 1; i <= 20; i++) {
            System.out.println(i);
        }
    }
}
