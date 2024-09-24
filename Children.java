public class Children
{
	public static void main(String[] args)

	{	int boys=0;
		int girls=0;

	
	while(true)
	{if((boys>=2 && girls>=1) || (boys>=1 && girls>=3))
	{break;}
	
	if(Math.random()<=0.5)
	{boys++;}
	else
	{girls++;}}

	int total=boys + girls;
	
	System.out.println("Boys : " + boys + "\nGirls : " + girls + "\nTotal : " + total);
}

}
