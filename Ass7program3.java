import java.lang.*;
import java.util.Scanner;
class Shape {

    static double nextArea(double l, double b) {
        return l * b;
}
double sqArea(double S){
return S*S;
}
    }

    class Ass7program3{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter length:");
    double l = sc.nextDouble();

    System.out.print("Enter breadth:");
    double b = sc.nextDouble();
    double ra = Shape.nextArea(l,b);
    System.out.println("Area of rectsngle:"+ra);
    System.out.print("Enter side of square:");
    double s = sc.nextDouble();
    Shape sh = new Shape();
    double sq = sh.sqArea(s);
    System.out.println("Area of square:"+sq);
    sc.close();
    }
}

