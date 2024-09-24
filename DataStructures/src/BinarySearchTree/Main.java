package BinarySearchTree;
/**
 *
 * @author Hasin
 */
public class Main{
    
    public static void main(String[] args){
        
        BST tree=new BST();
        
        tree.insert(12);
        tree.insert(5);
        tree.insert(3);
        tree.insert(1);
        tree.insert(7);
        tree.insert(9);
        tree.insert(8);
        tree.insert(11);
        tree.insert(15);
        tree.insert(13);
        tree.insert(14);
        tree.insert(17);
        tree.insert(20);
        
        tree.LNR();
        
        tree.delete(5);
        tree.delete(6);
        tree.delete(13);
        tree.delete(12);
        
        tree.LNR();
        
        System.out.println("Find 11: " + tree.find(11));
        System.out.println("Minimum: " + tree.minimum());
        System.out.println("Maximum: " + tree.maximum());
        System.out.println();
        
        
        BSTArray tree2=new BSTArray(100);
        
        tree2.insert(44);
        tree2.insert(20);
        tree2.insert(10);
        tree2.insert(30);
        tree2.insert(80);
        tree2.insert(70);
        tree2.insert(90);
        tree2.insert(4);
        tree2.insert(6);
        tree2.insert(11);
        tree2.insert(60);
        tree2.insert(55);
        tree2.insert(44);
        
        tree2.traverse();
        
        tree2.delete(44);
        tree2.delete(16);
        tree2.delete(70);
        tree2.delete(6);
        
        tree2.traverse();
        
        System.out.println("Find 30: " + tree2.find(6));
    }
}
