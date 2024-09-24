package Queue;
/**
 *
 * @author Hasin
 * @param <T>
 */
public class ArrayPriorityQueue<T extends Comparable<T>>{
    
    T[] queue;
    int front;

    public ArrayPriorityQueue(){
        queue=(T[])new Comparable[5];
        front=-1;
    }
    
    public ArrayPriorityQueue(int size){
        queue=(T[])new Comparable[size];
        front=-1;
    }
    
    public void enqueue(T obj){
        
        if(isFull()){
            System.out.println("Overflow of Queue");
        }
        else if(front==-1){
            front++;
            queue[front]=obj;
        }
        else{
            int index=-1;
            boolean flag=false;
            for(int i=0; i<=front; i++){
                if(obj.compareTo(queue[i])>0){
                    index=i;
                    flag=true;
                    break;
                }
            }
            
            if(flag==true){
                for(int i=front+1; i>index; i--){
                    queue[i]=queue[i-1];
                }
                queue[index]=obj;
                front++;
            }
            else{
                front++;
                queue[front]=obj;
            }
            
        }
    }
    
    public T dequeue(){
        if(isEmpty()){
            System.out.println("Underflow of Queue");
            return null;
        }
        else{
            T temp=queue[front];
            queue[front]=null;
            front--;
            return temp;
        }
    }
    
    public boolean isEmpty(){
        return front==-1;
    }
    
    public boolean isFull(){
        return front==queue.length-1;
    }
    
    @Override
    public String toString(){
        String message="Array Priority Queue\n";
        for(int i=queue.length-1;i>=0;i--){
            if(queue[i]!=null){
                message=message + queue[i] + ", ";
            }
        }
        return message;
    }

}
