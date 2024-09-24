package Stack;
/**
 *
 * @author Hasin
 */
public class ArrayStack<T extends Comparable<T>>{
    
    T stackList[];
    int top=-1;
    
    ArrayStack(int size){
        stackList=(T[])new Comparable[size];
    }
    
    public void push(T c){
        if(isFull()){
            System.out.println("Stack is Full");
        }
        else{
            top++;
            stackList[top]=c;
        }
    }
    
    public T pop(){
        T temp = null;
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            temp=stackList[top];
            stackList[top]=null;
            top--;
        }
        return temp;
    }
    
    public T peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        return stackList[top];
    }
    
    public boolean isEmpty(){
        return top==-1;
    }
    
    public boolean isFull(){
        return top==(stackList.length-1);
    }
    
    @Override
    public String toString(){
        String message="Array Stack\n";
        for(int i=top;i>=0;i--){
            message=message + stackList[i] + ", ";
        }
        return message;
    }
    
    public boolean validate(String Exp){
        ArrayStack stack=new ArrayStack(Exp.length());
        
        int count=0;
   
        while(count!=stack.stackList.length){
            char symbol=Exp.charAt(count);
            if(symbol=='(' || symbol=='{' || symbol=='['){
                stack.push(symbol);
            }
            if(symbol==')' || symbol=='}' || symbol==']'){
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char item=(char) stack.peek();
                    if(item=='(' && symbol==')' || item=='{' && symbol=='}' || item=='[' && symbol==']'){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
            count++;
        }
        return stack.isEmpty();
    }
}
