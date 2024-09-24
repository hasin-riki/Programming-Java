
package DesignPatterns;

//@author hasin

public class CarShop {

    private static CarShop carShop;
    private int carSold;
    
    private CarShop(){
        carSold=0;
    }
    
    public static CarShop getInstance(){
        if(carShop==null){
            carShop=new CarShop();
        }
        return carShop;
    }
    
    public Car sellCar(){
        carSold++;
        System.out.println("Number of cars sold: "+ carSold);
        return new Car();
    }

}
