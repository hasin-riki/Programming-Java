public class ArrayEvenOdd

{	public static void main(String[] args)

{	Integer[] array=new Integer[args.length];
	
	int sumeven=0;
	int sumodd=0;
	int even2=0;
	int odd2=0;
	
	for(int x=0; x<array.length; x++)
	{array[x]=Integer.parseInt(args[x]);
	if(array[x]%2==0)
	{even2++;}
	else
	{odd2++;}}
	Integer[] even=new Integer[even2];
	Integer[] odd=new Integer[odd2];

	even2=0;
	odd2=0;
	
	for(int y=0; y<array.length; y++)
	{if(array[y]%2==0)
	{even[even2]=array[y];
	sumeven=sumeven+array[y];
	even2++;}
	else
	{odd[odd2]=array[y];
	sumodd=sumodd+array[y];
	odd2++;}}

	double avgeven=(double)sumeven/even.length;
	double avgodd=(double)sumodd/odd.length;

	System.out.println("Average of Even Numbers: " + avgeven + "\nAverage of Odd Numbers: " + avgodd);
}

}