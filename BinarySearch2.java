import java.util.Scanner;
public class BinarySearch2
{	public static void main(String[] args)

{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter Size of Array");
      	int size=obj.nextInt();
	
	Integer[] array=new Integer[size];

	array[0]=(int)(Math.random()*20)+1;

	int i=1;

	while(i<size)
	{int random=(int)(Math.random()*20)+1;
	if(random>=array[i-1])
	{array[i]=random;
	i++;}}
	
	for(int j=0;j<size;j++)
	{System.out.print(array[j] + " ");}

	System.out.println();
	System.out.println("Enter Number to be Searched between range 1-20");
	int num=obj.nextInt();

	int mid=0;
	int max=size-1;
	int min=0;

	while(true)
	{mid=Math.round((max+min)/2);
	if(min>max)
	{System.out.println("Number does not exist in the array");
	break;}
	else if(array[mid]==num)
	{System.out.println("Number is present in the array");
	break;}
	else if(num>array[mid])
	{min=mid+1;}
	else
	{max=mid-1;}}
	
}

}