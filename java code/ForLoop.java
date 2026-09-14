import java.util.Scanner;
public class ForLoop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of n: ");
        int n=sc.nextInt();
        for(int i=0; i>n; i++){
            System.out.println("The value of n: " +n);
        }
        sc.close();
    }
}