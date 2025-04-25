public class QueueNode {
    private int x;
    QueueNode next;
    public QueueNode(int x){
        this.x=x;
        next=null;
    }
    public int getX(){
        return this.x;
    }
}
