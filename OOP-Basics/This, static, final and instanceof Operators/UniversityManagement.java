

public class UniversityManagement {
    static String universityName = "Global University";
    String name;
    final int rollNumber;
    String grade;
    static int totalStudents = 0;

    public UniversityManagement(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof UniversityManagement) {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        System.out.println("University Name: " + universityName);
        UniversityManagement student1 = new UniversityManagement("Alice", 101, "A");
        UniversityManagement student2 = new UniversityManagement("Bob", 102, "B");
        
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        
        displayTotalStudents();
    }
    
}
