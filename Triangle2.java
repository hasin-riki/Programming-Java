import java.util.Scanner;
public class Triangle2
{
  
  public static void main(String[] args)
  {   	Scanner in=new Scanner(System.in);
      	System.out.println("Enter the 3 lengths of a triangle");
      	double a=in.nextDouble();
      	double b=in.nextDouble();
	double c=in.nextDouble();

	double s=(a+b+c)/2;
	double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));

	String type="Scalene Triangle";

	if(a==b && b==c)
	{type="Equilateral Triangle";}
	if((a==b && b!=c) || (a!=b && b==c) || (a==c && b!=a))
	{type="Isosceles Triangle";}
	
	System.out.println("This is a " + type);
	System.out.println("Its Area is " + area);

							}
								}
	