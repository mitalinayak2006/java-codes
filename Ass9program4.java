class Shape {
    double getPerimeter() {
        return 0;
    }

    double getArea() {
        return 0;
    }
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double getPerimeter() {
        return 2 * Math.PI * r;
    }

    double getArea() {
        return Math.PI * radius * r;
    }
}

    public class Ass9program4 {
    public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter radius of circle:");
        double r=sc.nextDouble();
        Circle c = new Circle(5);

        System.out.println("Radius: " + c.radius);
        System.out.println("Perimeter: " + c.getPerimeter());
        System.out.println("Area: " + c.getArea());
    }
