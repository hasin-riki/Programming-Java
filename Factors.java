import java.util.Scanner;
public class Factors
{	public static void main(String[] args)

{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter a random long number");
      	int num=obj.nextInt();

	System.out.print("Factors for " + num + "=");

	String factors="";

	while(true)
	{int count=5;
	if(num%2==0 && num!=1)
	{num=num/2;
	factors=factors + " 2";}
	else if(num%3==0 && num!=1)
	{num=num/3;
	factors=factors + " 3";}
	else
	{while(true)
	{if(num%count==0)
	{num=num/count;
	factors=factors + " " + count;
	count=5;}
	else
	{count+=2;}
	if(count>=(num+1)/2 || num==1)
	{factors=factors + " " + num;
	break;}}
	break;}}

	System.out.print(factors);
}

}
	