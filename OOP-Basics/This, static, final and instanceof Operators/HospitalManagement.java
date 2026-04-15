// Sample Program 7: Hospital Management System
// Create a Patient class with the following features:
// 1. Static:

// ○ A static variable hospitalName shared among all patients.
// ○ A static method getTotalPatients() to count the total patients admitted.

// 2. This:

// ○ Use this to initialize name, age, and ailment in the constructor.

// 3. Final:

// ○ Use a final variable patientID to uniquely identify each patient.

// 4. Instanceof:

// ○ Check if an object is an instance of the Patient class before displaying its
// details.

public class HospitalManagement {
    static String hospitalName = "City Hospital";
    String name;
    int age;
    String ailment;
    final int patientID;
    static int totalPatients = 0;

    public HospitalManagement(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public void displayPatientDetails() {
        if (this instanceof HospitalManagement) {
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hospital Name: " + hospitalName);
        
        HospitalManagement patient1 = new HospitalManagement("John Doe", 30, "Flu", 101);
        HospitalManagement patient2 = new HospitalManagement("Jane Smith", 25, "Cold", 102);
        
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();
        
        getTotalPatients();
    }
    
}
