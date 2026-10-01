import java.util.Scanner;
public class Loops{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you marks in the Exam:");
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("Grad A number is:"+marks);
        }
            else if(marks>=75){
                System.out.println("Grad B number is: " +marks);
            }
            else if(marks>=55){
                System.out.println("Grad Pass number is:"+marks);
            }
            else{
                System.out.println("Grad fail number is: "+marks);
            }
        sc.close();
    }
}