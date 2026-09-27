import java.util.Scanner;

// Class to store patient appointment details
class Patient {

    String name;
    String department;
    String doctor;
    String time;

    // Method to display appointment details
    void displayAppointment() {

        System.out.println("\n===== APPOINTMENT CONFIRMED =====");
        System.out.println("Patient    : " + name);
        System.out.println("Department : " + department);
        System.out.println("Doctor     : " + doctor);
        System.out.println("Time       : " + time);
    }
}

public class Main {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Create Patient object
        Patient p = new Patient();

        // Get patient name
        System.out.print("Enter patient name: ");
        p.name = sc.nextLine();

        // Display available departments
        System.out.println("\nAvailable Departments:");
        System.out.println("Cardiology");
        System.out.println("Dermatology");
        System.out.println("Orthopedics");
        System.out.println("General");

        // Get department from user
        System.out.print("Enter department: ");
        String department = sc.nextLine().trim();

        // Check department without considering uppercase/lowercase
        if (department.equalsIgnoreCase("Cardiology")) {

            p.department = "Cardiology";
            p.doctor = "Dr. Arun";

        } else if (department.equalsIgnoreCase("Dermatology")) {

            p.department = "Dermatology";
            p.doctor = "Dr. Priya";

        } else if (department.equalsIgnoreCase("Orthopedics")) {

            p.department = "Orthopedics";
            p.doctor = "Dr. Kumar";

        } else if (department.equalsIgnoreCase("General")) {

            p.department = "General";
            p.doctor = "Dr. Raj";

        } else {

            // Invalid department
            System.out.println("Invalid department");
            return;
        }

        // Display available appointment times
        System.out.println("\nAvailable Appointment Times:");
        System.out.println("1. 9:00 AM");
        System.out.println("2. 11:00 AM");
        System.out.println("3. 2:00 PM");
        System.out.println("4. 4:00 PM");

        // Get time choice
        System.out.print("Select appointment time (1-4): ");
        int timeChoice = Integer.parseInt(sc.nextLine());

        // Select time using switch-case
        switch (timeChoice) {

            case 1:
                p.time = "9:00 AM";
                break;

            case 2:
                p.time = "11:00 AM";
                break;

            case 3:
                p.time = "2:00 PM";
                break;

            case 4:
                p.time = "4:00 PM";
                break;

            default:
                System.out.println("Invalid time selection");
                return;
        }

        // Display confirmed appointment
        p.displayAppointment();

        // Close Scanner
        sc.close();
    }
}