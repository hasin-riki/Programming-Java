package Stack;
/**
 *
 * @author Hasin
 */
public class StackNode<T>{
    
    T info;
    StackNode<T> next;
    
    StackNode(T info){
        this.info=info;
    }
}
