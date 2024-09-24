
package FinalLabExam;

//@author hasin

public class TicketOrder {

    public static void main(String[] args){
    
        Ticket[] tickets=new Ticket[4];
        
        tickets[0]=new ComplimentaryTicket();
        tickets[1]=new WalkupTicket();
        tickets[2]=new AdvanceTicket(14);
        tickets[3]=new StudentAdvanceTicket(6);
        
        for(int i=0;i<4;i++){
            System.out.println(tickets[i]);
        }
        
    }

}
