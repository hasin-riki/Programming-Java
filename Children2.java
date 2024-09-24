public class Children2
{
	public static void main(String[] args)

	{	int boys=0;
		int girls=0;

	
	while(true)
	{if(boys>=1 && girls>=2 && girls>boys)
	{break;}
	
	double random=Math.random();	
	if(random<=0.5 && girls<boys)
	{continue;}
	else if(random<=0.5)
	{boys++;}
	else
	{girls++;}}

	int total=boys + girls;
	
	System.out.println("Boys : " + boys + "\nGirls : " + girls + "\nTotal : " + total);
}

}
