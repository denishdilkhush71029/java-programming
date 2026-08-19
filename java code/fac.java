public class ReverseArray {
    public static void reverseInPlace(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements using a temporary variable
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers toward the center
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        reverseInPlace(arr);

        // Output: 50 40 30 20 10
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}