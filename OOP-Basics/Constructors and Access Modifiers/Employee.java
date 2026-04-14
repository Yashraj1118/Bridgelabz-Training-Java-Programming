


public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "IT", 50000);
        System.out.println("Employee ID: " + emp1.employeeID);
        System.out.println("Department: " + emp1.department);
        System.out.println("Salary: $" + emp1.getSalary());

        emp1.setSalary(55000);
        System.out.println("Updated Salary: $" + emp1.getSalary());
    }
}

