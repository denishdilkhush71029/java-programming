import java.util.Scanner;
public class AmstrongNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;
        while(n>0){
            int d = n%10;
            sum +=d*d*d;
            n /=10;
        }
        System.out.println(original == sum? "Amstrong Number" : "Not Amstrong Number");
        sc.close();
    }
}