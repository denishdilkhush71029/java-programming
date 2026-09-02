import java.util.Scanner; // Scanner import kiya gaya

class Emp {
    int id, allowance; 
    double salary;

    void getdata(int a, int b, double c) { 
        id = a;
        allowance = b; 
        salary = c;
    }

    void showdata() { 
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Allowance: " + allowance); 
        System.out.println("Employee Salary: " + salary);
    }
}

class Employee {
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in); // Scanner ka object banaya
        Emp e1 = new Emp();

        // User se inputs lena
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();

        System.out.print("Enter Employee Allowance: ");
        int empAllowance = sc.nextInt();

        System.out.print("Enter Employee Salary: ");
        double empSalary = sc.nextDouble();

        // User ki entered values ko getdata me pass karna
        e1.getdata(empId, empAllowance, empSalary);

        System.out.println("\n--- Employee Details ---");
        e1.showdata();

        sc.close();
    }
}