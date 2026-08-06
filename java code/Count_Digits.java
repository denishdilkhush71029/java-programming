class Count_Digits
{
    public static void main(String args[])
    {
        int num=23487, count=0;
        while(num>0)
        {
            count++;
            num /=10;
        }
        System.out.println("Total Digits: " +count);
    }
}