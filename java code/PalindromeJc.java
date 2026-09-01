import java.util.Scanner;
public class PalindromeJc{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n:");
        int n = sc.nextInt();
        int r,sum=0,temp;
        temp=n;
        while(n>0){
            r=n%10;
            sum *=sum*10+r;
            n /=10;
        }
        if(temp==sum){
            System.out.println("The number is Palindrome");
        }
        else{
            System.out.println("The nukmber is not Palindrome");
        }
        sc.close();
    }
}