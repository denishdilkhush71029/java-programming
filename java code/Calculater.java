import java.util.Scanner;
public class Calculater{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the number of b :");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(" Sum of two numbers :" +sum);
        sc.close();
    }
}