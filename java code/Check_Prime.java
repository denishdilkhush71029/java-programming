public class Check_Prime
{
    public static void main(String args[])
    {
        int n = 13;
        boolean isPrime = n>1;
        for(int i=2; i<=n/2; i++)
        {
            if(n%i == 0)
            {
                isPrime = false;
                break;
            }

        }
        System.out.println(isPrime?"Prime " : "Not Prime");
    }
}