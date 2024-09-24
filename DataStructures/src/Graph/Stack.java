package Graph;
/**
 *
 * @author Hasin
 */
public class Stack{
    
    StackNode top;
    
    public void push(Vertex v){
        StackNode n=new StackNode(v);
        n.next=top;
        top=n;
    }
    
    public Vertex pop(){
        Vertex temp=null;
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            temp=top.v;
            top=top.next;
        }
        return temp;
    }
    
    public boolean isEmpty(){
        return top==null;
    }
    
}
