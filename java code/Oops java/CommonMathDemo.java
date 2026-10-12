public class CommonMathDemo {
    public static void main(String[] args) {
        double negativeNum = -25.75;
        double base = 5.0;
        double exponent = 3.0;

        // 1. Math.abs() - Returns the absolute (positive) value
        double absoluteVal = Math.abs(negativeNum);
        System.out.println("Absolute value of " + negativeNum + ": " + absoluteVal);

        // 2. Math.pow() - Calculates base raised to power (5^3)
        double powerVal = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + ": " + powerVal);

        // 3. Math.sqrt() - Calculates the square root of a number
        double sqrtVal = Math.sqrt(64.0);
        System.out.println("Square root of 64: " + sqrtVal);

        // 4. Math.max() and Math.min() - Compares two values
        int a = 45, b = 78;
        System.out.println("Maximum between " + a + " and " + b + ": " + Math.max(a, b));
        System.out.println("Minimum between " + a + " and " + b + ": " + Math.min(a, b));

        // 5. Math.round(), Math.floor(), and Math.ceil() - Rounding functions
        double decimal = 4.6;
        System.out.println("Round (nearest integer): " + Math.round(decimal)); // 5
        System.out.println("Floor (round down): " + Math.floor(decimal));       // 4.0
        System.out.println("Ceil (round up): " + Math.ceil(decimal));           // 5.0
    }
}