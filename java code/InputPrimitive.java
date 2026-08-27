import java.util.Scanner;
public class InputPrimitive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter a long: ");
        long b = scanner.nextLong();

        System.out.print("Enter a float: ");
        float c = scanner.nextFloat();

        System.out.print("Enter a character: ");
        char letter = scanner.next().charAt(0);

        System.out.print("Enter a boolean: ");
        boolean is_adult = scanner.nextBoolean();

        System.out.println("Integer number is = " + a);
        System.out.println("Long number is = " + b);
        System.out.println("Float number is = " + c);
        System.out.println("Char number is = " + letter);
        System.out.println("Boolean number is = " + is_adult);
    }
}
