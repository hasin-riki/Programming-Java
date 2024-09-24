
package Bird;

//@author hasin

public class Duck extends Bird {

    Fly duckFly;

    public Duck() {
        
    }

    public Duck(String name, String color, Fly duckFly) {
        super(name,color);
        this.duckFly=duckFly;
    }

    public void setDuckFly(Fly duckFly) {
        this.duckFly = duckFly;
    }

    public Fly getDuckFly() {
        return duckFly;
    }

    @Override
    public String toString() {
        return super.toString() + ", duckFly=" + duckFly + '}';
    }
    
}

