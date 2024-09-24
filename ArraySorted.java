import java.util.Scanner;
public class ArraySorted
{	public static void main(String[] args)

{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter number of real numbers to be checked");
      	int num=obj.nextInt();
	double[] array=new double[num];
	boolean flag=true;
	
	System.out.println("Enter the numbers");
	for(int i=0;i<array.length;i++)
	{array[i]=obj.nextDouble();}
	
	for(int j=0;j<array.length-1;j++)
	{if(array.length==1)
	{break;}
	else if(array[j+1]<array[j])
	{flag=false;}}
	
	System.out.println(flag);
}

}