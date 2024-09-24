import java.util.Scanner;
public class SevePerLine2
{	public static void main(String[] args)
  
{   	Scanner obj=new Scanner(System.in);
      
      	int count=1;

	while(count<=101)
	{if(count%7==0)
	{System.out.println(count + " ");}
	else
	{System.out.print(count + " ");}
	
	count++;}
	
}

}