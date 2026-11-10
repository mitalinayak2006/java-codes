class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double calculateArea() {
        return width * height;
    }
    double calculatePerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);

        System.out.println("Area = " + r.calculateArea());
        System.out.println("Perimeter = " + r.calculatePerimeter());
    }
}