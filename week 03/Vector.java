class Vector {

    private int x;
    private int y;

    static int count = 0;

    // null Constructor
    Vector() {
        x = 0;
        y = 0;
        count++;
    }

    // Parameterized Constructor
    Vector(int x, int y) {
        this.x = x;
        this.y = y;
        count++;
    }

    // Copy Constructor
    Vector(Vector v) {
        this.x = v.x;
        this.y = v.y;
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
    public Vector add(Vector v) {
        return new Vector(x + v.x, y + v.y);
    }

    // Subtraction
    public Vector subtract(Vector v) {
        return new Vector(x - v.x, y - v.y);
    }

    // Display
    public void display() {
        System.out.println("Vector = (" + x + ", " + y + ")");
    }

    // toString
    Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Object Count
    public static int getObjectCount() {
        return count;
    }
}
main.java
  public class Main {

    public static void main(String[] args) {
      Vector v1 = new Vector();
        v1.setX(3);
        v1.setY(4);

        Vector v2 = new Vector(5,2);

        Vector v3 = new Vector(v2);

        Vector sum = v1.add(v2);
        Vector difference = v1.subtract(v2);

        System.out.println("VECTOR");

        v1.display();
        v2.display();
        v3.display();

        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + difference);

        System.out.println("toString = " + v1);

        System.out.println("Objects Created = " + Vector.getObjectCount());
    }
}
