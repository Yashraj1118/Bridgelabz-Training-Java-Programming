
public class StudentReport {
    String name;
    int rollNo;
    int marks;

    public StudentReport(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void Grade() {
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }

    public static void main(String[] args) {
        StudentReport student1 = new StudentReport("Alice", 1, 95);
       

        System.out.println(student1.name + " (Roll No: " + student1.rollNo + ") - Marks: " + student1.marks);
        student1.Grade();

      
    }
}
