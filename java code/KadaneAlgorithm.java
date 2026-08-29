public class KadaneAlgorithm {
    public static int maxSubArray(int[] nums) {
        // Handle empty array edge case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        // Initialize both values to the first element
        int currentSum = nums[0];
        int maxSum = nums[0];

        // Iterate starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Choice: Extend existing subarray OR start fresh at nums[i]
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            // Track the overall maximum sum seen so far
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result); // Output: 6
    }
}