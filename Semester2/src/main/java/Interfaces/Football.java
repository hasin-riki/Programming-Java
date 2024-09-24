
package Interfaces;

//@author hasin

public class Football extends Ball{

    public Football(String brandName) {
        super(brandName);
    }

    public void toss(){
        System.out.println("Football tossable");
    }
    
    @Override
    public void bounce(){
        System.out.println("Football Bounces");
    }

}
