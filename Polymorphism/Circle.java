public class Circle extends Shape{

    double radius;
    
	public Circle(){}
    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
    public double computeArea(){
        double area=Math.PI * radius * radius;
        return area;
    }
    
    public void displayInfo(){
        System.out.println("Shape Type: Circle");
        System.out.println("Class Attributes: Radius");
    }
    
}
