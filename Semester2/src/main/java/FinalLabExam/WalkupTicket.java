
package FinalLabExam;

//@author hasin

public class WalkupTicket extends FixedPriceTicket{

    public WalkupTicket() {
        super(50);
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
