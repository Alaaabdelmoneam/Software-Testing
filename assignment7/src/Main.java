import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GradeManager gradeManager = new GradeManager();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numStudents; i++) {
            // Create a student & get its name & grades from user input
            System.out.print("Enter name for student " + i + ": ");
            String name = scanner.nextLine();

            Student student = new Student(name);

            System.out.println("Enter grades for " + name + " (comma-separated, end with -1):");
            String gradesInput = scanner.nextLine();

            // Split the input & adding grades to the student
            String[] grades = gradesInput.split(",");
            for (String gradeStr : grades) {
                int grade = Integer.parseInt(gradeStr.trim());
                if (grade == -1) {
                    break;
                }
                student.addGrade(grade);
            }

            // Add the student to the GradeManager
            gradeManager.addStudent(student);
        }

        // Display all students with their statuses
        System.out.println("\n--- All Students ---");
        gradeManager.displayAllStudents();

        // Display the top student
        gradeManager.displayTopStudent();

        scanner.close();
    }
}
