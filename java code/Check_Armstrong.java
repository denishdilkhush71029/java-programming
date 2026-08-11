import java.util.Scanner;
public class Check_Armstrong
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter your number: ");
         int original = n;
            int sum = 0;
        while(n>0);
        {
            int d = n/10;
            sum +=d*d*d;
            n /=10; 
        
        }
        System.out.println(original == sum ? "Armstrong Number" : "Not Armstrong Number");
        sc.close();
    }
}