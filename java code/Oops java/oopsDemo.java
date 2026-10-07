// 1. Abstraction: Hiding implementation details using an abstract class
abstract class Employee {
    // 2. Encapsulation: Restricting direct access using private fields
    private String name;
    private int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Encapsulation: Providing controlled access via public getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    // Abstract method: Forces child classes to provide their own implementation
    public abstract double calculateSalary();

    // 4. Polymorphism (Overloading): Multiple methods with the same name but different parameters
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public void displayInfo(String prefix) {
        System.out.println(prefix + " -> ID: " + id + ", Name: " + name);
    }
}

// 3. Inheritance: FullTimeEmployee acquires properties of Employee
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id); // Calls the constructor of the parent class (Employee)
        this.monthlySalary = monthlySalary;
    }

    // 4. Polymorphism (Overriding): Child class provides a specific implementation of a parent's method
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// 3. Inheritance: PartTimeEmployee acquires properties of Employee
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // 4. Polymorphism (Overriding)
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Main class to execute the program
public class oopsDemo {
    public static void main(String[] args) {
        // Creating objects of child classes
        FullTimeEmployee ftEmp = new FullTimeEmployee("Alice", 101, 5000.0);
        PartTimeEmployee ptEmp = new PartTimeEmployee("Bob", 102, 20.0, 80);

        System.out.println("--- Full-Time Employee ---");
        ftEmp.displayInfo(); // Calls inherited standard method
        System.out.println("Salary: $" + ftEmp.calculateSalary()); // Calls overridden method

        System.out.println("\n--- Part-Time Employee ---");
        ptEmp.displayInfo("Contractor"); // Calls overloaded method
        System.out.println("Salary: $" + ptEmp.calculateSalary()); // Calls overridden method
    }
}