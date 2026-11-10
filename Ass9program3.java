class Employee {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class Employee1 extends Employee{
    int employeeID;
    String jobTitle;

    Employee(String firstName, String lastName, int employeeID, String jobTitle) {
        super(firstName, lastName);
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
    }

    int getEmployeeID() {
        return employeeID;
    }

    String getLastName() {
        return LastName + " _ "+jobTitle ;
    }
}

public class Ass9program3 {
    public static void main(String[] args) {
        Employee e = new Employee1(
            "Rahul",
            "Kumar",
            101,
            "Software Engineer"
        );

        System.out.println("First Name: " + e.getFirstName());
        System.out.println("Last Name: " + e.getLastName());
        System.out.println("Employee ID: " + e.getEmployeeID());
    }
}

