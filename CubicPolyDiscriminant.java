import java.util.Scanner;
public class CubicPolyDiscriminant

{	public static void main(String[] args)

{	Scanner obj=new Scanner(System.in);

	System.out.println("Enter coefficient 'a' of Cubic Polynomial");
	
	int a=obj.nextInt();
	
	System.out.println("Enter coefficient 'b' of Cubic Polynomial");
	
	int b=obj.nextInt();

	System.out.println("Enter coefficient 'c' of Cubic Polynomial");
	
	int c=obj.nextInt();

	System.out.println("Enter coefficient 'd' of Cubic Polynomial");
	
	int d=obj.nextInt();

	double discriminant=Math.pow(b,2)*Math.pow(c,2)-4*a*Math.pow(c,3)-4*d*Math.pow(b,3)-27*Math.pow(a,2)*Math.pow(d,2)+18*a*b*c*d;
	
	System.out.println((int)discriminant + "(Discriminant for input values of Cubic Polynomial)");
}

}