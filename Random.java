public class Random
	
{	public static void main(String[] args)
		
	{	int min=Integer.parseInt(args[0]), max=Integer.parseInt(args[1]), 
		range=(max-min)+1;//Giving how many numbers are in between the max and min values
		
		int random1=(int)((Math.random() * range)+min), random2=(int)((Math.random() * range)+min),
		
		random3=(int)((Math.random() * range)+min);//min is to be added so that generated value
		is above the mark of min range 
		
		int sum=random1 + random2 + random3;
		
		System.out.println("The random numbers generated between the range "+min+" and "+max+
		" are: "+random1+" "+random2+" "+random3);

		System.out.println("Sum of these random numbers is: " + sum);	}

											}
/* This method will not provide desired results for double output.
   For example if 5 is input as max value, there will be a possiblity that we can 
   get 5.something output in double which is out of range. */
											