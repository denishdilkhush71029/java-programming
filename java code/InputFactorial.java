import java.util.Scanner;
public class InputFactorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entere the number of N: ");
        int N = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=N; i++){
            fact *=i;

        }
        System.out.println("The Factyorial Number of N is: " +fact);
        sc.close();
        

    }
}