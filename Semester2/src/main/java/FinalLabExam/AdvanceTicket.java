
package FinalLabExam;

//@author hasin

public class AdvanceTicket extends Ticket{

    protected int daysinadvance;

    public AdvanceTicket(int daysinadvance) {
        this.daysinadvance = daysinadvance;
    }
    
    @Override
    public int ticketPrice(){
        if(daysinadvance<10 && daysinadvance>0){
            price=40;}
        else{
        price=30;}
        return price;
    }

    @Override
    public String toString() {
        return "SN: " + super.getSerialnumber() + ", $" + ticketPrice();
    }

    
}
