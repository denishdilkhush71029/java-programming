public class Revers_String
{
    public static void main(String args[])
    {
        String str = "Dilkhush" , rev = " ";
        for(int i = str.length()-1; i>=0; i-- )
        {
            rev +=str.charAt(i);
        }
        System.out.println("Reversed String:" +rev);
    }
}