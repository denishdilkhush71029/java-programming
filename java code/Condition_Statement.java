import java.util.Scanner;
public class Condition_Statement
{
    public static void main(String args[])

    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String Name = sc.nextLine();
        System.out.print("Enter your Age: ");
        int Age = sc.nextInt();
        if(Age>18)
        {
            System.out.println(Name + ", congratulations! " + Age + ": You are an adult.");
        }
        else
        {

            System.out.println(Name + ", " + Age + ": You are not an adult.");
        }
        sc.close();
    }
}