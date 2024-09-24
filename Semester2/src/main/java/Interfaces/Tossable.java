
package Interfaces;

//@author hasin

interface Tossable {

    default public void toss(){
        System.out.println("Object Tossable");
    }
    
    static public void toss2(){
        System.out.println("Object Tossable 2");
    }

}
