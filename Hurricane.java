import java.util.Scanner;
public class Hurricane

{	public static void main(String[] args)
  
{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter speed of wind in miles per hour.");
      	int wspeed=obj.nextInt();

	if(wspeed<30)
	{System.out.println("Given speed of wind does not qualify as HURRICANE");}
	else
	{System.out.println("Given speed of wind qualifies as HURRICANE");
	if(wspeed>=30 && wspeed<74)
	{System.out.println("This is Level 1 Hurricane.");}
	else if(wspeed>=74 && wspeed<96)
	{System.out.println("This is Level 2 Hurricane.");}
	else if(wspeed>=96 && wspeed<111)
	{System.out.println("This is Level 3 Hurricane.");}
	else if(wspeed>=111 && wspeed<131)
	{System.out.println("This is Level 4 Hurricane.");}
	else if(wspeed>=131 && wspeed<155)
	{System.out.println("This is Level 5 Hurricane.");}
	else if(wspeed>=155 && wspeed<166)
	{System.out.println("This is Level 6 Hurricane.");}
	else if(wspeed>=166)
	{System.out.println("This is Level 7 Hurricane.");}	}
}
}