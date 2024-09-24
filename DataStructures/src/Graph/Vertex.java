package Graph;
/**
 *
 * @author Hasin
 */
class Vertex{
    String name;
    int age;
    boolean flag;
    
    Linkedlist friendsList=new Linkedlist();

    public Vertex(String name, int age) {
        this.name = name;
        this.age = age;
        this.flag=false;
    }
    
    @Override
    public String toString(){
        return "Name:" + name + " Age:" + age;
    }
}
