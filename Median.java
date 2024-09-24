import java.util.Scanner;
public class Median

{	public static void main(String[] args)

{	Scanner obj=new Scanner(System.in);

	System.out.println("Enter 4 random numbers");

	int num1=obj.nextInt();
	int num2=obj.nextInt();
	int num3=obj.nextInt();
	int num4=obj.nextInt();

	int max=Math.max(Math.max(Math.max(num1,num2),num3),num4);
	int min=Math.min(Math.min(Math.min(num1,num2),num3),num4);

	double median=(double)((num1+num2+num3+num4)-(max+min))/2;

	if(median % 1 == 0)
	{System.out.println("The median for input 4 numbers is : " + (int)median);}
	else
	{System.out.println("The median for input 4 numbers is : " + median);}
	

}

}