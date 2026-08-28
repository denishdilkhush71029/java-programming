public class ArrayRotation {
    public static void rotateByOne(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        // 1. Save the last element
        int lastElement = arr[arr.length - 1];

        // 2. Shift elements to the right starting from the end
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // 3. Move the saved last element to the first index
        arr[0] = lastElement;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        rotateByOne(numbers);

        // Print the rotated array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        // Output: 5 1 2 3 4
    }
}