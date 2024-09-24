
package FinalLabExam;

//@author hasin

import java.util.ArrayList;
import java.util.Iterator;
public abstract class Ticket{

    private int serialnumber;
    protected int price;
    
    public abstract int ticketPrice();

    
    ArrayList<Integer> ticketsList=new ArrayList<Integer>();
    Iterator iterator=ticketsList.iterator();
    
    public Ticket() {
        this.serialnumber=(int)(Math.random()*1000)+1;
        while(ticketsList.contains(this.serialnumber)){
           this.serialnumber=(int)(Math.random()*1000)+1;}
        
        ticketsList.add(this.serialnumber);
    }
    
    public int getSerialnumber() {
        return serialnumber;
    }

    @Override
    public String toString(){
        return "SN: " + serialnumber + ", $" + price;
    }
    
    
    
    
}
