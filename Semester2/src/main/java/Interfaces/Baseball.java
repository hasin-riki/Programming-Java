
package Interfaces;

//@author hasin

public class Baseball extends Ball{

    public Baseball(String brandName) {
        super(brandName);
    }

    public void toss(){
        System.out.println("Baseball tossable");
    }
    
    
    @Override
    public void bounce(){
        System.out.println("Baseball Bounces");
    }

}
