
import java.util.Scanner;

class Student {
    private int rollNumber;
    private String name;
    private String course;
    private double marks;
    private char grade;

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setMarks(double marks) {
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }

    private char calculateGrade(double marks) {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        else return 'F';
    }

    public void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name       : " + name);
        System.out.println("Course     : " + course);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + grade);
        System.out.println("---------------------------");
    }
}

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            Student s = new Student();
            System.out.print("Roll Number: ");
            s.setRollNumber(sc.nextInt());
            sc.nextLine();
            System.out.print("Name: ");
            s.setName(sc.nextLine());
            System.out.print("Course: ");
            s.setCourse(sc.nextLine());
            System.out.print("Marks: ");
            s.setMarks(sc.nextDouble());
            sc.nextLine();
            students[i] = s;
            System.out.println("Student added successfully!\n");
        }

        // Optional: Display all students
        System.out.println("All Student Records:");
        for (Student s : students) {
            s.displayStudent();
        }
    }
}        