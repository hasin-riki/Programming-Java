package Queue;
/**
 *
 * @author Hasin
 * @param <T>
 */
public class ArrayQueue<T>{

    T[] queue;
    int front;
    int rear;

    public ArrayQueue(int size){
        queue=(T[])new Object[size];
        front=0;
        rear=0;
    }
    
    public void enqueue(T obj){
        if(isFull()){
            System.out.println("Overflow of Queue");
        }
        else{
           rear=((rear+1)%(queue.length));
           queue[rear]=obj;
        }
    }
    
    public T dequeue(){
        if(isEmpty()){
            System.out.println("Underflow of Queue");
            return null;
        }
        else{
            front=(front+1)%(queue.length);
            T temp=queue[front];
            queue[front]=null;
            return temp;}
    }
    
    public boolean isEmpty(){
        return rear==front;
    }
    
    public boolean isFull(){
        return (rear+1)%(queue.length)==front;
    }
    
    @Override
    public String toString(){
        String message="Array Queue\n";
        for(int i=0;i<queue.length;i++){
            if(queue[i]!=null){
                message=message + queue[i] + ", ";
            }
        }
        return message;
    }
}
