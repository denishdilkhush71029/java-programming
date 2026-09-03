import java.util.Scanner;

public class Nesting {
    int n, m;

    Nesting(int x, int y) {
        this.m = x;
        this.n = y;
    }

    int largest() {
        if (m > n)
            return m;
        else
            return n;
    }

    int smallest() {
        if (m < n)
            return m;
        else
            return n;
    }

    void display() {
        int larger = largest();
        System.out.println("largernumber is :" + larger);
        int small = smallest();
        System.out.println("smallest number is :" + small);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of n: ");
            int n = sc.nextInt();
            System.out.println("Enter the number of m: ");
            int m = sc.nextInt();
            Nesting obj = new Nesting(n, m);
            obj.display();
        }
     }
}