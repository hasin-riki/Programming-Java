public class RollLoadedDie

{	public static void main(String[] args)

{	double range=Math.random();

	double prob=(double)1/3;

	int result=0;
	
	if(range>0 && range<=prob)
	{result=(int)((Math.random() * 4) + 1);}
	else
	{result=(int)((Math.random() * 2) + 5);}

	System.out.println("Rolled Dice value received is: " + result);

}

}