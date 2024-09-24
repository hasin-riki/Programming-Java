import java.util.Scanner;
public class Geometric
{	public static void main(String[] args)

{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter common ratio 'r' of a geometric progression");
      	double r=obj.nextDouble();
	System.out.println("Enter number of terms 'n' of a geometric progression");
      	int n=obj.nextInt();
	
	double gsum=1;

	for(int i=1;i<n;i++)
	{gsum=gsum + Math.pow(r,i);}

	System.out.println("Geometric sum: " + (int)gsum);
}

}