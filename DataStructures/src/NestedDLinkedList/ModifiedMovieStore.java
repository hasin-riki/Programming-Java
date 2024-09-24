package NestedDLinkedList;
/**
 *
 * @author Hasin
 */
public class ModifiedMovieStore{
    Node head;
    ModifiedMovieStore[] lists=new ModifiedMovieStore[26];
    
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
    public void insert(String title, String year, ModifiedMovieStore castList){
        Node n=new Node(title, year, castList);
        char fLetter=title.charAt(0);
        int index=fLetter-65;

        if(lists[index]==null){
            lists[index]=new ModifiedMovieStore();
        }
        if(lists[index].head==null){
            lists[index].head=n;
        }
        else if(lists[index].head.next==null){
            lists[index].head.next=n;
            n.prev=lists[index].head;
        }
        else{
            n.next=lists[index].head.next;
            n.prev=lists[index].head;
            n.next.prev=n;
            lists[index].head.next=n;
        }
    }
    

    //Big(O)= O(n)
    public void delete(String title){
        char fLetter=title.charAt(0);
        int index=fLetter-65;
        
        if(lists[index]==null){
            System.out.println("Movie does not exist in the list or Title name is invalid");
            return;
        }

        Node temp=lists[index].head;
        while(temp!=null && !temp.title.equals(title)){
            temp=temp.next;}
        if(lists[index].head.title.equals(title) && temp.next==null){
            lists[index].head=null;
        }
        else if(lists[index].head.title.equals(title)){
            lists[index].head.next.prev=null;
            lists[index].head=temp.next;
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
        char fLetter=title.charAt(0);
        int index=fLetter-65;
        
        if(lists[index]!=null){
            Node temp=lists[index].head;
            while(temp!=null){
                if(temp.title.equals(title)){
                    System.out.println("Movie " + title + " is available");
                    return;
                }
                temp=temp.next;
            }
        }
        System.out.println("Movie " + title + " does not exist in the Store");
    }
    
    //Big(O)= O(n^2)
    @Override
    public String toString(){
        String message="Modified Movie Store\n";
        
        for(int i=0; i<lists.length; i++){
            if(lists[i]!=null){
                message=message+ "Titles with letter: " + (char)(i+65) + "\n"; 
                String txt1="Title";
                String utxt1=String.join("\u0332", txt1.split("",-1));
                String txt2="Year";
                String utxt2=String.join("\u0332", txt2.split("",-1));
                String txt3="Actors";
                String utxt3=String.join("\u0332", txt3.split("",-1));
                message=message+ utxt1 + "\t\t" + utxt2 + "\t\t" + utxt3 + "\n";
                
                Node temp1=lists[i].head;
                while(temp1!=null){
                    Node temp2=temp1.castList2.head;
                    message=message+temp1.title+ "\t" + temp1.year + "\t";
                    while(temp2!=null){
                        message=message + temp2.actor + ", ";
                        temp2=temp2.next;}
                    message=message+ "\n";
                    temp1=temp1.next;
                }
            }
        }
        if(message.equals("Modified Movie Store\n")){
            return "No Titles Found";
        }
        return message;
    }

}
