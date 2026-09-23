public class MathDemo {
    public static void main(String[] args) {
        double num1 = 16.0;
        double num2 = -9.5;
        double base = 2.0, exponent = 3.0;

        System.out.println("=== Java Math Functions Demo ===");

        // Basic Math
        System.out.println("Absolute value of " + num2 + " : " + Math.abs(num2));
        System.out.println("Max of 15 and 45 : " + Math.max(15, 45));

        // Power and Roots
        System.out.println("Square Root of " + num1 + " : " + Math.sqrt(num1));
        System.out.println(base + " raised to " + exponent + " : " + Math.pow(base, exponent));

        // Rounding Operations
        System.out.println("Ceil of 4.3 : " + Math.ceil(4.3));
        System.out.println("Floor of 4.8 : " + Math.floor(4.8));
        System.out.println("Round of 4.5 : " + Math.round(4.5));

        // Random Number
        System.out.println("Random Number [0.0 - 1.0) : " + Math.random());

        // Constants
        System.out.println("Value of PI : " + Math.PI);
        System.out.println("Value of E : " + Math.E);
    }
}