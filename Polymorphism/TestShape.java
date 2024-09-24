
public class TestShape {

    public static void main(String args[]) {
        
        Shape obj[]=new Shape[4];
        obj[0]=new Rectangle();
        obj[1]=new Rectangle(2,3);
        obj[2]=new Circle();
        obj[3]=new Circle(4);
        
        ((Rectangle)obj[0]).setWidth(4);
        ((Rectangle)obj[0]).setHeight(5);
        for(int i=0;i<obj.length;i++){
            System.out.println("Area: " + obj[i].computeArea());
            obj[i].displayInfo();
            System.out.println();
        }
    }
}
