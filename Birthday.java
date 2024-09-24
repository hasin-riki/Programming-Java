import java.util.Scanner;
public class Birthday
{	public static void main(String[] args)

{   	int sum=0;
	int firstbirthdate=0;

	for(int i=1;i<=1000;i++)
	firstbirthdate=(int)(Math.random()*364);
	int people=0;
	int secondbirthdate=0;
	while(true)
	{people++;
	secondbirthdate=(int)(Math.random()*364);
	if(firstbirthdate==secondbirthdate)
	{break;}
	sum=sum+people;}

	double average=(double)sum/1000;

	System.out.println("Average Number of people entered to get one pair of matching birthday : " + average);
}

}