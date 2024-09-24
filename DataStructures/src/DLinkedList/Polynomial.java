package DLinkedList;
/**
 *
 * @author Hasin
 */
public class Polynomial{
    
    Node2 head;
    
    public void insert(int coefficient, int power){
        Node2 n=new Node2(coefficient,power);
        
        if(coefficient==0){
            return;
        }
        else if(head==null){
            head=n;
        }
        else if(power>head.power){
            n.next=head;
            n.next.prev=n;
            head=n;
        }
        else{
            Node2 temp=head;
            while(temp.next!=null && power<temp.next.power){
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
    
    public Polynomial addition(Polynomial p1, Polynomial p2){
        Node2 temp1=p1.head;
        while(temp1!=null){
            Node2 temp2=p2.head;
            while(temp2!=null){
                if(temp1.power==temp2.power){
                    temp1.coefficient=temp1.coefficient+temp2.coefficient;
                    temp2.coefficient=temp2.coefficient-temp2.coefficient;
                }
                temp2=temp2.next;
            }
            temp1=temp1.next;
        }
        
        Node2 temp3=p2.head;
        while(temp3!=null){
            if(temp3.coefficient!=0){
                p1.insert(temp3.coefficient, temp3.power);
            }
            temp3=temp3.next;
        }
        return p1;
    }
    
    public void displayequation(){
        Node2 temp=head;
        String message="";
        if(head==null){
            System.out.println("Equation is Empty");
        }
        else{
            message="Equation\n";
            while(temp!=null){
                if(temp.coefficient>0){
                    if(temp.power==0){
                        message=message + "+" + temp.coefficient;}
                    else if(temp.power==1){
                        message=message + "+" + temp.coefficient + "x";
                    }
                    else{
                        message=message + "+" + temp.coefficient + "x^" + temp.power;
                    }}
                else{
                    if(temp.power==0){
                        message=message + temp.coefficient;}
                    else if(temp.power==1){
                        message=message + temp.coefficient + "x";
                    }
                    else{
                        message=message + temp.coefficient + "x^" + temp.power;
                    }    
                }
                temp=temp.next;}
            }
        System.out.println(message);
    }
}
