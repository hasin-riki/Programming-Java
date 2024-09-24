public class Sorting
	{	public static void main(String[] args)
		{	int a=Integer.parseInt(args[0]), b=Integer.parseInt(args[1]), c=Integer.parseInt(args[2]);

			int max=Math.max(Math.max(a,b),c), min=Math.min(Math.min(a,b),c);
			int mid=a+b+c-(max+min);	

				
			System.out.println("Numbers in Ascending order: " + min + " " + mid + " " + max);
			System.out.println("Numbers in Descending order: " + max + " " + mid + " " + min);	}
															}