import java.util.ArrayList;

public class GradeManager {

    private ArrayList<Student> students;

    public GradeManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAllStudents() {
        for (Student student : students) {
            double average = student.calculateAverage();
            String status = student.getGradeStatus();
            System.out.printf("Student: %s, Average: %.2f, Status: %s\n", student.name, average, status);
        }
    }

    public void displayTopStudent() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        Student topStudent = students.get(0);
        double highestAverage = topStudent.calculateAverage();

        for (Student student : students) {
            double average = student.calculateAverage();
            if (average > highestAverage) {
                topStudent = student;
                highestAverage = average;
            }
        }
        System.out.printf("Top Student: %s with an average of %.2f\n", topStudent.name, highestAverage);
    }
}
