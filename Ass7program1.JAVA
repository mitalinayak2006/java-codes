 import java.util.Scanner;

class Employee {
    String name;
    String job;
    double salary;

    // Constructor
    Employee(String empname, String empjob, double empsalary) {
        name = empname;
        job = empjob;
        salary = empsalary;
    }

    // Calculate salary according to working days
    double calculate(int workingDays) {
        return (salary / 22.0) * workingDays;
    }

    // Update salary according to working days
    void update(int workingDays) {
        salary = calculate(workingDays);
    }

    // Display employee details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Job: " + job);
        System.out.println("Salary: " + salary);
    }
}

class Ass7program1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee("Alex", "Developer", 50000.0);

        System.out.println("Initial Employee Details");
        emp.display();

        System.out.print("Enter working days: ");
        int workingDays = sc.nextInt();

        double calculatesalary = emp.calculate(workingDays);

        System.out.println("Calculate salary for "
                + workingDays + " Days: " + calculatesalary);

        emp.update(workingDays);

        System.out.println("Updated Employee Details:");
        emp.display();

        sc.close();
    }
}