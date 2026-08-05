class Line {

    private double length;

    static int count = 0;

    // null Constructor
    Line() {
        length = 0;
        count++;
    }

    // Parameterized Constructor
    Line(double length) {
        this.length = length;
        count++;
    }

    // Copy Constructor
    Line(Line l) {
        this.length = l.length;
        count++;
    }

    // Setter
    public void setLength(double length) {
        this.length = length;
    }

    // Getter
    public double getLength() {
        return length;
    }

    // Method
    public double doubleLength() {
        return length * 2;
    }

    // Display
    public void display() {
        System.out.println("Line Length = " + length);
        System.out.println("Double Length = " + doubleLength());
    }

    // toString
    Override
    public String toString() {
        return "Line [length = " + length + "]";
    }

    // Object Count
    public static int getObjectCount() {
        return count;
    }
}
main.java
  public class Main {

    public static void main(String[] args) {

        Line l1 = new Line();
        l1.setLength(10);

        Line l2 = new Line(20);

        Line l3 = new Line(l2);

        System.out.println("INE");

        l1.display();
        l2.display();
        l3.display();

        System.out.println("toString = " + l1);

        System.out.println("Objects Created = " + Line.getObjectCount());
