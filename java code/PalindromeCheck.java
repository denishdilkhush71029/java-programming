import java.util.Scanner;
public class PalindromeCheck
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Palindrome number: ");
        int n = sc.nextInt();
        int original = n;
        int reverse = 0;
        while(n>0)
        {
            int lastDigit = n%10;
            reverse = (reverse*10)+lastDigit;
            n = n/10;
        } 
        if(original == reverse)
        {
            System.out.println(original +" :Your Number is Palindrome:"); 
        }
        else
        {
            System.out.println(original +" :Your Number is not Palindrome:");
        }
        sc.close();
    }
}