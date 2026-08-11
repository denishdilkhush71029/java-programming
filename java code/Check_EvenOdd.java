import java.util.Scanner;
public class Check_EvenOdd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter your Number: ");
        if(n%2==0)
        {
            System.out.println(n + " Your Number is Even.");
        }
        else
        {
            System.out.println(n + " Your Number is Odd.");
        }
        sc.close();

    }
}