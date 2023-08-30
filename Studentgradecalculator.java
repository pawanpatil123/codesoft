import java.util.Scanner;

public class Studentgradecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the grade for subject " + i + ": ");
            int grade = scanner.nextInt();
            totalMarks += grade;
        }

        double averageGrade = (double) totalMarks / numSubjects;

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average grade: " + averageGrade);

        // Grading based on average
        if (averageGrade >= 90) {
            System.out.println("Grade: A");
        } else if (averageGrade >= 80) {
            System.out.println("Grade: B");
        } else if (averageGrade >= 70) {
            System.out.println("Grade: C");
        } else if (averageGrade >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        scanner.close();
    }
}