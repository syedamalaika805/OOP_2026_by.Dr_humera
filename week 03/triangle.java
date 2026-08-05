class Triangle {

    // Data Members
    private Point p1;
    private Point p2;
    private Point p3;

    // Object Counter
    private static int count = 0;

    // Default Constructor
    Triangle() {

        p1 = new Point();
        p2 = new Point();
        p3 = new Point();

        count++;
    }

    // Parameterized Constructor
    Triangle(Point p1, Point p2, Point p3) {

        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

        count++;
    }

    // Copy Constructor
    Triangle(Triangle t) {

        p1 = new Point(t.p1);
        p2 = new Point(t.p2);
        p3 = new Point(t.p3);

        count++;
    }

    // Setters
    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    // Getters
    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    // Distance Between Two Points
    private double distance(Point a, Point b) {

        double dx = a.getX() - b.getX();
        double dy = a.getY() - b.getY();

        return Math.sqrt(dx * dx + dy * dy);
    }

    // Perimeter
    public double perimeter() {

        double side1 = distance(p1, p2);
        double side2 = distance(p2, p3);
        double side3 = distance(p3, p1);

        return side1 + side2 + side3;
    }

    // Valid Triangle
    public boolean isValidTriangle() {

        double side1 = distance(p1, p2);
        double side2 = distance(p2, p3);
        double side3 = distance(p3, p1);

        return (side1 + side2 > side3)
                && (side1 + side3 > side2)
                && (side2 + side3 > side1);
    }

    // Reset Triangle
    public void resetTriangle() {

        p1 = new Point();
        p2 = new Point();
        p3 = new Point();
    }

    // Display
    public void display() {

        System.out.println("Point 1 : " + p1);
        System.out.println("Point 2 : " + p2);
        System.out.println("Point 3 : " + p3);
    }

    // toString
    verride
    public String toString() {

        return "Triangle [ " + p1 + " , " + p2 + " , " + p3 + " ]";
    }

    // Object Count
    public static int getObjectCount() {
        return count;
    }
}
main.java
  public class MainTriangle {

    public static void main(String[] args) {

        System.out.println("===== TRIANGLE CLASS =====");

        // Default Constructor
        Triangle t1 = new Triangle();

        // Parameterized Constructor
        Triangle t2 = new Triangle(

                new Point(2, 3),
                new Point(6, 4),
                new Point(4, 8)

        );

        // Copy Constructor
        Triangle t3 = new Triangle(t2);

        System.out.println("\nTriangle 1");

        t1.display();

        System.out.println("\nTriangle 2");

        t2.display();

        System.out.println("\nTriangle 3");

        t3.display();

        System.out.println("\nPerimeter = " + t2.perimeter());

        System.out.println("Valid Triangle = " + t2.isValidTriangle());

        System.out.println("\ntoString = " + t2);

        t2.resetTriangle();

        System.out.println("\nAfter Reset");

        t2.display();

        System.out.println("\nTotal Triangle Objects = " + Triangle.getObjectCount());

    }
}
