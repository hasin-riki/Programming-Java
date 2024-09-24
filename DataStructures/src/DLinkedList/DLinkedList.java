package DLinkedList;
/**
 *
 * @author Hasin
 * @param <T>
 */
public class DLinkedList<T extends Comparable<T>>{ 
    Node<T> head; 
 
    //Big(O)= O(1)
    public boolean isEmpty(){
        return head==null;}
    
    //Big(O)= O(n)
    public int length(){
        int count=0;
        Node<T> temp=head;
        
        while(temp!=null){
            temp=temp.next;
            count++;}
        return count;}
    
    //Big(O)= O(n)
    @Override
    public String toString(){
        Node<T> temp=head;
        String message="";
        if(head==null){
            return "List is Empty";
        }
        else{
            message="List\n";
            while(temp!=null){
                message=message+temp.data+ ",";
                temp=temp.next;
            }
            return message;
        }
    }
    
    //Big(O)= O(n)
    public void insertInOrder(T i){
        Node<T> n=new Node(i);
        
        if(head==null){
            head=n;
        }
        else if(i.compareTo(head.data)<0){
            n.next=head;
            n.next.prev=n;
            head=n;
        }
        else{
            Node<T> temp=head;
            while(temp.next!=null && i.compareTo(temp.next.data)>0){
            temp=temp.next;
            }
            if(temp.next!=null){
                n.prev=temp;
                n.next=temp.next;
                n.next.prev=n;
                temp.next=n;
            }
            else{
                temp.next=n;
                n.prev=temp;
            }
        }
    }
    
    //Big(O)= O(n)
    public Node find(T i){
        Node<T> temp=head;
        while(temp!=null){
            if(i.compareTo(temp.data)==0){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    
    //Big(O)= O(n)
    public void reverse(){
        Node<T> temp1=head;
        Node<T> temp2=null;
        while(temp1!=null){
            temp2=temp1.prev;
            temp1.prev=temp1.next;
            temp1.next=temp2;
            temp1=temp1.prev;
        }
        if(temp2!=null){
        head=temp2.prev;}
    }
    
    //Big(O)= O(n)
    public void remove(T i){
        Node<T> temp=head;
        while(temp!=null && i.compareTo(temp.data)!=0){
            temp=temp.next;}
        if(i.compareTo(head.data)==0){
            head.next.prev=null;
            head=head.next;
            }
        else if(temp==null){
            System.out.println("Element does not exist in the list");}
        else if(temp.next==null && i.compareTo(temp.data)==0){
            temp.prev.next=null;}
        else{
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
    }
    
    //Big(O)= O(n)
    public void addAll(DLinkedList l){
        if(head==null){
            head=l.head;}
        else{
            Node<T> temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=l.head;
            l.head.prev=temp;
        }
    }
}
