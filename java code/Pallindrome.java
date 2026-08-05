class Pallindrome
{
    public static void main(String args[])
    {
        int n = 121;        
        int original = n;   
        int reverse = 0;    
        
        while(n > 0)
        {
            int lastDigit = n % 10;                
            reverse = (reverse * 10) + lastDigit;  
            n = n / 10;                            
        }
        
        
        if(original == reverse)
        {
            System.out.println(original + " This is  Palindrome number.");
        }
        else
        {
            System.out.println(original + " This is not Palindrome number.");
        }
    }
}