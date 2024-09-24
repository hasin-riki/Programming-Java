
package FinalLabExam;

//@author hasin

public class StudentAdvanceTicket extends AdvanceTicket{

    public StudentAdvanceTicket(int daysinadvance) {
        super(daysinadvance);
    }

    @Override
    public int ticketPrice(){
        return (super.ticketPrice()/2);
    }

    @Override
    public String toString() {
        return super.toString() + "(Student Ticket: Costs half of Advance Ticket)";
    }
    
    
}
