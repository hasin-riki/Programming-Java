import java.util.Scanner;
public class NotAlone
{	public static void main(String[] args)

{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter Size of Array");
      	int size=obj.nextInt();
	int[] array=new int[size];
	
	System.out.println("Enter Random Numbers");
	for(int count=0;count<size;count++)
	{array[count]=obj.nextInt();}

	for(int i=1;i<size-1;i++)
	{if(array[i-1]>array[i] && array[i-1]>array[i+1])
	{array[i]=array[i-1];}
	else if(array[i+1]>array[i])
	{array[i]=array[i+1];}}

	for(int j=0;j<size;j++)
	{System.out.print(array[j] + " ");}

}

}
	