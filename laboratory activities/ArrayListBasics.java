import java.util.ArrayList;
import java.util.Scanner;

/*
    TODO: my naming conventions!
    _variable ....................................................... core program component
    variable ........................................................ actual variables
    TEMP_VARIABLE ................................................... cache/dump variables to organize the code
 */

public class ArrayListBasics {
    // static so that I can access these global variables outside main
    static int _control;

    // input and pseudo-database
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> students = new ArrayList<>();

    // I love temporary variables it makes the codebase clean
    static String TEMP_TARGET;
    static int TEMP_INDEX;

    public static void main(String[] args) {
        printArt();
        do {
            System.out.println();
            System.out.println("STUDENT RECORD MANAGER");
            System.out.println("1. add student");
            System.out.println("2. view students");
            System.out.println("3. search student");
            System.out.println("4. update student");
            System.out.println("5. remove student");
            System.out.println("6. exit");

            System.out.print("enter choice >>> ");
            _control = input.nextInt();
                       input.nextLine();

            switch (_control) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> searchStudent();
                case 4 -> updateStudent();
                case 5 -> removeStudent();
                case 6 -> endState();
                default -> System.out.println("[!] invalid input!");
            }
        } while (_control > 0); // once core controller is 0, loop stops and program ends.
    }

    // addStudent();
    static void addStudent() {
        System.out.print("enter student name >>> ");
            TEMP_TARGET = input.nextLine();

        students.add(TEMP_TARGET);
        System.out.println("student added!");
    }

    // viewStudents();
    static void viewStudents() {
        System.out.println("students list... ");
        for (String student : students) {
            System.out.println(student);
        }
    }

    // searchStudent();
    static void searchStudent() {
        System.out.print("enter name to search >>> ");
            TEMP_TARGET = input.nextLine();

        if (students.contains(TEMP_TARGET))
            System.out.println("student found!");
        else
            System.out.println("student not found!");
    }

    // updateStudent();
    static void updateStudent() {
        System.out.print("enter index to update >>> ");
            TEMP_INDEX = input.nextInt();
                         input.nextLine();

        System.out.println("enter new name >>> ");
            TEMP_TARGET = input.nextLine();;

        students.set(TEMP_INDEX, TEMP_TARGET);
            System.out.println("student updated!");
    }

    // removeStudent();
    static void removeStudent() {
        System.out.println("enter index to remove >>> ");
            TEMP_INDEX = input.nextInt();

        students.remove(TEMP_INDEX);
            System.out.println("student removed!");
    }

    // endState();
    static void endState() {
        System.out.println("closing scanner object...");
        input.close();
        System.out.println("adjusting program controls...");
        _control = 0;
        System.out.println("program ends...");
    }

    static void printArt() {
        System.out.println(
            "          _                                \n" +
            "__      _| |__  _   _  ___ _ __ ___  _ __  \n" +
            "\\ \\ /\\ / / '_ \\| | | |/ _ \\ '__/ _ \\| '_ \\ \n" +
            " \\ V  V /| | | | |_| |  __/ | | (_) | | | |\n" +
            "  \\_/\\_/ |_| |_|\\__, |\\___|_|  \\___/|_| |_|\n" +
            "                |___/                      "
        );
    }
}
