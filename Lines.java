import java.util.Scanner;
public class Lines
{	public static void main(String[] args)
  
{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter number of lines to be entered");
	int lines=obj.nextInt();
      	
	int count=1;

	while(count<=lines)
	
	{
	int unit=count % 10;

	if(unit==1 && count!=11)
	System.out.println("This is " + count + "st line");
	else if(unit==2 && count!=12)
	System.out.println("This is " + count + "nd line");
	else if(unit==3 && count!=13)
	System.out.println("This is " + count + "rd line");
	else
	System.out.println("This is " + count + "th line");
	
	count++;}
	
}

}




