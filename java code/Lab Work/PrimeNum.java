import java.util.Scanner;
public class PrimeNum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of n:");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Your number is Even: " + num);
        } else {
            System.out.println("Your number is Odd: " + num);
        }
        sc.close();
    }
}