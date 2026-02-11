import java.util.Scanner;

public class Task13_01_Caudilla_Arron {
    public static void main(String[] args) {

        char isRunning;
        do {
            // 1st level initialization
            Scanner sc = new Scanner(System.in);
            int count_uppercase = 0;
            int count_lowercase = 0;
            int count_digits = 0;
            int count_special = 0;
            int count_combinations = 0;


            // program input
            System.out.print("enter your password: "); String x = sc.nextLine();

            // [STRING SLICING AREA]
            // reads and counts characters of the given string
            for (int i = 0; i < x.length(); i++) {

                if (Character.isUpperCase(x.charAt(i)))
                    count_uppercase++;

                else if (Character.isLowerCase(x.charAt(i)))
                    count_lowercase++;

                else if (Character.isDigit(x.charAt(i)))
                    count_digits++;

                else
                    count_special++;
            }

            // 2nd level initialization
            String password_strength = "";

            boolean has_uppercase = count_uppercase > 0;
            boolean has_lowercase = count_lowercase > 0;
            boolean has_digits = count_digits > 0;
            boolean has_special = count_special > 0;

            if (has_uppercase) count_combinations++;
            if (has_lowercase) count_combinations++;
            if (has_digits) count_combinations++;
            if (has_special) count_combinations++;

            // [VERIFICATION AREA]
            // level one verification, weak password
            if (x.length() < 6 || !has_digits || !has_special)
                password_strength = "weak";

            // level two verification, moderate password
            if (count_lowercase >= 6 && count_lowercase <= 9 && count_combinations >= 2)
                password_strength = "moderate";

            // level three verification, strong password
            if (x.length() >= 10 && has_uppercase && has_lowercase && has_digits && has_special)
                password_strength = "strong";

            // program output
            System.out.println("-- password analysis --");
            System.out.println("uppercase letters: " + count_uppercase);
            System.out.println("lowercase letters: " + count_lowercase);
            System.out.println("digits: " + count_digits);
            System.out.println("special characters: " + count_special + "\n");
            System.out.println("password strength: " + password_strength);

            // [extra] debug
//            System.out.println("-- debug --");
//
//            System.out.println("has uppercase: " + has_uppercase);
//            System.out.println("has lowercase: " + has_lowercase);
//            System.out.println("has digits: " + has_digits);
//            System.out.println("has special: " + has_special + "\n");
//
//            System.out.println("count uppercase: " + count_uppercase);
//            System.out.println("count lowercase: " + count_lowercase);
//            System.out.println("count digits: " + count_digits);
//            System.out.println("count special: " + count_special + "\n");
//
//            System.out.println("x char count: " + x.length());
//            System.out.println("count combinations: " + count_combinations);

            System.out.println("do you want to check another password? [Y/N]"); isRunning = sc.next().toUpperCase().charAt(0);
        } while (isRunning == 'Y');
        System.out.println("thank you for using the password checker program");
    }
}
