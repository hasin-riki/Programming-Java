package CLinkedList;
/**
 *
 * @author Hasin
 */
public class Main{
    
    public static void main(String[] args){
        Game obj=new Game();
        
        obj.insert("Mark");
        obj.insert("Bill");
        obj.insert("Wick");
        obj.insert("John");
        obj.insert("Sarah");
        obj.insert("William");
        obj.insert("Tom");
        obj.insert("Bourne");
        obj.insert("Cruella");
        
        System.out.println(obj);
        System.out.println(obj.playGame());
    }
    
}
