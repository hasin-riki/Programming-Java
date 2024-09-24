
package Interfaces;

//@author hasin

public class Pair <A,B>{

    private final A first;
    private final B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" + "first=" + first + ", second=" + second + '}';
    }
    
    public static void main(String[] args){
       
        Pair obj=new Pair('a',20.324);
        System.out.println(obj);
    }

}
