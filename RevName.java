import java.util.Scanner;
public class RevName
{	public static void main(String[] args)
  
{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter Your First Name");
      	String name=obj.next();

	char a=Character.toLowerCase(name.charAt(0));
	char b=name.charAt(1);
	char c=name.charAt(2);
	char d=name.charAt(3);
	char e=Character.toUpperCase(name.charAt(4));

	String revname="" + e + d + c + b + a;

	System.out.println(revname);
}

}