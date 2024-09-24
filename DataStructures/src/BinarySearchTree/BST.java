package BinarySearchTree;
/**
 *
 * @author 23010
 * @param <T>
 */
public class BST<T extends Comparable<T>>{
    
    Node<T> root;
    
    
    public void deleteNoChild(Node<T> parent, Node<T> key){
        if(parent.right==key){
            parent.right=null;
        }
        else{
            parent.left=null;
        }
    }
    
    public void deleteOneChild(Node<T> parent, Node<T> key){
        if(parent.right==key){
            if(key.right!=null){
                parent.right=key.right;
            }
            else{
                parent.right=key.left;
            }
        }
        else{
            if(key.right!=null){
                parent.left=key.right;
            }
            else{
                parent.left=key.left;
            }
        }
    }
    
    
    public void delete(T key){
        Node<T> prev=null;
        Node<T> temp=root;
        while(temp!=null){
            if(key.compareTo(temp.data)<0){
                prev=temp;
                temp=temp.left;
                }
            else if(key.compareTo(temp.data)>0){
                prev=temp;
                temp=temp.right;
            }
            else{
                break;
            }
        }
        if(temp==null){
            System.out.println("Element " + key + " is not present in the tree");
        }
        else if(temp.right==null && temp.left==null){
            deleteNoChild(prev,temp);
        }
        else if((temp.right==null && temp.left!=null) || (temp.right!=null && temp.left==null)){
            deleteOneChild(prev,temp);
        }
        else{
            Node<T> temp2=temp.left;
            Node<T> prev2=temp;
        
            while(temp2.right!=null){
                prev2=temp2;
                temp2=temp2.right;
            }
            temp.data=temp2.data;
            
            if(temp2.right==null && temp2.left==null){
                deleteNoChild(prev2,temp2);
            }
            else if((temp2.right==null && temp2.left!=null) || (temp2.right!=null && temp2.left==null)){
                deleteOneChild(prev2,temp2);
            }
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
    
    public boolean find(T key){
        Node<T> temp=root;
        while(temp!=null){
            if(key.compareTo(temp.data)==0){
                return true;
            }
            else if(key.compareTo(temp.data)<0){
                    temp=temp.left;
                }
            else{
                temp=temp.right;
            }
        }
        return false;
    }
    
    public T minimum(){
        Node<T> temp=root;
        if(root==null){
            return null;
        }
        else{
            while(temp.left!=null){
                temp=temp.left;
            }
            return temp.data;
        }
    }
    
    public T maximum(){
        Node<T> temp=root;
        if(root==null){
            return null;
        }
        else{
            while(temp.right!=null){
                temp=temp.right;
            }
            return temp.data;
        }
    }
}
