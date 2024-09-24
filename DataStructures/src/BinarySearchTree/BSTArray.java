package BinarySearchTree;
/**
 *
 * @author Hasin
 * @param <T>
 */
public class BSTArray<T extends Comparable<T>>{
    
    T[] tree;
    
    BSTArray(int size){
        tree=(T[])new Comparable[size];
    }
    
    public int left(int index){
        int in=(index*2)+1;
        return in;
    }
    
    public int right(int index){
        int in=(index*2)+2;
        return in;
    }
    
    public boolean NoChild(int index){
        return tree[left(index)]==null && tree[right(index)]==null;
    }
    
    public boolean OneChild(int index){
        return (tree[right(index)]==null && tree[left(index)]!=null) || (tree[right(index)]!=null && tree[left(index)]==null);
    }
    
    public void deleteNoChild(int index){
        tree[index]=null;
    }
    
    public void deleteOneChild(int index){
        int index2;
        if(tree[right(index)]!=null){
            index2=right(index);
            while(tree[left(index2)]!=null){
                index2=left(index2);}
            tree[index]=tree[index2];
            if(NoChild(index2)){
                deleteNoChild(index2);
            }
            else if(OneChild(index2)){
                deleteOneChild(index2);
            }
            else{
                deleteTwoChild(index2);
            }
        }
        else{
            index2=left(index);
            while(tree[right(index2)]!=null){
                index2=right(index2);}
            tree[index]=tree[index2];
            if(NoChild(index2)){
                deleteNoChild(index2);
            }
            else if(OneChild(index2)){
                deleteOneChild(index2);
            }
            else{
                deleteTwoChild(index2);
            }
        }
    }
    
    public void deleteTwoChild(int index){
        int index2=right(index);
        while(tree[left(index2)]!=null){
            index2=left(index2);}
        tree[index]=tree[index2];
        if(NoChild(index2)){
            deleteNoChild(index2);
        }
        else if(OneChild(index2)){
                deleteOneChild(index2);
        }
        else{
            deleteTwoChild(index2);
        }
    }
    
    public void delete(T key){
        int index=find(key);
        if(index==-1){
            System.out.println("Element " + key + " is not present in the tree");
        }
        else{
            if(NoChild(index)){
                deleteNoChild(index);
            }
            else if(OneChild(index)){
                deleteOneChild(index);
            }
            else{
                deleteTwoChild(index);
            }
        }
    }
    
    public void insert(T key){
        int index=0;
        if(tree[0]==null){
            tree[0]=key;
        }
        else{
            while(tree[index]!=null){
                if(key.compareTo(tree[index])<0){
                    index=left(index);
                }
                else{
                    index=right(index);
                }
            }
            tree[index]=key;
        }
    }
    
    public void traverse(){
        System.out.println("Array Based Binary Search Tree");
        traverse(0);
        System.out.println();
    }
    
    public void traverse(int index){
        if(tree[index]==null){
        }
        else{
            traverse(left(index));
            System.out.print(tree[index] + ", ");
            traverse(right(index));
        }
    }
    
    public int find(T key){
        int index=0;
        while(tree[index]!=null){
            if(key.compareTo(tree[index])==0){
                return index;
            }
            else if(key.compareTo(tree[index])<0){
                index=left(index);
            }
            else{
                index=right(index);
            }
        }
        return -1;
    }
    
}
