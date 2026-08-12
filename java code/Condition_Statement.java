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
            System.out.println(Age+ ":Consturration You are addlt");
        }
        else
        {

            System.out.println(Age+ ": You are not Addlt.");
        }
        sc.close();
    }
}