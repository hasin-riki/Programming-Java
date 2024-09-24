import java.util.Scanner;
public class Divisibility

{	public static void main(String[] args)

{	Scanner obj=new Scanner(System.in);
	
	System.out.println("Enter a 5 digit number");
	
	int num=obj.nextInt();
	if(num<10000 || num>99999)
	{System.out.println("Error! Input value is not a 5 digit number!");}
	else
{
	int n1=(num/10000)%10;
	int n2=(num/1000)%10;
	int n3=(num/100)%10;
	int n4=(num/10)%10;
	int n5=num%10;
	
	int result=(n1+n2+n3+n4+n5) % n4;

	if(result==0)
	{System.out.println("True(sum of 5 digits of a five digit number is divisible by its ten digit)");}
	else
	{System.out.println("False(sum of 5 digits of a five digit number is divisible by its ten digit)");}
}
}

}