public class ArrayBelowAverage

{	public static void main(String[] args)

{	Integer[] array=new Integer[args.length];
	double sum=0;
	int belavg=0;

	for(int i=0; i<array.length; i++)
	{array[i]=Integer.parseInt(args[i]);
	sum=sum + array[i];}

	double average=(double)sum/array.length;

	for(int j=0; j<array.length; j++)
	{if(array[j]<average)
	belavg++;}

	System.out.println("Average: " + average + "\nValues Below Average: " + belavg);
}

}