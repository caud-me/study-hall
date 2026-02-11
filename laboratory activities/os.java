import java.util.Scanner;

public class os {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        char _power;

        do {
            System.out.println("[code] to end the system, enter [q].");
            _power = sc.next().trim().toUpperCase().charAt(0);

            os_boot osBoot = new os_boot();
            osBoot.bootSequence();
        } while (_power != 'q');
    }
}
