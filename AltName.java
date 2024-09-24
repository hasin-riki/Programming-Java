import java.util.Scanner;
public class AltName
{	public static void main(String[] args)
  
{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter Your First Name");
      	String name=obj.next();

	char a=name.charAt(0);
	char b=name.charAt(1);
	char c=name.charAt(2);
	char d=name.charAt(3);
	char e=name.charAt(4);
	
	if(a>=97 && a<=122)
	{a=Character.toUpperCase(name.charAt(0));
	b=Character.toLowerCase(name.charAt(1));
	c=Character.toUpperCase(name.charAt(2));
	d=Character.toLowerCase(name.charAt(3));
	e=Character.toUpperCase(name.charAt(4));}
	else
	{a=Character.toLowerCase(name.charAt(0));
	b=Character.toUpperCase(name.charAt(1));
	c=Character.toLowerCase(name.charAt(2));
	d=Character.toUpperCase(name.charAt(3));
	e=Character.toLowerCase(name.charAt(4));}
	
	name="" + a + b + c + d + e;

	System.out.println(name);
}

}