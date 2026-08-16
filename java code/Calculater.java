import java.util.Scanner;
public class Calculater{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the number of b :");
        int b = sc.nextInt();
        int sum=a+b;
        int Division=a/b;
        int Difference=a-b;
        int Mode=a%b;
        int Multiplication=a*b;
        System.out.println(" Sum of two numbers :" +sum);
        System.out.println("Difference of two numbers :" +Difference);
        System.out.println("Division of two numbers :" +Division);
        System.out.println("Multiplication of two numbers :" +Multiplication);
        System.out.println("Mode of two numbers :" +Mode);
        sc.close();
    }
}