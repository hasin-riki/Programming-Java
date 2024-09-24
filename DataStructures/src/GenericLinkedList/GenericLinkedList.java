package GenericLinkedList;
/**
 *
 * @author Hasin
 * @param <T>
 */
public class GenericLinkedList<T extends Comparable<T>>{
    Node<T> head;

    //Big(O)= O(n)
    public void insert(T value){
        Node<T> n=new Node(value);
        if(head==null){
            head=n;
            return;
        }

        Node<T> temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
    }

    //Big(O)= O(n)
    //Assuming list is already in ascending order
    public void insertInOrder(T value){
        Node<T> temp1=head;
        Node<T> temp2=head;
        Node<T> n=new Node(value);
        while(temp1!=null && value.compareTo(temp1.data)>0){
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
        Node<T> temp=head;
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
    public boolean find(T d){
        Node<T> temp=head;
        while(temp!=null){
            if(d.compareTo(temp.data)==0){
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
    public void delete(T value){
        Node<T> temp1=head;
        Node<T> temp2=null;
        if(head==null){
            System.out.println("List is Empty");
            return;}
        else if(head.data.compareTo(value)==0){
            head=head.next;
            return;
        }
        else{
            while(temp1!=null){
                if(temp1.data.compareTo(value)==0){
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
        Node<T> temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }

    //Big(O)= O(n)
    public void reverse(){
        Node<T> previous = null;
        Node<T> current = head;
        Node<T> next = null;
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
    public void addAll(GenericLinkedList l){
        Node<T> temp=head;
        if(head==null){
            head=l.head;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=l.head;
        }}
}


