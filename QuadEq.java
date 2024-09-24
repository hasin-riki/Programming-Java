public class QuadEq
	{	public static void main(String[] args)
		{	int a=Integer.parseInt(args[0]), b=Integer.parseInt(args[1]), c=Integer.parseInt(args[2]);

			double d=Math.pow(b,2), e=d-(4*a*c), f=Math.sqrt(e), g=-b + f, h=-b-f;			

			double x1=g/(2*a);

			double x2=h/(2*a);

			System.out.println("Roots for provided values of quadratic equation are: " + x1 + " " + x2);

		}
	
	}