public class Bet
{	public static void main(String[] args)

{	int amount=0;
	int flip1=0;
	int flip2=0;

	for(int i=1; i<=1000; i++)
		
	{double betflip=Math.random();
	if(betflip>0.5)
	flip1=1;
		
	int betroll=(int)(Math.random()*6)+1;

	double coinflip=Math.random();
	if(betflip>0.5)
	flip2=1;
		
	int diceroll=(int)(Math.random()*6)+1;
		
	if(diceroll==betroll && flip1!=flip2)
	amount=amount + 10;
	else if(diceroll!=betroll && flip1==flip2)
	amount=amount - 20;
	else if(diceroll==betroll && flip1==flip2)
	amount=amount + 70;
	else if(diceroll!=betroll && flip1!=flip2)
	amount=amount - 15;}

	System.out.println("Amount won or lost after 1000 bets: " + amount);
}

}