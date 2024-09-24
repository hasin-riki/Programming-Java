package DLinkedList;
/**
 *
 * @author Hasin
 * @param <T>
 */
public class DLinkedListTail<T extends Comparable<T>>{ 
    Node<T> head;
    Node<T> tail;
 
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
            tail=n;
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
                tail=n;
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
        head=tail;
        tail=temp1;
        while(temp1!=null){
            temp2=temp1.prev;
            temp1.prev=temp1.next;
            temp1.next=temp2;
            temp1=temp1.prev;
        }
    }
    
    //Big(O)= O(n)
    public void remove(T i){
        Node<T> temp=head;
        while(temp!=null && i.compareTo(temp.data)!=0){
            temp=temp.next;}
        if(i.compareTo(head.data)==0){
            head=head.next;
            head.prev=null;
            }
        else if(temp==null){
            System.out.println("Element does not exist in the list");}
        else if(temp.next==null && i.compareTo(temp.data)==0){
            tail=temp.prev;
            tail.next=null;
            }
        else{
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
    }
    
    //Big(O)= O(1)
    public void addAll(DLinkedListTail l){
        if(head==null){
            head=l.head;
            tail=l.tail;}
        else{
            tail.next=l.head;
            l.head.prev=tail;
            tail=l.tail;
        }
    }
}
