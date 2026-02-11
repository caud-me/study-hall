import java.util.concurrent.TimeUnit;

public class os_boot {
    public void bootSequence() throws InterruptedException {
        System.out.println("boot");

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
