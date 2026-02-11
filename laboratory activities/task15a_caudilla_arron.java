// note: `continue` to skip an iteration, `break` to terminate the whole loop
public class task15a_caudilla_arron {
    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            if (i % 3 == 0) continue;
            System.out.println(i);
        }
    }
}
