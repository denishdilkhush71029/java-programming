import java.util.Scanner;
public class LinearArray
{
    public static void main(String args[])
    {
        int[] arr = {10,25,30,45,50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int target = sc.nextInt();
        boolean found=false;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==target){
                System.out.println(target+ " index " +i+ " This is your number.");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println(target+ " Not avibabal yoour number this array");
        }
        sc.close();

    }
}