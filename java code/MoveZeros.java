import java.util.Arrays;

public class MoveZeros {
    public static void moveZerosToEnd(int[] nums) {
        int nonZeroIndex = 0;

        // Traverse the array. If the element is non-zero, swap it to the front.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[nonZeroIndex];
                nums[nonZeroIndex] = temp;
                
                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        
        moveZerosToEnd(arr);
        
        // Output: [1, 3, 12, 0, 0]
        System.out.println(Arrays.toString(arr));
    }
}
