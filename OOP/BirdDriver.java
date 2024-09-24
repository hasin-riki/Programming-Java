
public class BirdDriver {

    
    public static void main(String args[]) {
        Fly obj1=new Fly(true,2);
        Duck obj2=new Duck("puddles","white",obj1);
        
        System.out.println(obj2);
        
    }
}
