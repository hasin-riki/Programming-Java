import java.util.Scanner;
public class SelectionSort
{	public static void main(String[] args)

{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter Size of Array");
      	int size=obj.nextInt();
	
	double[] array=new double[size];
	double temp=0;
	int min=0;
	
	System.out.print("Random :");
	for(int count=0;count<size;count++)
	{array[count]=Math.random()*10;
	System.out.print(array[count] + " ");}
	
	for(int i=0;i<size-1;i++)
	{min=i;
	{for(int j=i+1;j<size;j++)
	{if(array[j]<array[min])
	{min=j;}}
	temp=array[i];
	array[i]=array[min];
	array[min]=temp;}}

	System.out.println();
	System.out.print("Sorted :");
	for(int count=0;count<size;count++)
	{System.out.print(array[count] + " ");}
}

}
	