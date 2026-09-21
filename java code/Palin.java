import java.util.Scanner;
public class Palin{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of n:");
        int n=sc.nextInt();
        int originalnum=n;
        int r , num=0;
        while(n>0){
            r=n%10;
            num=num*10+r;
            n=n/10;
        }
        if(originalnum==num){
            System.out.println("This number is Palllindrome");
        }
        else{
            System.out.println("This number is not Pallindrome");
        }
        sc.close();

    }
}