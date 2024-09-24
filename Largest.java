import java.util.Scanner;
public class Largest

{	public static void main(String[] args)
  
{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter 3 random numbers");
      	
	int num1=obj.nextInt();
	int num2=obj.nextInt();
	int num3=obj.nextInt();

	int largest=num1;
	
	if(largest<num2)
	{largest=num2;}
	
	if(largest<num3)
	{largest=num3;}

	System.out.println("Largest among the 3 input numbers: " + largest);
}

}

	