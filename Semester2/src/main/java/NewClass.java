
//@author hasin

public class NewClass {

    public static void main(String[] args){
    
    }
    int a;
    String b;

    public NewClass() {
        System.out.println("a");
    }

    

    public NewClass(int a) {
        this.a = a;
        System.out.println("b");
    }

    
    //Overloading methods
    public void get(int a, String b){}
    public void get(String b, int a){}
    public void get(String a, int b, int c){}
    
    public void compute(int a){
        this.a=a*a;
        
    }
}
