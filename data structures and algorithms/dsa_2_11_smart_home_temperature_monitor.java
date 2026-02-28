public class dsa_2_11_smart_home_temperature_monitor {
        public static void main(String[] args) {
            // initialization
            final double[] temperatures = {21.5, 23.0, 19.8, 22.2, 24.5};
            double temp_sum = 0;

            // processing
            // iterate through array indices.
            // it's perfectly fine to use enhanced for here as well.
            for (int i = 0; i < temperatures.length; i++) {
                temp_sum = temp_sum + temperatures[i]; // accumulator
                if (temperatures[i] > 23.0) System.out.println("[!] high temperature detected: " + temperatures[i]);
                // one-liner way of saying: is the current temperature above 23? then WARNING!
            }
            final double temperatures_average = temp_sum / temperatures.length;

            // output
            System.out.println("average temperature is " + temperatures_average);
        }
}
