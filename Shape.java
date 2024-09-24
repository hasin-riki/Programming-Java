import java.util.Scanner;
public class Shape
{	public static void main(String[] args)

{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter number of rows and columns for triangle");
      	int num=obj.nextInt();

	for(int i=1;i<=num;i++)
	{for(int j=1;j<=num;j++)
	{if(j%2==1)
	{System.out.print("*");}
	else
	{System.out.print(".");}}
	System.out.println();}
}

}