import java.util.Scanner;
public class Triangle
{
  
  public static void main(String[] args)
  {   	Scanner in=new Scanner(System.in);
      	System.out.println("Enter the 3 lengths of a triangle");
      	double len1=in.nextDouble();
      	double len2=in.nextDouble();
	double len3=in.nextDouble();

	double s=(len1+len2+len3)/2;
	double area=Math.sqrt(s*(s-len1)*(s-len2)*(s-len3));

	String type="Scalene Triangle";

	if (len1==len2 && len2==len3)
	{type="Equilateral Triangle";}
	else if(len1==len2 || len2==len3 || len1==len3)
	{type="Isosceles Triangle";}
	
	System.out.println("This is a " + type);
	System.out.println("Its Area is " + area);

							}
								}
	