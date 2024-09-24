import java.util.Scanner;
public class Binary
{	public static void main(String[] args)

{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter any positive decimal form number");
      	int num=obj.nextInt();
	String binary="";
	
	if(num<0)
	{System.out.println("Wrong Input!");
	System.exit(0);}
	
	System.out.print("Binary representation of decimal number " + num + " is: ");

	while(true)
	{if(num==0)
	{System.out.print("0000");
	break;}
	else if(num%2==0)
	{num=num/2;
	binary="0 " + binary;}
	else if(num%2==1 && num!=1)
	{num=num/2;
	binary="1 " + binary;}
	else
	{binary="1 " + binary;
	break;}}
	
	System.out.print(binary);
}

}