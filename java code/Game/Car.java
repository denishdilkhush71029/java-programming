import java.util.Scanner;
public class Car{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Car Name: ");
        String Car = sc.nextLine();
        System.out.print("Enter your Car model Name: ");
        String Model = sc.nextLine();
        System.out.println(Car+ " : Car Name");
        System.out.println(Model+ " : Car Model Name");
        sc.close();

    }
}