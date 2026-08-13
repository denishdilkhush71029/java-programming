import java.util.Scanner;

public class Party{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter your Age: ");
        int age = sc.nextInt();

        System.out.println("\n---------------------------------");

        // Note: 18 ya usse bada hone par adult maana jata hai (>= use kiya hai)
        if (age >= 18) {
            int yearsAgo = age - 18; // Adult hue kitne saal ho gaye

            System.out.println("Congratulations " + name + "! You are an Adult. 🎉");

            if (yearsAgo == 0) {
                System.out.println("Aap isi saal (18 ke) adult bane hain!");
            } else {
                System.out.println("Aap " + yearsAgo + " saal pehle hi adult ho chuke hain!");
            }

            System.out.println("Aaj toh Party toh banti hai! 🍕🥳🎈");
        } 
        else {
            int yearsLeft = 18 - age; // Adult hone me kitne saal baaki hain

            System.out.println("Hey " + name + ", aap abhi adult nahi hue hain.");
            System.out.println("Aapko adult hone mein abhi " + yearsLeft + " saal aur baaki hain. ⏳");
            System.out.println("Thoda intezaar karein, phir party karenge!");
        }

        sc.close();
    }
}