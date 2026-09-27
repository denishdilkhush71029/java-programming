import java.util.Scanner;
public class Geerks{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nomber of A: ");
        int A=sc.nextInt();
        System.out.println("Enter the number of B: ");
        int B=sc.nextInt();
        int Increement=A++;
        System.out.println("Postincreement number A: " +Increement);
        int preincrement=++A;
        System.out.println("Preincrement number A: " + preincrement);
        int Decrement=B--;
        System.out.println("Postdecrement number B: "+Decrement);
        int PrecrementB=--B;
        System.out.println("Precrement number B: " +PrecrementB);
        sc.close();
    }
}