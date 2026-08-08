import java.util.Scanner;

public class UserFunction
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String Name = sc.nextLine();

        System.out.print("Enter your Age: ");
        int Age = sc.nextInt();

        System.out.print("Enter your Precentage: ");
        Double Precentage = sc.nextDouble();

        System.out.println("--Enter your Details--");
        System.out.println("Enter your Name: " +Name);
        System.out.println("Enter your Age: " +Age);
        System.out.println("Enter your Precentage: " +Precentage+ "%");
        sc.close();
    }
}