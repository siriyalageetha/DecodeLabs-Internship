import java.util.Scanner;

public class StudentGradeCalculator {

    // Method to calculate grade
    public static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("     STUDENT GRADE CALCULATOR");
        System.out.println("=================================");

        System.out.print("Enter Number of Subjects: ");
        int numberOfSubjects = scanner.nextInt();

        int totalMarks = 0;

        // Input marks
        for (int i = 1; i <= numberOfSubjects; i++) {

            System.out.print("Enter Marks for Subject " + i + " (0-100): ");
            int marks = scanner.nextInt();

            while (marks < 0 || marks > 100) {
                System.out.print("Invalid Input! Enter marks between 0 and 100: ");
                marks = scanner.nextInt();
            }

            totalMarks += marks;
        }

        // Calculations
        double average = (double) totalMarks / numberOfSubjects;
        double percentage = (double) totalMarks / (numberOfSubjects * 100) * 100;

        String grade = calculateGrade(percentage);

        // Display Results
        System.out.println("\n=================================");
        System.out.println("           RESULT");
        System.out.println("=================================");
        System.out.println("Total Marks      : " + totalMarks);
        System.out.printf("Average Marks    : %.2f%n", average);
        System.out.printf("Percentage       : %.2f%%%n", percentage);
        System.out.println("Grade            : " + grade);
        System.out.println("=================================");

        scanner.close();
    }
}
