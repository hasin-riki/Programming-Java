import java.util.Scanner;
public class NumPermute
{	public static void main(String[] args)
  
{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter Your First Name");
      	String name=obj.next();

	int random1=(int)(Math.random() * 5);
	char a=name.charAt(random1);

	int random2=(int)(Math.random() * 5);
	
	while(random1 == random2)
	{random2=(int)(Math.random() * 5);}
	char b=name.charAt(random2);
	
	int random3=(int)(Math.random() * 5);
	
	while(random2==random3 || random1==random3)
	{random3=(int)(Math.random() * 5);}
	char c=name.charAt(random3);
	
	int random4=(int)(Math.random() * 5);;
	
	while(random3==random4 || random2==random4 || random1==random4)
	{random4=(int)(Math.random() * 5);}
	char d=name.charAt(random4);
	
	int random5=(int)(Math.random() * 5);;
	
	while(random4==random5 || random3==random5 || random2==random5 || random1==random5)
	{random5=(int)(Math.random() * 5);}
	char e=name.charAt(random5);

	name=""+ a + b + c + d + e;

	System.out.println(name);
}
}
	
	