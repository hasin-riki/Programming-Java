
public class Bird {

    String name;
    String color;

    public Bird() {
        name="Unknown";
        color="Unknown";
    }

    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bird{" + "name=" + name + ", color=" + color + '}';
    }
    
}
