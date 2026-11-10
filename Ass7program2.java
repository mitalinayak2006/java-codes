import java.util.Scanner;
import java.lang.*;
class Student {
    String n;
    int r;
    String c;

Student(String sName,int sRoll){
n=sName;
r=sRoll;
c="None";
}
   
    void selectCourse(int ch) {
      
        switch (ch) {
            case 1:
                c = "Computer Science";
                break;

            case 2:
                c = "Information Technology";
                break;

            case 3:
                c = "Electonics Engineering";
                break;

            
            default:
                c = "Invalid option";
            break;
        }
    }

    void display() {
        System.out.println("Name: " + n);
        System.out.println("Roll No: " + r);
        System.out.println("Course: " + c);
    }
    class Ass7program2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String n = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int r = sc.nextInt();
        
        Student st= new Student(n,r);

        System.out.println("\n 1.Computer Science \n 2.Information Technology \n 3.Electronics Engineering");
        System.out.print("select option(1-3):");
        int ch=sc.nextInt();
        st.selectCourse(ch);
        System.out.println("\n___details___");

        st.display();
        sc.close();
    }
  }
}

