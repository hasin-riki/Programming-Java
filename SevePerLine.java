import java.util.Scanner;
public class SevePerLine
{	public static void main(String[] args)
  
{   	Scanner obj=new Scanner(System.in);
      
      	for(int count=1; count<=101; count++)
	{if(count%5==0)
	{System.out.println(count + " ");}
	else
	{System.out.print(count + " ");}}
	
}

}