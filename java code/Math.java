import java.util.Scanner;
public class Math{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of x: ");
        int x=sc.nextInt();
        System.out.println("Enter the number of y: ");
        int y=sc.nextInt();
        int Addition,Subtraction,Multiplication,Division,Module;
        Addition=x+y;
        Subtraction=x-y;
        Multiplication=x*y;
        Division=x/y;
        Module=x%y;
        System.out.println("Addition of the two numbers is: "+Addition);
        System.out.println("Subtractrion of the two numbers is: " +Subtraction);
        System.out.println("Multiplication of the two numbers is: "+Multiplication);
        System.out.println("Division of the two numbers is: "+Division);
        System.out.println("Module of the two number is: "+Module);
        sc.close();
    }
}