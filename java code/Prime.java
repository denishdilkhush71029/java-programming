import java.util.Scanner;
public class Prime{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of n: ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
        sc.close();
    }
}