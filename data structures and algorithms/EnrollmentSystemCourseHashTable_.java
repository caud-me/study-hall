import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;

public class EnrollmentSystemCourseHashTable_ {
    /*
        its just the other way around lol
    */

    /*
        fixme: personal take i REALLY do not like using hashmaps
     */

    // as per module >>> range 1000000 to 9999999
    static int STUDENT_UPPER_BOUND = 9999999;
    static int STUDENT_LOWER_BOUND = 1000000;

    // as per module >>> range 1000 to 9999
    static int COURSE_UPPER_BOUND = 9999;
    static int COURSE_LOWER_BOUND = 1000;

    // pseudo-database (organized by courseId)
    static HashMap<Integer, HashSet<Long>> DATABASE = new HashMap<>();

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\n--- whyeron terminal (course-centric) ---");
            System.out.println("1. addEnrollment()");
            System.out.println("2. removeEnrollment()");
            System.out.println("3. isEnrolled()");
            System.out.println("4. getStudentsInCourse()");
            System.out.println("5. getCoursesForStudent()");
            System.out.println("0. system.exit()");
            System.out.print("enter your choice >>> ");

            int choice = inputScanner.nextInt();
            inputScanner.nextLine();

            long paramStudent = 0;
            int paramCourse = 0;

            switch (choice) {
                case 1:
                    System.out.print("enter student id [1,000,000 - 9,999,999] >>> ");
                    paramStudent = inputScanner.nextLong();
                    System.out.print("enter course id [1,000 - 9,999] >>> ");
                    paramCourse = inputScanner.nextInt();
                    inputScanner.nextLine();
                    addEnrollment(paramStudent, paramCourse);
                    break;

                case 2:
                    System.out.print("enter student id [1,000,000 - 9,999,999] >>> ");
                    paramStudent = inputScanner.nextLong();
                    System.out.print("enter course id [1,000 - 9,999] >>> ");
                    paramCourse = inputScanner.nextInt();
                    inputScanner.nextLine();
                    removeEnrollment(paramStudent, paramCourse);
                    break;

                case 3:
                    System.out.print("enter student id [1,000,000 - 9,999,999] >>> ");
                    paramStudent = inputScanner.nextLong();
                    System.out.print("enter course id [1,000 - 9,999] >>> ");
                    paramCourse = inputScanner.nextInt();
                    inputScanner.nextLine();
                    isEnrolled(paramStudent, paramCourse);
                    break;

                case 4:
                    System.out.print("enter course id [1,000 - 9,999] >>> ");
                    paramCourse = inputScanner.nextInt();
                    inputScanner.nextLine();
                    getStudentsInCourse(paramCourse);
                    break;

                case 5:
                    System.out.print("enter student id [1,000,000 - 9,999,999] >>> ");
                    paramStudent = inputScanner.nextLong();
                    inputScanner.nextLine();
                    getCoursesForStudent(paramStudent);
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

    public static void addEnrollment(long studentId, int courseId) {
        System.out.println("\naddEnrollment()");

        // evaluator
        boolean STUDENT_IN_RANGE = (studentId >= STUDENT_LOWER_BOUND) && (studentId <= STUDENT_UPPER_BOUND);
        boolean COURSE_IN_RANGE = (courseId >= COURSE_LOWER_BOUND) && (courseId <= COURSE_UPPER_BOUND);

        // processor
        if (STUDENT_IN_RANGE && COURSE_IN_RANGE) {
            // If the course doesn't have a list yet, create it
            if (!DATABASE.containsKey(courseId)) {
                DATABASE.put(courseId, new HashSet<Long>());
            }

            DATABASE.get(courseId).add(studentId);
            System.out.println("[/] successfully enrolled student: " + studentId + " in course: " + courseId);
        } else {
            System.out.println("[X] method terminated, rules not followed.");
        }
    }

    public static void removeEnrollment(long studentId, int courseId) {
        System.out.println("\nremoveEnrollment()");

        if (DATABASE.containsKey(courseId)) {
            DATABASE.get(courseId).remove(studentId);
            System.out.println("[/] successfully removed student: " + studentId + " from course: " + courseId);
        } else {
            System.out.println("[X] course record not found.");
        }
    }

    public static void isEnrolled(long studentId, int courseId) {
        System.out.println("\nisEnrolled()");

        boolean enrolled = false;
        if (DATABASE.containsKey(courseId)) {
            if (DATABASE.get(courseId).contains(studentId)) {
                enrolled = true;
            }
        }
        System.out.println(enrolled ? "student is enrolled." : "student is not enrolled.");
    }

    public static void getStudentsInCourse(int courseId) {
        System.out.println("\ngetStudentsInCourse()");

        if (DATABASE.containsKey(courseId)) {
            System.out.println("students in course CS" + courseId + "...");
            for (long studentId : DATABASE.get(courseId)) {
                System.out.println("- " + studentId);
            }
        } else {
            System.out.println("[!] no students found for this course.");
        }
    }

    public static void getCoursesForStudent(long studentId) {
        System.out.println("\ngetCoursesForStudent()");
        System.out.println("courses for Student " + studentId + "...");

        for (int courseId : DATABASE.keySet()) {
            if (DATABASE.get(courseId).contains(studentId)) {
                System.out.println("- CS" + courseId);
            }
        }
    }
}