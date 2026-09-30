class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

public class Zak {
    public static void main(String[] args) {
        Car myCar = new Car("Honda", 2021);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
    }
}