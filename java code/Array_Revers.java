public class Array_Revers{
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swapping elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Pointers shift karna
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        
        reverseArray(arr);

        // Output Print karna
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Output: 50 40 30 20 10
    }
}