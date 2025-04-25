public class Queue {
    QueueNode front;
    QueueNode rear;


    public Queue() {
        this.front = null;
        this.rear = null;

    }

    private boolean isEmpty() {
        return front == null && rear == null;
    }


    public void enQueue(int x) {
        QueueNode temp = new QueueNode(x);

        if (rear == null) {
            front = rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        QueueNode temp = front;
        front = front.next;
        if (front == null) {
            rear = null;
        }
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return front.getX();
    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return rear.getX();
    }
}
