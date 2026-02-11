import java.util.Scanner;

public class Task17_Caudilla_Arron {

    public void calculateAverage() {

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char yesno;
        do {
            System.out.println("Student Information Analytics System");

            System.out.print("Enter number of students: ");
            int numberOfStudents = sc.nextInt();

            // data for students to be processed
            String[] studentName = new String[numberOfStudents];
            double[] studentPrelimGrade = new double[numberOfStudents];
            double[] studentMidtermGrade = new double[numberOfStudents];
            double[] studentFinalGrade = new double[numberOfStudents];
            char[] studentLetter = new char[numberOfStudents];
            double[] studentAverage = new double[numberOfStudents];

            // input validation area, gets student grades and
            for (int i = 0; i < numberOfStudents; i++) {
                sc.nextLine();
                System.out.println("\nStudent #" + (i + 1));

                System.out.print("Enter name: ");
                studentName[i] = sc.nextLine();

                do {
                    System.out.print("Enter Prelim Grade (0-100): ");
                    studentPrelimGrade[i] = sc.nextInt();

                    if (studentPrelimGrade[i] > 100 || studentPrelimGrade[i] < 0) System.out.println("Not accepting numbers above 100, below 0");
                } while (studentPrelimGrade[i] > 100 || studentPrelimGrade[i] < 0);

                do {
                    System.out.print("Enter Midterm Grade (0-100): ");
                    studentMidtermGrade[i] = sc.nextInt();

                    if (studentMidtermGrade[i] > 100 || studentMidtermGrade[i] < 0) System.out.println("Not accepting numbers above 100");
                } while (studentMidtermGrade[i] > 100 || studentMidtermGrade[i] < 0);

                do {
                    System.out.print("Enter Final Grade (0-100): ");
                    studentFinalGrade[i] = sc.nextInt();

                    if (studentFinalGrade[i] > 100 || studentFinalGrade[i] < 0) System.out.println("Not accepting numbers above 100");
                } while (studentFinalGrade[i] > 100 || studentFinalGrade[i] < 0);

            }
            // no time left to turn this to a method....

            calculateAssign(numberOfStudents, studentPrelimGrade,studentMidtermGrade, studentFinalGrade, studentAverage, studentLetter);
            printSummaryAnalysis(numberOfStudents, studentName, studentPrelimGrade, studentMidtermGrade, studentFinalGrade, studentAverage, studentLetter);

            System.out.println("Do you want to continue using the system [Y/N]?");
            yesno = sc.next().toUpperCase().charAt(0);
        } while (yesno != 'N');

        sc.close();
    }

    // this method void get student averages and assigns letter grades
    public static void calculateAssign(int numberOfStudents, double[] studentPrelimGrade, double[] studentMidtermGrade, double[] studentFinalGrade, double[] studentAverage, char[] studentLetter) {
        for (int i = 0; i < numberOfStudents; i++) {
            // student avg
            studentAverage[i] = (studentPrelimGrade[i] + studentMidtermGrade[i] + studentFinalGrade[i]) / 3;

            // letter converter
            if (studentAverage[i] >= 96) studentLetter[i] = 'A';
            else if (studentAverage[i] >= 90) studentLetter[i] = 'B';
            else if (studentAverage[i] >= 80) studentLetter[i] = 'C';
            else if (studentAverage[i] >= 70) studentLetter[i] = 'D';
            else studentLetter[i] = 'F';
        }
    }

    // this method void prints all summary and analysis data
    public static void printSummaryAnalysis(int numberOfStudents, String[] studentName, double[] studentPrelimGrade, double[] studentMidtermGrade, double[] studentFinalGrade, double[] studentAverage, char[] studentLetter) {

        // summary table
        System.out.println("=====================================================================");
        System.out.println("STUDENT SUMMARY");
        System.out.println("=====================================================================");
        System.out.println("Name\t\t\t\tPrelim\t\t\tMidterm\t\t\tFinal\t\t\tAverage\t\t\tLetter");
        System.out.println("---------------------------------------------------------------------");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%s\t\t\t\t\t%.2f\t\t\t%.2f\t\t\t%.2f\t\t\t%.2f\t\t\t%s\n", studentName[i], studentPrelimGrade[i], studentMidtermGrade[i], studentFinalGrade[i], studentAverage[i], studentLetter[i]);
        }

        // analysis
        System.out.println("=====================================================================");
        System.out.println("ANALYSIS RESULTS");
        System.out.println("=====================================================================");

        // Find min/max and calculate summation
        double highAvg = studentAverage[0];
        String hOfWho = studentName[0];
        double lowAvg = studentAverage[0];
        String lOfWho = studentName[0];
        double summation = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            summation += studentAverage[i];

            if (studentAverage[i] < lowAvg) { // get them lowest
                lowAvg = studentAverage[i];
                lOfWho = studentName[i];
            }

            if (studentAverage[i] > highAvg) { // get them highest
                highAvg = studentAverage[i];
                hOfWho = studentName[i];
            }
        }

        // ranking and overall average
        System.out.println("Highest Average: " + hOfWho + " - " + String.format("%.2f", highAvg));
        System.out.println("Lowest Average: " + lOfWho + " - " + String.format("%.2f", lowAvg));
        System.out.println("Class Average: " + String.format("%.2f", (summation / numberOfStudents)));

        // distribution
        System.out.println("\nGrade Distribution");

        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            if (studentLetter[i] == 'A') countA++;
            if (studentLetter[i] == 'B') countB++;
            if (studentLetter[i] == 'C') countC++;
            if (studentLetter[i] == 'D') countD++;
            if (studentLetter[i] == 'F') countF++;
        }

        System.out.printf("A: %d student(s)\n", countA);
        System.out.printf("B: %d student(s)\n", countB);
        System.out.printf("C: %d student(s)\n", countC);
        System.out.printf("D: %d student(s)\n", countD);
        System.out.printf("F: %d student(s)\n", countF);
    }
}
