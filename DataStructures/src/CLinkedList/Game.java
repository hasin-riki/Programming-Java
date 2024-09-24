package CLinkedList;
/**
 *
 * @author Hasin
 */
public class Game{
    Node head;
    
    public void insert(String name){
        Node n=new Node(name);
        
        if(head==null){
            head=n;
            head.next=n;
        }
        else if(head.next==null){
            head.next=n;
            n.next=head;
        }
        else{
            n.next=head.next;
            head.next=n;
        }
    }
    
    public int length(){
        int count=1;
        Node temp=head.next;
        while(temp!=head){
            count++;
            temp=temp.next;
        }
        return count;
    }
    
    public String playGame(){
        int count=length();
        if(count==0){
            return "No Players";
        }
        else if(count==1){
            return "Not Enough Players(2 or more)";}
        else{
            while(count!=1){
                count=length();
                int random=(int)(Math.random()*count) + 1;
                System.out.println(random);
                
                Node prev=head.next;
                while(prev.next!=head){
                    prev=prev.next;
                }
                
                for(int i=0;i<random-1;i++){
                    prev=prev.next;
                }
                delete(prev);
                System.out.println(toString());
            }
        }
        return "Congratulations " + head.name + "!! You have won the game!";
    }
    
    public void delete(Node prev){
        if(prev.next==head){
            prev.next=head.next;
            head=prev.next;
        }
        else{
            prev.next=prev.next.next;
        }
    }
    
    @Override
    public String toString(){
        String message=head.name;
        Node temp=head.next;
        while(temp!=head){
            message=message + ", " + temp.name;
            temp=temp.next;
        }
        return message;
    }
    
}
