import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public double calculateAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return !grades.isEmpty() ? (double) sum / grades.size() : 0.0;
    }

    public String getGradeStatus() {
        double average = calculateAverage();
        return average >= 60 ? "Pass" : "Fail";
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }
}
