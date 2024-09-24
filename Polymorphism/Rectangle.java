
public class Rectangle extends Shape{

    double width;
    double height;


    public Rectangle(){}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    
    public double computeArea(){
        double area=width * height;
        return area;
    }
    
    public void displayInfo(){
        System.out.println("Shape Type: Rectangle");
        System.out.println("Class Attributes: Width, Height");
    }
    
}
