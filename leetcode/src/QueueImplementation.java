public class QueueImplementation {

    public static void main(String args[]) {

        Queue q = new Queue();

        // Enqueue elements into the queue
        q.enQueue(10);
        q.enQueue(20);

        System.out.println("Queue Front: " + q.getFront());
        System.out.println("Queue Rear: " + q.getRear());

        // Dequeue elements from the queue
        q.deQueue();
        q.deQueue();

        // Enqueue more elements into the queue
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);

        // Dequeue an element from the queue
        q.deQueue();

        System.out.println("Queue Front: " + q.getFront());
        System.out.println("Queue Rear: " + q.getRear());

        PriorityQueues.Node pq = PriorityQueues.newNode(4, 1);
        pq = PriorityQueues.push(pq, 5, 2);
        pq = PriorityQueues.push(pq, 6, 3);
        pq = PriorityQueues.push(pq, 7, 0);

        while (!PriorityQueues.isNodeEmpty(pq)) {
            System.out.printf("%d ", PriorityQueues.top(pq));
            pq= PriorityQueues.pop(pq);
        }

    }




}


