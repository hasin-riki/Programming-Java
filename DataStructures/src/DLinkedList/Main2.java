package DLinkedList;
/**
 *
 * @author Hasin
 */
public class Main2{

    public static void main(String[] args){
        
        Polynomial p1=new Polynomial();
        Polynomial p2=new Polynomial();
        
        Polynomial res=new Polynomial();
        
        p1.insert(2, 1);
        p1.insert(-5, 3);
        p1.insert(9, 0);
        p1.insert(-2, 4);
        p1.insert(0, 10);
        p1.insert(-3, -1);
        p1.insert(8, 2);
        
        p1.displayequation();
        
        p2.insert(11, 5);
        p2.insert(2, 3);
        p2.insert(-5, 2);
        p2.insert(3, 1);
        p2.insert(0, 4);
        p2.insert(6, -2);
        p2.insert(-2, 6);
        
        p2.displayequation();
        
        res=res.addition(p1, p2);
        
        res.displayequation();
    }
}
