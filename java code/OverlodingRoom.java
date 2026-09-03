import java.io.*;

class OverlodingRoom {

    // Method 1: Rectangle room ka area nikalne ke liye (2 parameters)
    int area(int length, int breadth) {
        return (length * breadth);
    }

    // Method 2: Square room ka area nikalne ke liye (1 parameter)
    int area(int side) {
        return (side * side);
    }

    public static void main(String args[]) {
        OverlodingRoom r1 = new OverlodingRoom();

        // Method 1 Call hoga (2 parameters)
        int a = r1.area(15, 10);
        System.out.println("Area of Rectangular Room = " + a);

        // Method 2 Call hoga (1 parameter)
        int b = r1.area(3);
        System.out.println("Area of Square Room = " + b);
    }
}