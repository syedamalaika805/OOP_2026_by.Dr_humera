class Point {

    // Data Members
    private int x;
    private int y;

    // Object Counter
    private static int count = 0;

    // Default Constructor
    Point() {
        x = 0;
        y = 0;
        count++;
    }

    // Parameterized Constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
        count++;
    }

    // Copy Constructor
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
        count++;
    }

    // Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Addition
    public Point add(Point p) {
        return new Point(x + p.x, y + p.y);
    }

    // Subtraction
    public Point subtract(Point p) {
        return new Point(x - p.x, y - p.y);
    }

    // Move Point
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    // Reset Point
    public void reset() {
        x = 0;
        y = 0;
    }

    // Check Origin
    public boolean isOrigin() {
        return x == 0 && y == 0;
    }

    // Distance From Origin
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Display
    public void display() {
        System.out.println("Point = (" + x + ", " + y + ")");
    }

    // toString
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Object Count
    public static int getObjectCount() {
        return count;
    }
}
main.java
  public class MainPoint {

    public static void main(String[] args) {

        System.out.println("===== POINT CLASS =====");

        // Default Constructor
        Point p1 = new Point();
        p1.setX(2);
        p1.setY(4);

        // Parameterized Constructor
        Point p2 = new Point(5, 7);

        // Copy Constructor
        Point p3 = new Point(p2);

        System.out.println("\nPoint Objects");

        p1.display();
        p2.display();
        p3.display();

        System.out.println("\nAddition = " + p1.add(p2));

        System.out.println("Subtraction = " + p1.subtract(p2));

        System.out.println("\nDistance From Origin = " + p1.distanceFromOrigin());

        System.out.println("Is Origin = " + p1.isOrigin());

        p1.move(3, 2);

        System.out.println("\nAfter Moving");

        p1.display();

        p1.reset();

        System.out.println("\nAfter Reset");

        p1.display();

        System.out.println("\ntoString = " + p2);

        System.out.println("\nTotal Point Objects = " + Point.getObjectCount());

    }
}
