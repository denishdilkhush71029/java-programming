import java.util.Scanner;
public class ForUse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you Age: ");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("You are eligibal to voting."+age);
        }
        else{
            System.out.println("you are not aligibal to voting."+age);
        }
        sc.close();
    }
}