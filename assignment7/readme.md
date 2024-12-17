# Assignment: Student Grades Management System

## Objective
Create a simple program that manages student grades using classes and objects. You'll implement features that require using `for` loops, `if/else` statements, and basic object-oriented programming principles.

---

## Requirements

### 1. Create a `Student` Class  
#### Attributes:  
- **name** (String)  
- **grades** (Array of integers)  

#### Methods:  
- **calculateAverage()** - Returns the average of the grades.  
- **getGradeStatus()** - Returns "Pass" if the average is 60 or above; otherwise, returns "Fail".  

---

### 2. Create a `GradeManager` Class  
#### Attributes:  
- **students** (ArrayList of Student objects)  

#### Methods:  
- **addStudent(Student student)** - Adds a new student to the list.  
- **displayAllStudents()** - Loops through the list and prints each student's name, average grade, and grade status.  
- **displayTopStudent()** - Finds and displays the student with the highest average grade.  

---

### 3. Main Class  

In the `main` method, do the following:  
1. Create an instance of `GradeManager`.  
2. Prompt the user to enter the number of students.  
3. For each student, prompt the user to enter the student's **name** and **grades** (you can decide how many grades to ask for).  
4. After all students are added, display all students and their statuses.  
5. Display the top student.  

---

## Example Output  

Enter the number of students: 2
Enter name for student 1: Alice
Enter grades for Alice (enter -1 to stop): 85, 90, 78, -1
Enter name for student 2: Bob
Enter grades for Bob (enter -1 to stop): 55, 60, 58, -1

Student: Alice, Average: 84.33, Status: Pass
Student: Bob, Average: 57.67, Status: Fail
Top Student: Alice with an average of 84.33


---

## Submission  
Submit your Java files:  
- **Student.java**  
- **GradeManager.java**  
- **Main.java**  

Include comments in your code to explain your logic.  

---

## Evaluation Criteria  
- Correct use of classes and objects.  
- Proper implementation of loops and conditionals.  
- Code readability and comments.  
- Functionality as per the requirements.  
