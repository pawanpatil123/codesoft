import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String id;
    private String name;
    private List<Integer> grades;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
}

public class StudentManagementSystem {
    private List<Student> students;
    private Scanner scanner;

    public StudentManagementSystem() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Student Information");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudentInformation();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private void addStudent() {
        scanner.nextLine(); // Consume the newline character left by previous nextInt()
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        students.add(new Student(id, name));
        System.out.println("Student added successfully.");
    }

    private void viewStudentInformation() {
        System.out.print("Enter student ID: ");
        String id = scanner.next();

        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Student ID: " + student.getId());
                System.out.println("Student Name: " + student.getName());
                System.out.println("Grades: " + student.getGrades());
                System.out.println("Average Grade: " + student.calculateAverageGrade());
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        sms.start();
    }
}
