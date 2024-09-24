package BinarySearchTreeAssignment;
/**
 *
 * @author Hasin
 */
public class Main{
    
    public static void main(String[] args){
        
        BST tree=new BST();
        
        tree.insert(5);
        tree.insert(2);
        tree.insert(7);
        tree.insert(9);
        tree.insert(13);
        tree.insert(18);
        tree.insert(25);
        
        tree.LNR();
        
        tree.printRange(5, 20);
        
        tree.BalanceBST();
    }
}
