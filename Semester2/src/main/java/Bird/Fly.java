
package Bird;

//@author hasin

public class Fly {

    boolean canFly;
    int age;

    public Fly() {
        age=1;
        setFly(false);
    }

    public Fly(boolean canFly, int age) {
        this.canFly = canFly;
        this.age = age;
    }

    public void setFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean getFly() {
        return canFly;
    }

    @Override
    public String toString() {
        return "Fly{" + "canFly=" + canFly + ", age=" + age + '}';
    }

    
    
}

