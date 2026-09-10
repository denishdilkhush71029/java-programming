public class Room{
    int length;
    int breath;
    int area;
    void getdata(int a, int b){
        length = a;
        breath = b;
    }
    void calculation(){
        area = length*breath;
    }
    void display(){
        System.out.println("Area=" +area);
    }
}
class Length_ofRoom {
    public static void main(String args []){
        Room rl = new Room();
        rl.getdata(14,10);
        rl.calculation();
        rl.display();
    }
}