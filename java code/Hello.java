import java.util.Scanner;
public class Hello{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of N: ");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        System.out.println("Factorial Number of N: " +fact);
        sc.close();
    }
}