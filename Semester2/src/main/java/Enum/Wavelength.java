
package Enum;

//@author hasin

public enum Wavelength {

    MICROWAVE(10), XRAY(20), ULTRAVIOLET(30), GAMMA(40);
    private int value;
    
private Wavelength(int value){
    this.value=value;
    System.out.println("1");
}    

public int getValue(){
    return value;
}
}

