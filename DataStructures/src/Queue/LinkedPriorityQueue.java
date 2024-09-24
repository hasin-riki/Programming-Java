package Queue;
/**
 *
 * @author Hasin
 * @param <T>
 */
public class LinkedPriorityQueue<T extends Comparable<T>>{
    
    Node<T> front;
    Node<T> rear;
    
    public void enqueue(T obj){
        Node<T> n=new Node(obj);
        Node<T> temp=front;
        Node<T> prev=null;
        while(temp!=null && obj.compareTo(temp.data)>=0){
            prev=temp;
            temp=temp.next;
        }
        if(isEmpty()){
            front=n;
            rear=n;
        }
        else if(temp==front && front!=rear){
            n.next=front;
            front=n;
        }
        else if(temp==front && front==rear){
            n.next=front;
            front=n;
            rear=n.next;
        }
        else if(temp==null){
            rear.next=n;
            rear=n;
        }
        else{
            n.next=prev.next;
            prev.next=n;
        }
    }
    
    public T dequeue(){
        if(isEmpty()){
            System.out.println("Underflow of Queue");
            return null;
        }
       
        T data=front.data;
        front=front.next;
        
        return data;
    }
    
    public boolean isEmpty(){
        return front==null;
    }
    
    @Override
    public String toString(){
        String message="Linked Priority Queue\n";
        Node<T> temp=front;
        while(temp!=null){
            message=message + temp.data + ", ";
            temp=temp.next;
        }
        return message;
    }
}
