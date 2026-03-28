import java.util.HashMap;
import java.util.HashSet;

public class Main {

}

class EnrollmentSystemDAT {
    // how to map data if we start at non-zero to a certain number
    // for index students
    // e.g. 1,000,000 to 9,999,999
    // in array equivalent, it would be...
    // 9,999,999 - 1,000,000 + 1 = 9,000,000.
    // same for courses
    // 9,999 - 1,000 + 1 = 9000

    // our DAT would be
    static boolean[][] DAT = new boolean[9000000][9000];
    // but this is a trap!!! you're not supposed to use DAT for large scale data
    // However, for this specific assignment, the professor almost
    // certainly wants me to use the standard boolean[][] anyway

    public static void addDAT(int student_position, int course_position) {
        boolean studentFloor = student_position < 1000000;
        boolean studentCeiling = student_position > 9999999;
        boolean courseFloor = course_position < 1000;
        boolean courseCeiling = course_position > 9000;

        if (studentFloor || studentCeiling) return;
        if (courseFloor || courseCeiling) return;

        int student_IDX = student_position - 1000000;
        int course_IDX = course_position - 1000;

        DAT[student_IDX][course_IDX] = true;
    }

    public static void removeDAT(int student_position, int course_position) {
        boolean studentFloor = student_position < 1000000;
        boolean studentCeiling = student_position > 9999999;
        boolean courseFloor = course_position < 1000;
        boolean courseCeiling = course_position > 9000;

        if (studentFloor || studentCeiling) return;
        if (courseFloor || courseCeiling) return;

        int student_IDX = student_position - 1000000;
        int course_IDX = course_position - 1000;

        DAT[student_IDX][course_IDX] = false;
    }

    public static void getCoursesForStudent(int student_position) {
        int student_IDX = student_position - 1000000;
        int course_LEN = DAT[student_IDX].length;

        for (int i = 0; i < course_LEN; i++) {
            System.out.println(i + " >>> " + DAT[student_IDX][i]);
        }

        // for filtering: if (DAT[student_IDX][i] == true) { ... }
        // reversing offset: (i + 1000)
    }

    // of course! you wont be able to run this because youll get a
    // todo: java heap memory error!
    // that's what supposed to happen in the activity
    // that's where hashing comes in

    public static void getStudentsInCourse(int course_position) {
        int course_IDX = course_position - 1000;

        // We need to check every single row (student)
        for (int i = 0; i < DAT.length; i++) {
            if (DAT[i][course_IDX]) {
                // If true, this student index 'i' is enrolled!
                System.out.println("Student ID: " + (i + 1000000));
            }
        }
    }
}

class EnrollmentSystemStudentHashTable {
    static HashMap<Long, HashSet<Integer>> studentRoster = new HashMap<>();

    static void addEnrollment(long student_id, int course_id) {
        if (!studentRoster.containsKey(student_id)) {
            // if a student is a freshman
            HashSet<Integer> courses = new HashSet<>(); //creation of course set
            courses.add(course_id);
            studentRoster.put(student_id, courses);
            System.out.println("registered");
        } else {
            // int existingCourses = courses;
            HashSet<Integer> existingCourses = studentRoster.get(student_id);
            // if a student is a returning student
            // university.get(student_id);
            existingCourses.add(course_id);
            System.out.println("updated");
        }
    }

    static HashSet<Integer> getCoursesForStudent(long student_id) {
        return studentRoster.get(student_id);
    }

    static boolean isEnrolled(long student_id, int course_id) {
        if (studentRoster.containsKey(student_id)) {
            return studentRoster.get(student_id).contains(course_id);
        }
        return false;
    }

    static void removeEnrollment(long student_id, int course_id) {
        if (studentRoster.containsKey(student_id)) {
            HashSet<Integer> existingCourses = studentRoster.get(student_id);
            existingCourses.remove(course_id);
        }
    }
}

class EnrollmentSystemCourseHashTable {
    static HashMap<Integer, HashSet<Long>> courseRoster = new HashMap<>();

    static void course_insertStudent(long student_id, int course_id) {
        if (!courseRoster.containsKey(course_id)) {

            HashSet<Long> students = new HashSet<>(); // creation of student set
            students.add(student_id);
            courseRoster.put(course_id, students);
            System.out.println("inserted");
        } else {

            HashSet<Long> existingStudents = courseRoster.get(course_id);
            existingStudents.add(student_id);
            System.out.println("updated");
        }
    }

    static boolean isEnrolled(long student_id, int course_id) {
        if (courseRoster.containsKey(course_id)) {
            return courseRoster.get(course_id).contains(student_id);
        }
        return false;
    }

    static void removeEnrollment(long student_id, int course_id) {
        if (courseRoster.containsKey(course_id)) {
            HashSet<Long> existingStudents = courseRoster.get(course_id);
            existingStudents.remove(student_id);
        }
    }
}