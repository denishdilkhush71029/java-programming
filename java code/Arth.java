import java.util.Scanner;
public class Arth{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of A: ");
        int A=sc.nextInt();
        System.out.println("Enter the number of B: ");
        int B=sc.nextInt();
        System.out.println("Enter the number of C: ");
        int C=sc.nextInt();
        int sum,Difference,Multiplication, Division,Subtraction;
        sum=A+B;
        Difference=A-B;
        Multiplication=A*B;
        Division=A%B;
        Subtraction=A/B;
        int SumA=A+B+C;
         double Average=SumA/3;
        System.out.println("Sum of the two numbers is: " +sum);
        System.out.println("Difference of the two number is: " +Difference);
        System.out.println("Multiplication of the two number is: " +Multiplication);
        System.out.println("Division of the two number is: " +Division);
        System.out.println("Subtraction of the two number is: " +Subtraction);
        System.out.println("Average of the three number is: " +Average);
        sc.close();

    }
}