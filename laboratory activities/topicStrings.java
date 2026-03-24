import java.util.Scanner;

public class topicStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("for caseShift(), you must type one parameter: input String");
        System.out.println("caseShift() returns >>> " + caseShift(input.nextLine()));

        System.out.println("for frequency(), you must type two parameters: input String, and a target char.");
        System.out.println("frequency() returns >>> " + frequency(input.nextLine(), input.next().charAt(0)));
    }


    public static int frequency(String userInput, char userTarget) {
        // set up counter
        int count = 0;

        // iterate through String characters
        for (int i = 0; i < userInput.length(); i++) {
            // is the character being checked same as the target?
            if (userInput.charAt(i) == userTarget) {
                // if yes, increment the counter
                count++;
            }
        }
        return count;
    }

    public static String caseShift(String userInput) {
        // goal: transforms lowercase to uppercase, and uppercase to lowercase, other characters remain unchanged.
        char currentCharacter = 0;
        // we're going to put the transformed letter to a new kind of string.
        // StringBuilder builder = new StringBuilder();
        String builder_c = ""; // or we can go classic.

        for (int i = 0; i < userInput.length(); i++) {
            // current letter being checked.
            currentCharacter = userInput.charAt(i);

            // logic check: is the character being checked an uppercase?
            if (Character.isUpperCase(currentCharacter)) {
                // if yes, then transform the same character, then shove it to the builder.
                // builder.append(Character.toLowerCase(currentCharacter)); // StringBuilder (better)
                builder_c += Character.toLowerCase(currentCharacter); // old style string concatenation (inefficient)

            // logic check: is the character being checked a lowercase?
            } else if (Character.isLowerCase(currentCharacter)) {
                // if yes, then transform the same character, then shove it to the builder.
                // builder.append(Character.toUpperCase(currentCharacter)); // StringBuilder (better)
                builder_c += Character.toUpperCase(currentCharacter); // old style string concatenation (inefficient)

            // this simply ignores the special characters
            } else {
                // builder.append(currentCharacter);
                builder_c += currentCharacter;

            }
        }

        return builder_c;
        // return builder.toString();
    }
}
