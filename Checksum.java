import java.util.Scanner;
public class Checksum
{	public static void main(String[] args)
{	Scanner obj=new Scanner(System.in);
	
	System.out.println("Enter the 9 digit code for evaluation of checksum value.");
	
	String value= obj.nextLine();
	int code=Integer.parseInt(value);
	int length=value.length();
	
	if(length != 9)
	{System.out.println("Error!\tValue input is incorrect");}
	else
	{int num1=(code/100000000)%10;
	 int num2=(code/10000000)%10;
	 int num3=(code/1000000)%10;
	 int num4=(code/100000)%10;
	 int num5=(code/10000)%10;
	 int num6=(code/1000)%10;
	 int num7=(code/100)%10;
	 int num8=(code/10)%10;
	 int num9=code%10;
	 
	 String result="";
	 
	 int checksum=11 - ((num1*10+num2*9+num3*8+num4*7+num5*6+num6*5+num7*4+num8*3+num9*2) % 11);
	 
	if(checksum==10)
	{result=value + "X";}
	 else
	{result=value+checksum;}
	
	System.out.println("The ISBN value for entered code is: " + result);}
}}