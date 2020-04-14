package eg.edu.alexu.csd.datastructure.queue;

public class ArrayBasedQueue implements IArrayBased{

	private int length;
    private Object[] Queue;  
    private int front = 0, rear = 0;
    
    public ArrayBasedQueue(int Queue_length){
        this.length = Queue_length+1;
        Queue = new Object[length];
    }

    @Override
    public void enqueue(Object item) {
        if(this.size()==length-1)
            throw new RuntimeException("Queue is full");
        Queue[rear] = item;
        rear = (rear+1)%length;
    }

    @Override
    public Object dequeue() {
        if(this.isEmpty())
            throw new RuntimeException("Queue is empty");
        Object temp = Queue[front];
        Queue[front] = null;
        front = (front+1)%length;
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return front==rear;
    }

    @Override
    public int size() {
        return (length-front+rear)%length;
    }
    
    public void Print(){
        for(int i=front; ((front!=rear)&&i!=rear)||((front==rear)&&front!=(rear)); i=(i+1)%length){
            System.out.print(Queue[i]+" ");
        }
        System.out.println("");
    }

}
