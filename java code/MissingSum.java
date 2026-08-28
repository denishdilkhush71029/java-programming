public class MissingSum {
    public static int findMissingNumber(int[] arr, int N){
        int expectedSum = N*(N+1)/2;
        int actualSum = 0;
        for(int num:arr){
            actualSum +=num;
        }
        return expectedSum - actualSum;
    }
    public static void main(String args[]){
        int[] numbers = {1,2,3,4,5};
        int N = 5;
        int Missing = findMissingNumber(numbers, N);
        System.out.println("Missing Number is :" +Missing);
    }


} 
    

