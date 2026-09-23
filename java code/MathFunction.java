
import java.util.Scanner;
public class MathFunction{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of x: ");
        int x=sc.nextInt();
        System.out.println("Enter the number of Y: ");
        int Y=sc.nextInt();
        int sum=x+Y;
        int Difference=x-Y;
        int multiplication=x*Y;
        int Division=x/Y;
        int moduls=x%Y;
        System.out.println("Sum of two number is: "+sum);
        System.out.println("Difference of two number is: "+Difference);
        System.out.println("Multiplication of two number is: "+multiplication);
        System.out.println("Division of two number is: "+Division);
        System.out.println("Moduls of two number is: "+moduls);
        sc.close();
    }
}