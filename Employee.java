import java.time.LocalDate;
import java.time.Period;

class Employee {
    String name;
    double salary;
    LocalDate hireDate;

    Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    int calculateYearsOfService() {
        LocalDate today = LocalDate.now();
        return Period.between(hireDate, today).getYears();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Years of Service: " + calculateYearsOfService());
    }

    public static void main(String[] args) {

        Employee e = new Employee("Mitali",30000,LocalDate.of(2022, 7, 1));

        e.display();
    }
}