package Stack;
/**
 *
 * @author Hasin
 */
public class Main{
    
    public static void main(String[] args){
        
        ArrayStack stack1=new ArrayStack(5);
        
        System.out.println("Is Array Stack Empty? " + stack1.isEmpty());
        
        stack1.push(4);
        stack1.push(3);
        stack1.push(5);
        
        System.out.println("Is Array Stack Empty? " + stack1.isEmpty());
        System.out.println("Is Array Stack Full? " + stack1.isFull());
        
        stack1.push(8);
        stack1.push(7);
        
        System.out.println("Is Array Stack Full? " + stack1.isFull());
        
        System.out.println("Array Stack Peek: " + stack1.peek());
        stack1.pop();
        System.out.println("Array Stack Peek: " + stack1.peek());
        
        System.out.println(stack1);
        
        System.out.println("Validate: " + stack1.validate("(([({abc})]))"));
        
        LinkedStack stack2=new LinkedStack();
        
        System.out.println("Is Linked Stack Empty? " + stack2.isEmpty());
        
        stack2.push(4);
        stack2.push(3);
        stack2.push(5);
        stack2.push(8);
        stack2.push(7);
        
        System.out.println("Is Linked Stack Empty? " + stack2.isEmpty());
        
        System.out.println("Linked Stack Peek: " + stack2.peek());
        stack2.pop();
        System.out.println("Linked Stack Peek: " + stack2.peek());
        
        System.out.println(stack2);
        
    }
}
