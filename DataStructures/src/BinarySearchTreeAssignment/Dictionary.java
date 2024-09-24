package BinarySearchTreeAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Hasin
 */
public class Dictionary{

    Node2 root;
    ArrayList<String> list;
    
    public void readFile(){
        try{
            File obj=new File("C:\\Users\\CC\\Downloads\\Dictionary2.txt");
            Scanner sc=new Scanner(obj);
            list=new ArrayList<String>();
            String line;
            while(sc.hasNext()){
                line=sc.nextLine();
                if(line.isEmpty()){
                }
                else{
                list.add(line);
                }
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
    
    public void insert(){
        Collections.shuffle(list);
        
        String[] line=new String[2];
     
        for(int i=0; i<list.size();i++){
            line=list.get(i).split("  ");
        
            Node2 n=new Node2(line[0],line[1]);
        
            if(root==null){
                root=n;
            }
            else{
                Node2 prev=null;
                Node2 temp=root;
                while(temp!=null){
                    prev=temp;
                    if(line[0].compareTo(temp.word)<0){
                        temp=temp.left;
                    }
                    else{
                        temp=temp.right;
                    }
                }
                if(line[0].compareTo(prev.word)<0){
                    prev.left=n;
                }
                else{
                    prev.right=n;
                }
            }
        }
    }
    
    public void insert(String word, String meaning){
        
        Node2 n=new Node2(word, meaning);
        
        if(root==null){
            root=n;
        }
        else{
            Node2 prev=null;
            Node2 temp=root;
            while(temp!=null){
                prev=temp;
                if(word.compareTo(temp.word)<0){
                    temp=temp.left;
                }
                else{
                    temp=temp.right;
                }
            }
            if(word.compareTo(prev.word)<0){
                prev.left=n;
            }
            else{
                prev.right=n;
            }
        }
    }
    
    public void traverse(){
        System.out.println("Dictionary\n");
        traverse(root);
        System.out.println();
    }
    
    public void traverse(Node2 n){
        if(n==null){
        }
        else{
            traverse(n.left);
            System.out.println("Word: " + n.word + " || Meaning: " + n.meaning);
            traverse(n.right);
        }
    }
    
    public boolean find(String word){
        Node2 temp=root;
        while(temp!=null){
            if(word.compareTo(temp.word)==0){
                return true;
            }
            else if(word.compareTo(temp.word)<0){
                    temp=temp.left;
                }
            else{
                temp=temp.right;
            }
        }
        return false;
    }
    
    public void deleteNoChild(Node2 parent, Node2 key){
        if(parent.right==key){
            parent.right=null;
        }
        else{
            parent.left=null;
        }
    }
    
    public void deleteOneChild(Node2 parent, Node2 key){
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
    
    
    public void delete(String word){
        Node2 prev=null;
        Node2 temp=root;
        while(temp!=null){
            if(word.compareTo(temp.word)<0){
                prev=temp;
                temp=temp.left;
                }
            else if(word.compareTo(temp.word)>0){
                prev=temp;
                temp=temp.right;
            }
            else if(word.compareTo(temp.word)==0){
                break;
            }
        }
        
        if(temp==null){
            System.out.println("Word '" + word + "' is not present in the tree");
        }
        else if(temp.right==null && temp.left==null){
            deleteNoChild(prev,temp);
        }
        else if((temp.right==null && temp.left!=null) || (temp.right!=null && temp.left==null)){
            deleteOneChild(prev,temp);
        }
        else{
            Node2 temp2=temp.left;
            Node2 prev2=temp;
        
            while(temp2.right!=null){
                prev2=temp2;
                temp2=temp2.right;
            }
            
            temp.word=temp2.word;
            temp.meaning=temp2.meaning;
            
            if(temp2.right==null && temp2.left==null){
                deleteNoChild(prev2,temp2);
            }
            else if((temp2.right==null && temp2.left!=null) || (temp2.right!=null && temp2.left==null)){
                deleteOneChild(prev2,temp2);
            }
        }
    }
}
