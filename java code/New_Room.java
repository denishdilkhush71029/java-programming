import java.util.Scanner; // User input lene ke liye Scanner import kiya

class Room {
    int length;
    int breadth;
    int area;

    // Data set karne ke liye method
    void getdata(int a, int b) {
        length = a;
        breadth = b;
    }

    // Calculation karne ke liye method
    void calc() {
        area = length * breadth;
    }

    // Output dikhane ke liye method
    void display() {
        System.out.println("Area = " + area);
    }
}

class New_Room {
    public static void main(String args[]) {
        // Scanner class ka object banaya
        Scanner sc = new Scanner(System.in);

        // Room class ka object banaya
        Room r1 = new Room();

        // User se input manga
        System.out.print("Enter the length of the room: ");
        int l = sc.nextInt();

        System.out.print("Enter the breadth of the room: ");
        int b = sc.nextInt();

        // User dwara diye gaye values ko getdata method mein pass kiya
        r1.getdata(l, b);

        // Area calculate aur display kiya
        r1.calc();
        r1.display();

        // Scanner resource ko close kiya
        sc.close();
    }
}