
public class PriorityQueues {
    public static class Node{
        int data;
        int priority;
        Node next;
    }
    Node node =new Node();

    static Node newNode(int data, int priority){
        Node temp=new Node();
        temp.data=data;
        temp.priority=priority;
        temp.next=null;
        return temp;
    }

    static int top(Node head){
        return (head).data;
    }
    static Node pop(Node head){
        head=head.next;
        return head;
    }
    static Node push(Node head,int data, int priority){
       Node start =head;
       Node temp =  newNode(data,priority);
       if(head.priority>priority){
           temp.next=head;
           head=temp;
       }else{
           while(start.next!=null && start.next.priority<=priority)
               start=start.next;

           temp.next=start.next;
           start.next=temp;
       }
       return head;
    }

    public static boolean isNodeEmpty(Node pq) {
        return (pq==null);
    }

}
