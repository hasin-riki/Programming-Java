import java.util.Scanner;
public class Factorial2
{	public static void main(String[] args)

{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter a positive integer for calculation of its factorial");
      	int num=obj.nextInt();
	int factorial=1;
	int count=1;
	
	if(num<0)
	{System.out.println("Wrong Input.Factorial of negative integer is not possible.");
	System.exit(0);}
	else
	{do{count++;
	factorial=factorial*count;}
	while(count<num);}

	System.out.println(num + "!=" + factorial);
}

}