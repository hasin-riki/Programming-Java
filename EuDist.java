public class EuDist

{	public static void main(String[] args)

	{	double x0= Double.parseDouble(args[0]), y0= Double.parseDouble(args[1]),
		       x1= Double.parseDouble(args[2]), y1= Double.parseDouble(args[3]);

		double diff1=x1-x0, diff2=y1-y0;
		
		double sqr1=Math.pow(diff1,2), sqr2=Math.pow(diff2,2);
		
		double sum=sqr1 + sqr2;

		double dist=Math.sqrt(sum);
		
		System.out.println("The distance of two coordinates is " + (int)dist);	}

												}
/* Testing: (x0=2,y0=4) and (x1=6,y1=-10)
   Formula to find distance is Math.sqrt(Math.pow(x1-x0)+Math.pow(y1-y0))
   Solving manually distance we get is = 14.56
   Runing program we are getting answer '14' as int value is asked of it  */

		