package Queue;
/**
 *
 * @author Hasin
 */
public class LinkedQueue<T>{

    Node<T> front;
    Node<T> rear;
    
    public void enqueue(T obj){
        Node<T> n=new Node(obj);
        if(front==null){
            front=n;
            rear=n;
        }
        else{
            rear.next=n;
            rear=n;
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
        String message="Linked Queue\n";
        Node<T> temp=front;
        while(temp!=null){
            message=message + temp.data + ", ";
            temp=temp.next;
        }
        return message;
    }
}
