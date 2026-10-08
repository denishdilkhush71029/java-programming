public class MathDemo {
    public static void main(String[] args) {
        double a = 9.0;
        double b = -4.5;
        double base = 2.0;
        double exponent = 3.0;

        // 1. Basic operations
        System.out.println("Absolute value of " + b + ": " + Math.abs(b));
        System.out.println("Maximum of " + a + " and " + b + ": " + Math.max(a, b));
        System.out.println("Minimum of " + a + " and " + b + ": " + Math.min(a, b));

        // 2. Exponents and Roots
        System.out.println(base + " raised to " + exponent + ": " + Math.pow(base, exponent));
        System.out.println("Square root of " + a + ": " + Math.sqrt(a));
        System.out.println("Cube root of 27: " + Math.cbrt(27));

        // 3. Rounding
        double num = 5.67;
        System.out.println("Ceiling (round up) of " + num + ": " + Math.ceil(num));
        System.out.println("Floor (round down) of " + num + ": " + Math.floor(num));
        System.out.println("Nearest whole number to " + num + ": " + Math.round(num));

        // 4. Random numbers (between 1 and 100)
        int randomNum = (int) (Math.random() * 100) + 1;
        System.out.println("Random integer (1 to 100): " + randomNum);

        // 5. Constants & Trigonometry
        System.out.println("Value of PI: " + Math.PI);
        double angleInRadians = Math.toRadians(30);
        System.out.println("sin(30 degrees): " + Math.sin(angleInRadians));
    }
}