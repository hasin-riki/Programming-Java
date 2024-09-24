package Graph;
/**
 *
 * @author Hasin
 */
public class Linkedlist{
    
    Node head;
    
    public void insert(Vertex v){
        Node n=new Node(v);
        if(head==null){
            head=n;
            return;
        }

        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
    }
    
    public boolean find(Vertex v){
        Node temp=head;
        while(temp!=null){
            if(v==temp.v){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    
    public void delete(Vertex v){
        Node temp1=head;
        Node temp2=null;
        if(head==null){
            System.out.println("List is Empty");}
        else if(head.v==v){
            head=head.next;
        }
        else{
            while(temp1!=null && temp1.v!=v){
                temp2=temp1;
                temp1=temp1.next;
            }
            if(temp1==null){
                System.out.println("Element not present in the list");
            }
            else if(temp1.next==null){
                temp2.next=null;
            }
            else{
                temp2.next=temp1.next;
            }
        }
    }
    
    @Override
    public String toString(){
        Node temp=head;
        String message="";
        if(head==null){
            return "No Friends";
        }
        else{
            while(temp!=null){
                message=message+temp.v+ ",";
                temp=temp.next;
            }
            return message;
        }
    }
}
