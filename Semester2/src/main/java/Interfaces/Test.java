
package Interfaces;

//@author hasin

public class Test {

    public static void main(String[] args){
    
        Rock obj1=new Rock();
        obj1.toss();
        System.out.println();
        
        Ball obj2=new Ball("Nike");
        obj2.toss();
        Ball.toss2();
        System.out.println();
        
        Baseball obj3=new Baseball("Puma");
        obj3.toss();
        Baseball.toss2();
        obj3.bounce();
        System.out.println();
        
        Football obj4=new Football("Adidas");
        obj4.toss();
        Football.toss2();
        obj4.bounce();
    }

}
