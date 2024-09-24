public class Duck extends Bird {

    Fly duckFly;

    public Duck() {
        
    }

    public Duck(String name, String color, Fly duckFly) {
        this.name = name;
        this.color = color;
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
        return "Duck{" + "name=" + name + ", color=" + color + ", duckFly=" + duckFly + '}';
    }
    
}
