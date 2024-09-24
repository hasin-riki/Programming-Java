import java.util.Scanner;
public class Lottery
{
	public static void main(String[] args)

	{	Scanner in=new Scanner(System.in);

		int lotterynum=(int)((Math.random()*901)+100);

		int l1=(lotterynum/100)%10;
		int l2=(lotterynum/10)%10;
		int l3=lotterynum%10;

		System.out.println("Guess the Lottery number! \nNote:The Lottery number is a 3 digit number");

		int guessnum=in.nextInt();

		int g1=(guessnum/100)%10;
		int g2=(guessnum/10)%10;
		int g3=guessnum%10;

		int prize=0;
		String outmsg="";

		if(guessnum<100 || guessnum>999)
		{System.out.println("Error!! Your input number is out of range!");}
		else
		{if(lotterynum==guessnum)
		{prize=10000;}
		else if(l1==g1 && l2==g3 && l3==g2 ||
			l1==g2 && l2==g3 && l3==g1 ||
			l1==g2 && l2==g1 && l3==g3 ||
			l1==g3 && l2==g1 && l3==g2 ||
			l1==g3 && l2==g2 && l3==g1)
		{prize=3000;}
		else if(l1==g1 || l1==g2 || l1==g3 || l2==g1 || l2==g2 || l2==g3 || l3==g1 || l3==g2 || l3==g3)
		{prize=1000;}

		if(prize!=0)
		{outmsg="Congratulations! You have won $" + prize + "!";}
		else
		{outmsg="Sorry!\nBetter Luck next Time!";}
		
		System.out.println("The guess number you have input: " + guessnum + 
				   "\nThe lottery number was: " + lotterynum +
				   "\n" + outmsg);}
}

}
