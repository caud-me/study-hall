import java.util.Scanner;

public class EnrollmentSystemDAT_ {
    /*
        fixme: this code is supposed to not work, using DAT to such huge data
         will just throw you a heap space error.
         that array will require approximately 81 GB of RAM lol...
    */

    /*
        fixme: if you really want to run this... lower the STUDENT_UPPER_BOUND and COURSE_LOWER_BOUND
         to something like...  1024
     */

    // as per module >>> range 1000000 to 9999999
    static int STUDENT_UPPER_BOUND = 9999999;
    static int STUDENT_LOWER_BOUND = 1000000;

    // as per module >>> range 1000 to 9999
    static int COURSE_UPPER_BOUND = 9999;
    static int COURSE_LOWER_BOUND = 1000;

    // OFFSET LOGIC
    static int STUDENT_SIZE = (STUDENT_UPPER_BOUND - STUDENT_LOWER_BOUND) + 1;
    static int COURSE_SIZE = (COURSE_UPPER_BOUND - COURSE_LOWER_BOUND) + 1;

    // pseudo-database (direct address table) ⚠️ highly in-efficient
    static boolean[][] DATABASE = new boolean[STUDENT_SIZE][COURSE_SIZE];

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\n--- whyeron terminal ---");
            System.out.println("1. addEnrollment()");
            System.out.println("2. removeEnrollment()");
            System.out.println("3. isEnrolled()");
            System.out.println("4. getCoursesForStudent()");
            System.out.println("5. getStudentsInCourse()");
            System.out.println("0. system.exit()");
            System.out.print("enter your choice >>> ");

            int choice = inputScanner.nextInt();
            inputScanner.nextLine();

            int param1 = 0;
            int param2 = 0;

