import java.util.Scanner;
public class RoomArea{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the room: ");
        double length=sc.nextDouble();
        System.out.println("Enter the width of the room:");
        double width=sc.nextDouble();
        double area=length*width;
        System.out.println("The area of the room is: " +area+ " square units");
        sc.close();
    }
}