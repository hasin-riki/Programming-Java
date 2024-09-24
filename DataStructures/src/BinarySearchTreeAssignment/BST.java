package BinarySearchTreeAssignment;
/**
 *
 * @author Hasin
 */
public class BST<T extends Comparable<T>>{
    
    Node<T> root;
    T[] array;
    T[] array2=(T[])new Comparable[50];
    int count=0;
    
    public int count(Node<T> n){
        if(n==null){
            return 0;
        }
        return 1 + count(n.left) + count(n.right);
    }
    
    public void append(T data){
        array[count]=data;
        count++;
    }
    
    public void insertInArray(Node<T> n){
        if(n==null){
        }
        else{
            insertInArray(n.left);
            append(n.data);
            insertInArray(n.right);
        }
    }
    
    public void balanceRecursive(T[] array, int first, int last){
        int mid=(int)(first+last)/2;
        if(first>last){
        }
        else{
            balanceRecursive(array, mid + 1, last);
            insert(array[mid]);
            balanceRecursive(array, first, mid-1);
        }
    }
    
    public void BalanceBST(){
        int size=count(root);
        array=(T[])new Comparable[size];
        insertInArray(root);
        
        root=null;
        
        balanceRecursive(array, 0, array.length-1);
        
        System.out.println("Balanced Binary Search Tree");
        LNR(root);
        System.out.println();
    }
    
    public void printRange(int k1, int k2){
        System.out.println("Data in Range : " + k1 + "-" + k2);
        printRange(root, k1, k2);
        System.out.println();
    }
    
    public void printRange(Node r, int k1, int k2){
        if(r==null){
        }
        else{
            printRange(r.left, k1, k2);
            if((int)r.data>=k1 && (int)r.data<=k2){
            System.out.print(r.data + ", ");}
            printRange(r.right, k1, k2);
        }
    }
    
    public void insert(T key){
        Node<T> n=new Node(key);
        if(root==null){
            root=n;
        }
        else{
            Node<T> prev=null;
            Node<T> temp=root;
            while(temp!=null){
                prev=temp;
                if(key.compareTo(temp.data)<0){
                    temp=temp.left;
                }
                else{
                    temp=temp.right;
                }
            }
            if(key.compareTo(prev.data)<0){
                prev.left=n;
            }
            else{
                prev.right=n;
            }
        }
    }
    
    public void LNR(){
        System.out.println("Binary Search Tree");
        LNR(root);
        System.out.println();
    }
    
    public void LNR(Node n){
        if(n==null){
        }
        else{
            LNR(n.left);
            System.out.print(n.data + ", ");
            LNR(n.right);
        }
    }
}
