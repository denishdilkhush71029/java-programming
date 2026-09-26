import java.util.Scanner;
public class factG {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of n: ");
        int n=sc.nextInt();
        int i=1;
        int fact=1;
        for(i=1; i<=n; i++){
            fact *=i;
        }
        System.out.println("Factorial number is: " +fact);
        sc.close();
    }
    
}
