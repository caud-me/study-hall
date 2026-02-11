import java.util.Scanner;

// 1. Create a new Java program named Task07_Surname_FirstName_LogicalOperatorsActivity.java.
public class Task07_Caudilla_Arron_LogicalOperatorsActivity {
    public static void main(String[] args) {
        // 2. Import the scanner class
        Scanner sc = new Scanner(System.in);

        // 3. Ask the user to input the following information.
        String name;
        int age;
        boolean hasID;
        boolean isStudent;

        System.out.print("\nEnter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.print("Has ID: ");
        hasID = sc.nextBoolean();

        System.out.print("Is Student: ");
        isStudent = sc.nextBoolean();

        System.out.println();
        sc.close();

        System.out.println("--- Event Entry Report ---");
        System.out.println(
                "Name: " + name + "\n" +
                        "Age: " + age + "\n" +
                        "Has ID: " + hasID + "\n" +
                        "is Student: " + isStudent + "\n"
        );

        // 4. Using logical operators, I will implement conditions for the following:
        boolean canEventTheEvent = age >= 18 && hasID ? true : false;                           // relational <=, logical &&
        boolean canHaveDiscount = isStudent || age < 18 ? true : false;                         // logical ||, relational <
        boolean isAMinorWithoutID = age < 18 && !hasID ? true : false;                          // relational <, logical &&, logical !
        boolean isAPrivilegedSenior = age >= 60 && (isStudent || hasID) ? true : false;         // parentheses, logical ||, relational >=, logical &&

        // 5. Display the results with clear messages using System.out.println().
        System.out.println("Results:");
        System.out.println(
                "Can enter the event: " + canEventTheEvent + "\n" +
                        "With Discount: " + canHaveDiscount + "\n" +
                        "Minor without ID: " + isAMinorWithoutID + "\n" +
                        "Senior with privilege: " + isAPrivilegedSenior + "\n"
        );

        /// Guide Questions:
        /// 1. In an expression using &&, when is the result true? When is it false?
        ///     * An expression that uses logical AND will result in true when two statements are strictly true.
        ///     * boolean canEventTheEvent = age >= 18 && hasID ? true : false;
        ///     * here, if the age value is greater than 18 and hasID has a true value, then both statements are true, hence `true && true` which results to true.

        /// 2. In an expression using ||, when is the result true? When is it false?
        ///     * An expression that uses logical OR will result in true when at least one statement is true
        ///     * boolean isAPrivilegedSenior = age >= 60 && (isStudent || hasID) ? true : false;
        ///     * here, to be eligible as senior, at least one statement (or not limited to) should be true, if isStudent value is true and hasID value is false or vice versa, logical OR will still output it as true.

        /// 3. What effect does the ! operator have on a condition?
        ///     * A logical NOT operator negates or flips a boolean value.
        ///     * the ! in hasID simply flips whatever its boolean value. if its true, then logical NOT turns it to false. vice versa.

        /// 4. How is using the Scanner class better than hardcoding values?
        ///     * Scanner is an important utility in java as it allows for modularity and interactivity with your code.
        ///     * in the above code, we see that the code is reusable as it allows you to feed various information to it.

        /// Side Note:
        /// * for simplicity, ternary operator is not needed but is added as a requested requirement.
    }
}