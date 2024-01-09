package Pradeep;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    private Map<String, Integer> grades;

    public StudentGrades() {
        grades = new HashMap<>();
    }

    public void addStudent(String name, int grade) {
        grades.put(name, grade);
    }

    public void removeStudent(String name) {
        grades.remove(name);
    }

    public void displayGrade(String name) {
        Integer grade = grades.get(name);
        if (grade != null) {
            System.out.println("The grade of " + name + " is " + grade + ".");
        } else {
            System.out.println("Student '" + name + "' does not exist.");
        }
    }

    public static void main(String[] args) {
        StudentGrades studentGrades = new StudentGrades();

        // Adding students
        studentGrades.addStudent("Alice", 90);
        studentGrades.addStudent("Bob", 80);
        studentGrades.addStudent("Charlie", 95);

        // Displaying grades
        studentGrades.displayGrade("Alice");  // Output: The grade of Alice is 90.
        studentGrades.displayGrade("Bob");    // Output: The grade of Bob is 80.

        // Removing a student
        studentGrades.removeStudent("Bob");
        studentGrades.displayGrade("Bob");
}
}
