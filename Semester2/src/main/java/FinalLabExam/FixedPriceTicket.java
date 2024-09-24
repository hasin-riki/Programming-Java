
package FinalLabExam;

//@author hasin

public abstract class FixedPriceTicket extends Ticket{

    public FixedPriceTicket(int price) {
        this.price=price;
    }
    
    @Override
    public int ticketPrice(){
        return price;
    }


    
}
