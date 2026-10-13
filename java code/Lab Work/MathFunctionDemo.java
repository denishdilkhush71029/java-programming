public class MathFunctionDemo {
    public static void main(String[] args) {
        
        // 1. Math.sqrt(x) - Calculates the square root of a number
        double area = 64.0;
        double side = Math.sqrt(area); // Input: 64.0, Output: 8.0
        System.out.println("Square root of " + area + " is: " + side);

        // 2. Math.pow(base, exponent) - Raises a base to an exponent (base^exp)
        double base = 5.0;
        double exponent = 3.0;
        double powerResult = Math.pow(base, exponent); // Computes 5^3
        System.out.println(base + " raised to power " + exponent + " is: " + powerResult);

        // 3. Math.max(a, b) - Compares two numbers and returns the larger one
        int score1 = 85;
        int score2 = 92;
        int highest = Math.max(score1, score2); // Returns 92
        System.out.println("Highest score: " + highest);

        // 4. Math.abs(x) - Returns the absolute value (removes negative sign)
        int balanceDifference = -450;
        int distance = Math.abs(balanceDifference); // Returns 450
        System.out.println("Absolute distance: " + distance);

        // 5. Math.round(x) - Rounds a decimal to the nearest whole integer
        double price = 19.75;
        long roundedPrice = Math.round(price); // Returns 20
        System.out.println("Rounded price: " + roundedPrice);
    }
}