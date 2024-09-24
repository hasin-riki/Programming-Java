import java.util.Scanner;
public class Alphanumeric
{	public static void main(String[] args)
  
{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter a 5-character Password");
      	String password=obj.next();

	int lenpassword=password.length();
	
	if(lenpassword != 5)
	{System.out.println("Error! Password out of range.");}
	else
	{char a=password.charAt(0);
	char b=password.charAt(1);
	char c=password.charAt(2);
	char d=password.charAt(3);
	char e=password.charAt(4);
	if(a>=48 && a<=57 && b>=48 && b<=57 && c>=48 && c<=57 && d>=48 && d<=57 && e>=48 && e<=57)
	{System.out.println("Password contains only numbers");}
	else if((a>=65 && a<=90 || a>=97 && a<=122) && (b>=65 && b<=90 || b>=97 && b<=122) && (c>=65 && c<=90 || c>=97 && c<=122) &&
 		(d>=60 && d<=90 || d>=97 && d<=122) && (e>=65 && e<=90 || e>=97 && e<=122))
	{System.out.println("Password contains only letters");}
	else
	{System.out.println("Illegal Input!");}
}	
}
}