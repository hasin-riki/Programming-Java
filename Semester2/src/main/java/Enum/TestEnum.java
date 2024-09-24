
package Enum;

//@author hasin

public class TestEnum{

    public static void main(String[] args){
    
        Wavelength a=Wavelength.MICROWAVE;
        System.out.println(a);
        
        Wavelength b=Wavelength.XRAY;
        System.out.println(b);
        
        System.out.println(Wavelength.ULTRAVIOLET.getValue());
        
        Wavelength[] c=Wavelength.values();
        for(int i=0; i<c.length; i++){
        System.out.println(c[i]);
    
        System.out.println(c[i].ordinal());}
    }

}
