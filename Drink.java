import java.util.Scanner;
public class Drink
{	public static void main(String[] args)

{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter Number of Guests");
      	int guests=obj.nextInt();
	int originaldrink=0;
	int simulations=1000;

	int[] guestdrink=new int[guests];
	int[] randomdrink=new int[guests];

	for(int j=1;j<=simulations;j++)
	{for(int count=0;count<guests;count++)
	{guestdrink[count]=count+1;
	randomdrink[count]=(int)(Math.random()*guests)+1;
	if(guestdrink[count]==randomdrink[count])
	{originaldrink++;
	break;}}}
	
	double result=(double)originaldrink/simulations;
	System.out.println("Ratio of At least one guest gets original drink to number of simulations : " + result);
}

}

//Chances of at least one guest getting their original drink is around 0.6 in every case.