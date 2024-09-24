public class CoinFlips
{
	public static void main(String[] args)

	{	double ascore=0;
		double bscore=0;
		
		for(int i=1; i<=1000; i++)
		{double aflip1=Math.random();
		double aflip2=Math.random();
		double bflip1=Math.random();
		double bflip2=Math.random();

		if(aflip1<=0.5 && aflip2<=0.5)
		ascore++;

		if(bflip1<=0.5 && bflip2>0.5)
		bscore++;}

		double probability=ascore/bscore;
	
		System.out.println("Alice to Bob score probability is : " + probability);	}
													} 
//considering 0-0.5 as heads and 0.5 to 1.0 tails