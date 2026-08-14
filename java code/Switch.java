import java.util.Scanner;

public class Switch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // 1. Scanner ka object banaya

        System.out.print("Enter day number n: "); // 2. Pehle prompt print kiya
        int n = sc.nextInt(); // 3. Input liya

        // 4. switch(n) ke saath { } brackets start kiye
        switch(n) { 
            case 1: 
                System.out.println("Sunday");
                break;
            case 2: 
                System.out.println("Monday");
                break;
            case 3: 
                System.out.println("Tuesday");
                break;
            case 4: 
                System.out.println("Wednesday");
                break;
            case 5: 
                System.out.println("Thursday");
                break;
            case 6: 
                System.out.println("Friday");
                break;
            case 7: 
                System.out.println("Saturday");
                break;
            default: // 5. Sahi keyword 'default:' lagaya
                System.out.println(n + " : Invalid Number");
        }

        sc.close();
    }
}