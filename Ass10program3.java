import java.util.*;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name: " + this.name);
    }
}

public class Ass10program3 {
    public static void main(String[] args) {

        Student s = new Student(101, "Rahul");

        s.display();
    }
}

