class Rational {

    private int numerator;
    private int denominator;

    static int count = 0;

    // null Constructor
    Rational() {
        numerator = 0;
        denominator = 1;
        count++;
    }

    // Parameterized Constructor
    Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        count++;
    }

    // Copy Constructor
    Rational(Rational r) {
        this.numerator = r.numerator;
        this.denominator = r.denominator;
        count++;
    }

    // Setters
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    // Getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Addition
    public Rational add(Rational r) {

        int num = numerator * r.denominator +
                  denominator * r.numerator;

        int den = denominator * r.denominator;

        return new Rational(num, den);
    }

    // Display
    public void display() {
        System.out.println("Rational Number = " + numerator + "/" + denominator);
    }

    // toString
    //Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Object Count
    public static int getObjectCount() {
        return count;
    }
}
main.java
  
        Rational r1 = new Rational();
        r1.setNumerator(2);
        r1.setDenominator(5);

        Rational r2 = new Rational(3,5);

        Rational r3 = new Rational(r2);

        Rational result = r1.add(r2);

        System.out.println("RATIONAL NUMBERS");

        r1.display();
        r2.display();
        r3.display();

        System.out.println("Addition = " + result);

        System.out.println("toString = " + r1);

        System.out.println("Objects Created = " + Rational.getObjectCount());

    }
}