            switch (choice) {
                case 1:
                    System.out.print("enter student id ranging from " + STUDENT_LOWER_BOUND + " to " + STUDENT_UPPER_BOUND + " >>> ");
                    param1 = inputScanner.nextInt();

                    System.out.print("enter course id ranging from " + COURSE_LOWER_BOUND + " to " + COURSE_UPPER_BOUND + " >>> ");
                    param2 = inputScanner.nextInt();

                    inputScanner.nextLine();

                    addEnrollment(param1, param2);
                    break;

                case 2:
                    System.out.print("enter student id ranging from " + STUDENT_LOWER_BOUND + " to " + STUDENT_UPPER_BOUND + " >>> ");
                    param1 = inputScanner.nextInt();

                    System.out.print("enter course id ranging from " + COURSE_LOWER_BOUND + " to " + COURSE_UPPER_BOUND + " >>> ");
                    param2 = inputScanner.nextInt();

                    inputScanner.nextLine();

                    removeEnrollment(param1, param2);
                    break;

                case 3:
                    System.out.print("enter student id ranging from " + STUDENT_LOWER_BOUND + " to " + STUDENT_UPPER_BOUND + " >>> ");
                    param1 = inputScanner.nextInt();

                    System.out.print("enter course id ranging from " + COURSE_LOWER_BOUND + " to " + COURSE_UPPER_BOUND + " >>> ");
                    param2 = inputScanner.nextInt();

                    inputScanner.nextLine();

                    isEnrolled(param1, param2);
                    break;

                case 4:
                    System.out.print("enter student id ranging from " + STUDENT_LOWER_BOUND + " to " + STUDENT_UPPER_BOUND + " >>> ");
                    param1 = inputScanner.nextInt();

                    inputScanner.nextLine();

                    getCoursesForStudent(param1);
                    break;

                case 5:
                    System.out.print("enter course id ranging from " + COURSE_LOWER_BOUND + " to " + COURSE_UPPER_BOUND + " >>> ");
                    param1 = inputScanner.nextInt();

                    inputScanner.nextLine();

                    getStudentsInCourse(param1);
                    break;

                case 0:
                    System.out.println("terminating live processes...");
                    System.out.println("farewell, stranger.");
                    keepRunning = false;
                    break;

                default:
                    System.out.println("[!] invalid choice, please try again.");
            }
        }
    }

    public static void addEnrollment(int studentId, int courseId) {
        System.out.println("\naddEnrollment()");

        // offset logic
        int STUDENT_IDX = studentId - STUDENT_LOWER_BOUND;
        int COURSE_IDX = courseId - COURSE_LOWER_BOUND;

        // evaluator
        boolean STUDENT_IN_RANGE = (STUDENT_IDX >= 0) && (STUDENT_IDX < STUDENT_SIZE);
        boolean COURSE_IN_RANGE = (COURSE_IDX >= 0) && (COURSE_IDX < COURSE_SIZE);

        // processor
        if (STUDENT_IN_RANGE && COURSE_IN_RANGE) {
            DATABASE[STUDENT_IDX][COURSE_IDX] = true;

            System.out.println("[/] successfully altered data for student: " + studentId + ", course: " + courseId + " >>> " + DATABASE[STUDENT_IDX][COURSE_IDX]);
            System.out.println("[DEV] idx mode: DATABASE[" + STUDENT_IDX + "][" + COURSE_IDX + "] >>> " + DATABASE[STUDENT_IDX][COURSE_IDX] );

        } else {
            System.out.println("[X] method terminated, rules not followed.");

        }
    }

    public static void removeEnrollment(int studentId, int courseId) {
        System.out.println("\nremoveEnrollment()");

        // offset logic
        int STUDENT_IDX = studentId - STUDENT_LOWER_BOUND;
        int COURSE_IDX = courseId - COURSE_LOWER_BOUND;

        // evaluator
        boolean STUDENT_IN_RANGE = (STUDENT_IDX >= 0) && (STUDENT_IDX < STUDENT_SIZE);
        boolean COURSE_IN_RANGE = (COURSE_IDX >= 0) && (COURSE_IDX < COURSE_SIZE);

        // processor
        if (STUDENT_IN_RANGE && COURSE_IN_RANGE) {
            DATABASE[STUDENT_IDX][COURSE_IDX] = false;

            System.out.println("[/] successfully altered data for student: " + studentId + ", course: " + courseId + " >>> " + DATABASE[STUDENT_IDX][COURSE_IDX]);
            System.out.println("[DEV] idx mode: DATABASE[" + STUDENT_IDX + "][" + COURSE_IDX + "] >>> " + DATABASE[STUDENT_IDX][COURSE_IDX] );

        } else {
            System.out.println("[X] method terminated, rules not followed.");

        }
    }

    public static void isEnrolled(int studentId, int courseId) {
        System.out.println("\nisEnrolled()");

        int STUDENT_IDX = studentId - STUDENT_LOWER_BOUND;
        int COURSE_IDX = courseId - COURSE_LOWER_BOUND;

        // evaluator
        boolean STUDENT_IN_RANGE = (STUDENT_IDX >= 0) && (STUDENT_IDX < STUDENT_SIZE);
        boolean COURSE_IN_RANGE = (COURSE_IDX >= 0) && (COURSE_IDX < COURSE_SIZE);

        // processor
        if (STUDENT_IN_RANGE && COURSE_IN_RANGE) {
            // ternary operator.
            System.out.println(DATABASE[STUDENT_IDX][COURSE_IDX] ? "student is enrolled." : "student is not enrolled.");
            System.out.println("[DEV] idx mode: DATABASE[" + STUDENT_IDX + "][" + COURSE_IDX + "] >>> " + DATABASE[STUDENT_IDX][COURSE_IDX] );

        } else {
            System.out.println("[X] method terminated, rules not followed.");

        }

    }

    public static void getCoursesForStudent(int studentId) {
        System.out.println("\ngetCoursesForStudent()");

        int STUDENT_IDX = studentId - STUDENT_LOWER_BOUND;

        // evaluator
        boolean STUDENT_IN_RANGE = (STUDENT_IDX >= 0) && (STUDENT_IDX < STUDENT_SIZE);

        // processor
        if (STUDENT_IN_RANGE) {
            System.out.println("courses for Student " + studentId + "...");
            for (int i = 0; i < COURSE_SIZE; i++) {
                if (DATABASE[STUDENT_IDX][i]) System.out.println("\tCS" + (i + COURSE_LOWER_BOUND));
            }

        } else {
            System.out.println("[X] method terminated, rules not followed.");

        }
    }

    public static void getStudentsInCourse(int courseId) {
        System.out.println("\ngetStudentsInCourse()");

        int COURSE_IDX = courseId - COURSE_LOWER_BOUND;

        // evaluator
        boolean COURSE_IN_RANGE = (COURSE_IDX >= 0) && (COURSE_IDX < COURSE_SIZE);

        // processor
        if (COURSE_IN_RANGE) {
            System.out.println("students in course CS" + courseId + "...");
            for (int i = 0; i < STUDENT_SIZE; i++) {
                if (DATABASE[i][COURSE_IDX]) System.out.println("\tStudent ID: " + (i + STUDENT_LOWER_BOUND));
            }

        } else {
            System.out.println("[X] method terminated, rules not followed.");

        }
    }
}
