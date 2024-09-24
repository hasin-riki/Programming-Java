import java.util.Scanner;
public class ArrayInsertion

{	public static void main(String[] args)

{	Scanner obj=new Scanner(System.in);

	int[] array=new int[args.length];
	int[] newarray=new int[args.length];

	for(int i=0; i<array.length; i++)
	{array[i]=Integer.parseInt(args[i]);}

	System.out.println("Enter Location of value to be inserted between numbers 0 to " + (array.length-1));
	int location=obj.nextInt();
	System.out.println("Enter the value");
	int value=obj.nextInt();

	for(int i=0; i<newarray.length; i++)
	{newarray[location]=value;
	if(i==location)
	{continue;}
	else
	{newarray[i]=array[i];}}		

	for(int j=0;j<array.length;j++)
	{System.out.print(array[j] + " ");}
	System.out.println();

	for(int j=0;j<newarray.length;j++)
	{System.out.print(newarray[j] + " ");}
}

}