import java.util.Scanner;
public class FactorialClass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n: ");
        int n=sc.nextInt();
        int fact = 1;
        int i=1;
        for(i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println("The Factorial number n: " +fact);
        sc.close();
    }

}
class HelloWorld{
    public static void main(String args[]){
        System.out.println("Hello World!");
    }
}
