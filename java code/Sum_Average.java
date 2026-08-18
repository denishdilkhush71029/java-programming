import java.util.Scanner;
public class Sum_Average{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of a:");
        int a = sc.nextInt();
        System.out.print("Enter the number of b: ");
        int b = sc.nextInt();
        System.out.print("Enter the number of c: ");
        int c = sc.nextInt();

        int sum = a+b+c;
        double Average = sum/3;
        System.out.println(sum+ ": Sum of two numbers.");
        System.out.println(Average+ ": Average of two number.");
        sc.close();
    }
}