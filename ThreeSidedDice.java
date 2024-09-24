public class ThreeSidedDice
{	public static void main(String[] args)
  
{   	int dicea=0;
	int diceb=0;
	int dicec=0;

	for(int count=1;count<=1000;count++)
	{int scorea=0;
	int scoreb=0;
	int scorec=0;
	double prob1=(double)1/3;
	double prob2=(double)2/3;
	
	double score1=Math.random();
	if(score1<=prob1)
	{scorea=2;}
	else if(score1>prob1 && score1<=prob2)
	{scorea=6;}
	else
	{scorea=7;}
	
	double score2=Math.random();
	if(score2<=prob1)
	{scoreb=1;}
	else if(score2>prob1 && score2<=prob2)
	{scoreb=5;}
	else
	{scoreb=9;}

	double score3=Math.random();
	if(score3<=prob1)
	{scorec=3;}
	else if(score3>prob1 && score3<=prob2)
	{scorec=4;}
	else
	{scorec=8;}

	if(scorea>scoreb && scorea>scorec)
	dicea++;
	else if(scoreb>scorea && scoreb>scorec)
	diceb++;
	else if(scorec>scorea && scorec>scoreb)
	dicec++;}

	System.out.println("Wins by dice A: " + dicea + "\nWins by dice B: " + diceb + "\nWins by dice C: " + dicec);
	
	int highest=Math.max(Math.max(dicea,diceb),dicec);
	if(highest==dicea && highest!=diceb && highest!=dicec)
	System.out.println("I would choose Dice A");
	else if(highest==diceb && highest!=dicea && highest!=dicec)
	System.out.println("I would choose Dice B");
	else if(highest==dicec && highest!=dicea && highest!=diceb)
	System.out.println("I would choose Dice C");
	else if(highest==dicea && highest==diceb && highest!=dicec)
	System.out.println("I would choose Dice A or Dice B");
	else if(highest==dicea && highest==dicec && highest!=diceb)
	System.out.println("I would choose Dice A or Dice C");
	else if(highest==diceb && highest==dicec && highest!=dicea)
	System.out.println("I would choose Dice B or Dice C");
	else
	System.out.println("I would choose a random Dice");
}

}
	 
	
	
	
	