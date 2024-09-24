
package FinalLabExam;

//@author hasin

public class ComplimentaryTicket extends FixedPriceTicket{

    public ComplimentaryTicket() {
        super(0);
    }

    @Override
    public int ticketPrice(){
        return price;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}
