package Stack;
/**
 *
 * @author Hasin
 * @param <T>
 */
public class LinkedStack<T>{
    
    StackNode<T> top;
    
    public void push(T c){
        StackNode<T> n=new StackNode(c);
        n.next=top;
        top=n;
    }
    
    public T pop(){
        T temp=null;
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            temp=top.info;
            top=top.next;
        }
        return temp;
    }
    
    public T peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        return top.info;
    }
    
    public boolean isEmpty(){
        return top==null;
    }
    
    @Override
    public String toString(){
        StackNode<T> temp=top;
        String message="Linked Stack\n";
        while(temp!=null){
            message=message + temp.info + ", ";
            temp=temp.next;
        }
        return message;
    }
    
}
