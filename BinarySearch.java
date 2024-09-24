import java.util.Scanner;
public class BinarySearch
{	public static void main(String[] args)

{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter Size of Array");
      	int size=obj.nextInt();
	
	Integer[] array=new Integer[size];

	for(int i=0;i<array.length;i++)
	{array[i]=i;}
	
	System.out.println("Enter Number to be Searched in the range from 1 - " + size);
	int num=obj.nextInt();

	if(num<1 || num>size)
	{System.out.println("Number out of range");
	System.exit(0);}
	
	int iterations=1;
	int mid=0;
	int max=size-1;
	int min=0;

	while(true)
	{mid=(int)(max+min)/2;
	System.out.println(mid);
	if(max==min)
	{System.out.println("Number does not exist in the array");
	break;}
	else if(array[mid]==num)
	{System.out.println(iterations);
	break;}
	else if(num>array[mid])
	{min=mid+1;}
	else
	{max=mid-1;}
	iterations++;}

}

}
	