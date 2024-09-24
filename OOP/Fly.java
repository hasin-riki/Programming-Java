public class Fly {

    Boolean canFly;
    int age;

    public Fly() {
        age=1;
        setFly(false);
    }

    public Fly(Boolean canFly, int age) {
        this.canFly = canFly;
        this.age = age;
    }

    public void setFly(Boolean canFly) {
        this.canFly = canFly;
    }

    public Boolean getFly() {
        return canFly;
    }

    @Override
    public String toString() {
        return "Fly{" + "canFly=" + canFly + ", age=" + age + '}';
    }

    
    
}
