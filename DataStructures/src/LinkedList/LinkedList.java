package LinkedList;
/**
 *
 * @author Hasin
 */
public class LinkedList{

    Node head;

    //Big(O)= O(n)
    public void insert(int value){
        Node n=new Node(value);
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

    //Big(O)= O(n)
    //Assuming list is already in ascending order
    public void insertInOrder(int value){
        Node temp1=head;
        Node temp2=head;
        Node n=new Node(value);
        while(temp1!=null && value>temp1.data){
            temp2=temp1;
            temp1=temp1.next;
        }
        if(temp1==head){
            head=n;
            head.next=temp1;
        }
        else if(temp1==null){
            temp2.next=n;
        }
        else{
            temp2.next=n;
            n.next=temp1;
        }
    }

    //Big(O)= O(n)
    public void display(){
        Node temp=head;
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        System.out.println("List");
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    //Big(O)= O(n)
    public boolean find(int d){
        Node temp=head;
        while(temp!=null){
            if(d==temp.data){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    //Big(O)= O(1)
    public void clear(){
        head=null;
    }

    //Big(O)= O(n)
    public void delete(int value){
        Node temp1=head;
        Node temp2=null;
        if(head==null){
            System.out.println("List is Empty");
            return;}
        else if(head.data==value){
            head=head.next;
            return;
        }
        else{
            while(temp1!=null){
                if(temp1.data==value){
                    temp2.next=temp1.next;
                    return;}
                temp2=temp1;
                temp1=temp1.next;
            }
        }
        System.out.println("Element not present in the list");
    }

    //Big(O)= O(1)
    public boolean isEmpty(){
        return head==null;
    }

    //Big(O)= O(n)
    public int length(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }

    //Big(O)= O(n)
    public void reverse(){
        Node previous = null;
        Node current = head;
        Node next = null;
        while(current!=null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    //Big(O)= O(n)
    @Override
    public String toString(){
        Node temp=head;
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
    public void addAll(LinkedList l){
        Node temp=head;
        if(head==null){
            head=l.head;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=l.head;
        }
    }
}

