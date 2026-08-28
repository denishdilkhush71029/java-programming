import java.util.Scanner;
public class InputPrimitive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = sc.nextInt();

        System.out.print("Enter a long: ");
        long b = sc.nextLong();

        System.out.print("Enter a float: ");
        float c = sc.nextFloat();

        System.out.print("Enter a character: ");
        char letter = sc.next().charAt(0);

        System.out.print("Enter a boolean: ");
        boolean is_adult = sc.nextBoolean();

        System.out.println("Integer number is = " + a);
        System.out.println("Long number is = " + b);
        System.out.println("Float number is = " + c);
        System.out.println("Char number is = " + letter);
        System.out.println("Boolean number is = " + is_adult);
        sc.close();
    }
}
