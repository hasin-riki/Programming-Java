
package Interfaces;

//@author hasin

public class Ball implements Tossable{

    String brandName;

    public Ball(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }
    
    public void bounce(){
        System.out.println("Ball Bounces");
    }
    
    static public void toss2(){
        System.out.println("Ball Tossable 2");
    }

}
