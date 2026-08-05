class Complex {

    private int real;
    private int imaginary;

    static int count = 0;

    // null Constructor
    Complex() {
        real = 0;
        imaginary = 0;
        count++;
    }

    // Parameterized Constructor
    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
        count++;
    }

    // Copy Constructor
    Complex(Complex c) {
        this.real = c.real;
        this.imaginary = c.imaginary;
        count++;
    }

    // Setters
    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    // Getters
    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    // Addition
    public Complex add(Complex c) {
        return new Complex(real + c.real, imaginary + c.imaginary);
    }

    // Subtraction
    public Complex subtract(Complex c) {
        return new Complex(real - c.real, imaginary - c.imaginary);
    }

    // Display
    public void display() {
        System.out.println("Complex Number = " + real + " + " + imaginary + "i");
    }

    // toString
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    // Object Count
    public static int getObjectCount() {
        return count;
    }
}
main.java
  public class Main {

    public static void main(String[] args) {

        Complex c1 = new Complex();
        c1.setReal(4);
        c1.setImaginary(3);

        Complex c2 = new Complex(2,5);

        Complex c3 = new Complex(c2);

        Complex sum = c1.add(c2);

        System.out.println("COMPLEX NUMBERS");

        c1.display();
        c2.display();
        c3.display();

        System.out.println("Addition = " + sum);

        System.out.println("toString = " + c1);

        System.out.println("Objects Created = " + Complex.getObjectCount());
