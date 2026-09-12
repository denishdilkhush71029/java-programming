import java.io.*;
import java.util.Scanner;

class Person {
    int id;
    int age;
    String address;

    void pget(Scanner sc) {
        System.out.println("Enter Person's Details: Address, ID, Age");
        address = sc.nextLine();
        id = sc.nextInt();
        age = sc.nextInt();
        sc.nextLine(); // बफ़र साफ करने के लिए
    }

    void pshow() {
        System.out.println("Id is : " + id);
        System.out.println("Age is : " + age);
        System.out.println("Address is : " + address);
    }
}

class Manager extends Person {
    String designation;
    float Basic;

    void mget(Scanner sc) {
        System.out.println("Enter Employee's Details: Designation, Basic Salary");
        designation = sc.nextLine();
        Basic = sc.nextFloat();
        sc.nextLine(); // बफ़र साफ करने के लिए
    }

    void mshow() {
        System.out.println("Designation is : " + designation);
        System.out.println("Basic Salary is : " + Basic);
    }
}

class Teacher extends Person {
    String Subject;
    String Dept;

    void tget(Scanner sc) {
        System.out.println("Enter Teacher's Details: Subject, Dept");
        Subject = sc.nextLine();
        Dept = sc.nextLine();
    }

    void tshow() {
        System.out.println("Subject is : " + Subject);
        System.out.println("Department is : " + Dept);
    }
}

class Hier {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Manager mg = new Manager();
        Teacher tc = new Teacher();

        System.out.println("--- Enter Manager Details ---");
        mg.pget(sc);
        mg.mget(sc);

        System.out.println("\n--- Enter Teacher Details ---");
        tc.pget(sc);
        tc.tget(sc);

        System.out.println("\n--- Displaying Manager Details ---");
        mg.pshow();
        mg.mshow();

        System.out.println("\n--- Displaying Teacher Details ---");
        tc.pshow();
        tc.tshow();

        sc.close();
    }
}