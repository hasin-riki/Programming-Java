package NestedDLinkedList;
/**
 *
 * @author Hasin
 */
public class MovieStore{
    Node head;
    
    //Big(O)= O(1)
    public void insert(String actor){
        Node n=new Node(actor);
        
        if(head==null){
            head=n;
        }
        else if(head.next==null){
            head.next=n;
            n.prev=head;
        }
        else{
            n.next=head.next;
            n.prev=head;
            n.next.prev=n;
            head.next=n;
        }
    }
    
    //Big(O)= O(1)
    public void insert(String title, String year, MovieStore castList){
        Node n=new Node(title, year, castList);
        
        if(head==null){
            head=n;
        }
        else if(head.next==null){
            head.next=n;
            n.prev=head;
        }
        else{
            n.next=head.next;
            n.prev=head;
            n.next.prev=n;
            head.next=n;
        }
    }
    

    //Big(O)= O(n)
    public void delete(String title){
        Node temp=head;
        while(temp!=null && !temp.title.equals(title)){
            temp=temp.next;}
        if(head.title.equals(title) && head.next==null){
            head=null;
        }
        else if(head.title.equals(title)){
            head.next.prev=null;
            head=head.next;
            }
        else if(temp==null){
            System.out.println("Movie does not exist in the list or Title name is invalid");}
        else if(temp.next==null && temp.title.equals(title)){
            temp.prev.next=null;}
        else{
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
    }


    //Big(O)= O(n)
    public void find(String title){
        Node temp=head;
        while(temp!=null){
            if(temp.title.equals(title)){
                System.out.println("Movie " + title + " is available");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Movie " + title + " does not exist in the Store");
    }
    
    //Big(O)= O(n^2)
    @Override
    public String toString(){
        Node temp1=head;
        String message;
        if(head==null){
            return "No Titles Found";
        }
        else{
            message=(char)27 +"[1mMovie Store\n";
            String txt1="Title";
            String utxt1=String.join("\u0332", txt1.split("",-1));
            String txt2="Year";
            String utxt2=String.join("\u0332", txt2.split("",-1));
            String txt3="Actors";
            String utxt3=String.join("\u0332", txt3.split("",-1));
            message=message+ utxt1 + "\t\t" + utxt2 + "\t\t" + utxt3 + "\n";
            while(temp1!=null){
                Node temp2=temp1.castList.head;
                message=message+temp1.title+ "\t" + temp1.year + "\t";
                while(temp2!=null){
                    message=message + temp2.actor + ", ";
                    temp2=temp2.next;}
                message=message+ "\n";
                temp1=temp1.next;
            }
            return message;
        }
    }

}
