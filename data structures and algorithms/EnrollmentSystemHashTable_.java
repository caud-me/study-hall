import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;

public class EnrollmentSystemHashTable_ {
    /*
        Note: Using HashMap and HashSet to avoid that 81 GB RAM requirement!
        of the Direct Address Table (DAT) version.
    */

    /*
        fixme: personal take i do not like using hashmaps
     */

    // as per module >>> range 1000000 to 9999999
    static int STUDENT_UPPER_BOUND = 9999999;
    static int STUDENT_LOWER_BOUND = 1000000;

    // as per module >>> range 1000 to 9999
    static int COURSE_UPPER_BOUND = 9999;
    static int COURSE_LOWER_BOUND = 1000;

    // pseudo-database (hash map)
    static HashMap<Integer, HashSet<Integer>> DATABASE = new HashMap<>();

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\n--- whyeron terminal (hash mode) ---");
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
                    System.out.print("enter student id [1,000,000 - 9,999,999] >>> ");
                    param1 = inputScanner.nextInt();
                    System.out.print("enter course id [1,000 - 9,999] >>> ");
                    param2 = inputScanner.nextInt();
                    inputScanner.nextLine();
                    addEnrollment(param1, param2);
                    break;

                case 2:
                    System.out.print("enter student id [1,000,000 - 9,999,999] >>> ");
                    param1 = inputScanner.nextInt();
                    System.out.print("enter course id [1,000 - 9,999] >>> ");
                    param2 = inputScanner.nextInt();
                    inputScanner.nextLine();
                    removeEnrollment(param1, param2);
                    break;

                case 3:
                    System.out.print("enter student id [1,000,000 - 9,999,999] >>> ");
                    param1 = inputScanner.nextInt();
                    System.out.print("enter course id [1,000 - 9,999] >>> ");
                    param2 = inputScanner.nextInt();
                    inputScanner.nextLine();
                    isEnrolled(param1, param2);
                    break;

                case 4:
                    System.out.print("enter student id [1,000,000 - 9,999,999] >>> ");
                    param1 = inputScanner.nextInt();
                    inputScanner.nextLine();
                    getCoursesForStudent(param1);
                    break;

                case 5:
                    System.out.print("enter course id [1,000 - 9,999] >>> ");
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

        // evaluator
        boolean STUDENT_IN_RANGE = (studentId >= STUDENT_LOWER_BOUND) && (studentId <= STUDENT_UPPER_BOUND);
        boolean COURSE_IN_RANGE = (courseId >= COURSE_LOWER_BOUND) && (courseId <= COURSE_UPPER_BOUND);

        // processor
        if (STUDENT_IN_RANGE && COURSE_IN_RANGE) {
            // Check if student exists, if not, create their "bucket"
            if (!DATABASE.containsKey(studentId)) {
                DATABASE.put(studentId, new HashSet<Integer>());
            }

            // Add the course to the student's set
            DATABASE.get(studentId).add(courseId);

            System.out.println("[/] successfully altered data for student: " + studentId + ", course: " + courseId);
        } else {
            System.out.println("[X] method terminated, rules not followed.");
        }
    }

    public static void removeEnrollment(int studentId, int courseId) {
        System.out.println("\nremoveEnrollment()");

        if (DATABASE.containsKey(studentId)) {
            DATABASE.get(studentId).remove(courseId);
            System.out.println("[/] successfully removed course: " + courseId + " from student: " + studentId);
        } else {
            System.out.println("[X] student record not found.");
        }
    }

    public static void isEnrolled(int studentId, int courseId) {
        System.out.println("\nisEnrolled()");

        boolean enrolled = false;
        if (DATABASE.containsKey(studentId)) {
            if (DATABASE.get(studentId).contains(courseId)) {
                enrolled = true;
            }
        }

        System.out.println(enrolled ? "student is enrolled." : "student is not enrolled.");
    }

    public static void getCoursesForStudent(int studentId) {
        System.out.println("\ngetCoursesForStudent()");

        if (DATABASE.containsKey(studentId)) {
            System.out.println("courses for Student " + studentId + "...");
            for (int course : DATABASE.get(studentId)) {
                System.out.println("CS" + course);
            }
        } else {
            System.out.println("[!] no enrollments found for this student.");
        }
    }

    public static void getStudentsInCourse(int courseId) {
        System.out.println("\ngetStudentsInCourse()");
        System.out.println("students in course CS" + courseId + "...");

        for (int studentId : DATABASE.keySet()) {
            if (DATABASE.get(studentId).contains(courseId)) {
                System.out.println(studentId);
            }
        }
    }
}