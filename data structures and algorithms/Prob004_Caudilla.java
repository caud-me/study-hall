import java.util.Scanner;

public class Prob004_Caudilla {
    public static void main(String[] args) {
        // TODO: Hardcode now, dynamic later
        Scanner sc = new Scanner(System.in);

        // declaration and initialization
        final int SENSOR_COUNT = 5;
        final double[] TEMPERATURES = new double[5];
              double summation = 0;

        System.out.println("[pseudo] assume you are a sensor giving values to the program...");

        // focuses solely on storing data to the array.
        for (int i = 0; i < SENSOR_COUNT; i++) {
            System.out.print("room " + (i + 1) + " of " + SENSOR_COUNT + " >>> ");
            TEMPERATURES[i] = sc.nextDouble();
        }

        // focuses on checking each data if they exceed 28.0 degrees, AND adding all values in the array.
        for (int i = 0; i < SENSOR_COUNT; i++) {
            if (TEMPERATURES[i] > 28.0) System.out.println("[!] warning >>> high temperature detected at room " + (i + 1));
            summation += TEMPERATURES[i];
        }

        // we used the accumulator variable to divide it with the size of the array to get its average temperature.
        final double TEMPERATURE_AVERAGE = summation / SENSOR_COUNT;

        System.out.println("[agent] average room temperature is >>> " + TEMPERATURE_AVERAGE);
    }
}
