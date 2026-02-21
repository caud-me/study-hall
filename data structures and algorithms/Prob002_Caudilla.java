import java.util.Arrays;
import java.util.Scanner;

public class Prob002_Caudilla {
    public static void main(String[] args) {
        // TODO: Hardcode now, dynamic later
        Scanner sc = new Scanner(System.in);

        // declaration and initialization
        final int PLAYER_COUNT = 10;
        final int[] PLAYER_SCORES = new int[PLAYER_COUNT];

        // focuses solely on storing data to the array, AND adding all values in the array.
        for (int i = 0; i < PLAYER_SCORES.length; i++) {
            System.out.print("player " + (i + 1) + " score >>> ");
            PLAYER_SCORES[i] = sc.nextInt();
        }

        // default array sorter (don't know how this works yet)
        Arrays.sort(PLAYER_SCORES);

        // by default, array sort starts from lowest to highest
        // i flipped the order by reversing the index counter
        System.out.println("\n[Project KANZEN完全: LEADERBOARD]");
        for (int i = PLAYER_COUNT - 1; i >= 0; i--) {
            System.out.println((PLAYER_COUNT - i) + "\t" + PLAYER_SCORES[i]);
        }
    }
}
