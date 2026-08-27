import java.util.ArrayList;
import java.util.List;

public class PowerOfTwoMaxHeap {

    private final List<Integer> heap;
    private final int exponent;
    private final int childrenPerNode;

    public PowerOfTwoMaxHeap(int exponent) {
        // Exponent must be at least 1 (d-ary heap requires d >= 2)
        if (exponent < 1) {
            throw new IllegalArgumentException(
                    "Exponent must be greater than or equal to 1."
            );
        }

        // Prevent 2^exponent from overflowing a signed 32-bit integer
        if (exponent >= 31) {
            throw new IllegalArgumentException(
                    "Exponent is too large for this implementation."
            );
        }

        this.exponent = exponent;
        this.childrenPerNode = 1 << exponent;
        this.heap = new ArrayList<>();
    }

    public void insert(int value) {
        heap.add(value);

        int currentIndex = heap.size() - 1;

        // Up-heap (sift up)
        while (currentIndex > 0) {
            // Using bitwise right-shift equivalent to: (currentIndex - 1) / childrenPerNode
            int parentIndex = (currentIndex - 1) >> exponent;

            if (heap.get(parentIndex) >= heap.get(currentIndex)) {
                break;
            }

            swap(parentIndex, currentIndex);
            currentIndex = parentIndex;
        }
    }

    public int popMax() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty.");
        }

        int maximum = heap.get(0);
        int lastIndex = heap.size() - 1;

        if (lastIndex == 0) {
            heap.remove(lastIndex);
            return maximum;
        }

        heap.set(0, heap.remove(lastIndex));

        int currentIndex = 0;

        // Down-heap (sift down)
        while (true) {
            // Using bitwise left-shift equivalent to: currentIndex * childrenPerNode + 1
            int firstChildIndex = (currentIndex << exponent) + 1;

            if (firstChildIndex >= heap.size()) {
                break;
            }

            // Explicitly referencing java.lang.Math to avoid naming collision with local Math.java
            int lastChildIndex = java.lang.Math.min(
                    firstChildIndex + childrenPerNode - 1,
                    heap.size() - 1
            );

            int largestChildIndex = firstChildIndex;

            // Find the child with the maximum value among all children
            for (int childIndex = firstChildIndex + 1;
                 childIndex <= lastChildIndex;
                 childIndex++) {

                if (heap.get(childIndex) > heap.get(largestChildIndex)) {
                    largestChildIndex = childIndex;
                }
            }

            if (heap.get(currentIndex) >= heap.get(largestChildIndex)) {
                break;
            }

            swap(currentIndex, largestChildIndex);
            currentIndex = largestChildIndex;
        }

        return maximum;
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int size() {
        return heap.size();
    }

    private void swap(int firstIndex, int secondIndex) {
        int temp = heap.get(firstIndex);
        heap.set(firstIndex, heap.get(secondIndex));
        heap.set(secondIndex, temp);
    }

    @Override
    public String toString() {
        return heap.toString();
    }
}