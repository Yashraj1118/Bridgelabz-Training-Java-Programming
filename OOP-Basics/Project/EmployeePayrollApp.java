import java.util.*;

class Employee {
    String id;
    String name;
    String password;
    double salary;

    Employee(String id, String name, String password, double salary) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.salary = salary;
    }

    boolean login(String id, String password) {
        return this.id.equals(id) && this.password.equals(password);
    }

    void showPayslip() {
        double tax = salary * 0.10;
        double deduction = salary * 0.05;
        double netPay = salary - tax - deduction;

        System.out.println("\n----- PAYSLIP -----");
        System.out.println("Name       : " + name);
        System.out.println("ID         : " + id);
        System.out.println("Salary     : " + salary);
        System.out.println("Tax (10%)  : " + tax);
        System.out.println("Deduction  : " + deduction);
        System.out.println("Net Pay    : " + netPay);
        
    }
}

public class EmployeePayrollApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = null;
        int choice;

        do {
            System.out.println("===== EMPLOYEE PAYROLL SYSTEM =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Password: ");
                    String password = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();

                    emp = new Employee(id, name, password, salary);
                    System.out.println("Registration Successful!\n");
                    break;

                case 2:
                    if (emp == null) {
                        System.out.println(" No employee registered!\n");
                        break;
                    }

                    System.out.print("Enter ID: ");
                    String loginId = sc.nextLine();

                    System.out.print("Enter Password: ");
                    String loginPass = sc.nextLine();

                    if (emp.login(loginId, loginPass)) {
                        System.out.println("Login Successful!");
                        emp.showPayslip();
                    } else {
                        System.out.println(" Invalid Credentials!\n");
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!\n");
            }

        } while (choice != 3);

        sc.close();
    }
}