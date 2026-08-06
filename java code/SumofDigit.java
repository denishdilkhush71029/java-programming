class SumofDigit
{
    public static void main(String args[])
    {
        int num=123478, sum=0;
        while(num>0){
            sum +=num%10;
            num /=10;
        }
        System.out.println("Sum of Digits: " +sum);
    }
}