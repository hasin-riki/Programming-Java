public class ArrayOdd

{	public static void main(String[] args)

{	int odd=0;
	int sum=0;
	int[] array=new int[args.length];
	
	for(int count=0;count<args.length;count++)
	{array[count]=Integer.parseInt(args[count]);
	if(array[count]%2==1)
	{odd++;
	sum=sum+array[count];}}
	
	System.out.println("Number of odd numbers: " + odd + "\nSum of odd numbers: " + sum);
}

}