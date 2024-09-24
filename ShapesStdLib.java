import java.util.Scanner;
public class ShapesStdLib{
      
public static void main(String[] args){
           
	Scanner obj=new Scanner(System.in);
	
	System.out.println("Enter x value for shapes");
	double x=obj.nextDouble();
	
	System.out.println("Enter y value for shapes");
	double y=obj.nextDouble();

	System.out.println("Enter radius value for circles");
	double rad=obj.nextDouble();
	
	System.out.println(circle(x,y,rad));
	System.out.println(filledcircle(x,y,rad));

	System.out.println("Enter half length for square");
	double halflen=obj.nextDouble();

	System.out.println(square(x,y,halflen));

	System.out.println("Enter half length for rectangle");
	double halfwidth=obj.nextDouble();

	System.out.println(square(x,y,halfwidth,halflen));	
}
   
}