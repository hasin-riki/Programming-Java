import java.util.Scanner;
public class ArrayDelete

{	public static void main(String[] args)

{	Scanner obj=new Scanner(System.in);

	int[] array=new int[args.length];
	
	int values=0;
	int count=0;

	for(int i=0; i<array.length; i++)
	{array[i]=Integer.parseInt(args[i]);}
	
	for(int j=0;j<array.length;j++)
	{System.out.print(array[j] + " ");}
	System.out.println();

	System.out.println("Enter the value to be deleted");
	int value=obj.nextInt();

	for(int j=0;j<array.length;j++)
	{if(array[j]==value)
	{values++;}}

	int[] newarray=new int[array.length-values];

	for(int i=0; i<array.length; i++)
	{if(array[i]==value)
	{continue;}
	else
	{newarray[count]=array[i];
	count++;}}
	
	for(int y=0;y<newarray.length;y++)
	{System.out.print(newarray[y] + " ");}
}

}