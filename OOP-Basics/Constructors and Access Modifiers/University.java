// Problem 1: University Management System
// Create a Student class with:
// ● rollNumber (public).
// ● name (protected).
// ● CGPA (private).
// Write methods to:
// ● Access and modify CGPA using public methods.
// ● Create a subclass PostgraduateStudentProblem 1: University Management System
// Create a Student class with:
// ● rollNumber (public).
// ● name (protected).
// ● CGPA (private).
// Write methods to:
// ● Access and modify CGPA using public methods.
// ● Create a subclass PostgraduateStudent

public class University{
    public int rollNumber;
    protected String name;
    private double CGPA;

    public University(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public static void main(String[] args) {
        University student1 = new University(1, "Alice", 3.8);
        System.out.println("Roll Number: " + student1.rollNumber);
        System.out.println("Name: " + student1.name);
        System.out.println("CGPA: " + student1.getCGPA());

        student1.setCGPA(3.9);
        System.out.println("Updated CGPA: " + student1.getCGPA());
    }
}