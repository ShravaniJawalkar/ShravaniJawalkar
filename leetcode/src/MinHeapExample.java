import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        // Creating a min-heap using PriorityQueue
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Adding elements
        minHeap.add(10);
        minHeap.add(30);
        minHeap.add(20);
        minHeap.add(5);

        // Accessing the top element of the min heap
        System.out.println("The top element is: " + minHeap.peek());

        // Removing elements from the min heap
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
    }
}