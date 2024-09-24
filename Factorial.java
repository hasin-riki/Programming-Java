import java.util.Scanner;
public class Factorial
{	public static void main(String[] args)

{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter a positive integer for calculation of its factorial");
      	int num=obj.nextInt();
	int factorial=1;
	
	if(num<0)
	{System.out.println("Wrong Input.Factorial of negative integer is not possible.");
	System.exit(0);}
	else{for(int count=1;count<=num;count++)
	{factorial=factorial*count;}}

	System.out.println(num + "!=" + factorial);
}

}