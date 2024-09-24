
package Bird;

//@author hasin

public class FlightData
{
protected String flightcode;
protected String takeoff;
protected String destination;
protected String dateofTravel;

    
    public void setFlightcode(String flightcode) {
        this.flightcode = flightcode;
    }

    public void setTakeoff(String takeoff) {
        this.takeoff = takeoff;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDateofTravel(String dateofTravel) {
        this.dateofTravel = dateofTravel;
    }

    public String getFlightcode() {
        return flightcode;
    }

    public String getTakeoff() {
        return takeoff;
    }

    public String getDestination() {
        return destination;
    }

    public String getDateofTravel() {
        return dateofTravel;
    }


public void show()
{
System.out.println("Flightcode:" + getFlightcode());
System.out.println("Takeoff:"+ getTakeoff()); 
System.out.println("Destination" + getDestination());
System.out.println("dateofTravel:"+ getDateofTravel()); 
}}