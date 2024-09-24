import java.util.Scanner;
public class ArrayReverse

{	public static void main(String[] args)

{	Scanner obj=new Scanner(System.in);

	String[] array=new String[5];
	String[] revarray=new String[array.length];
	int j=revarray.length-1;

	System.out.println("Enter 5 String values");
	for(int i=0; i<array.length; i++ )
	{array[i]=obj.next();
	revarray[j]=array[i];
	j--;}

	for(int count=0; count<array.length; count++)
	{System.out.print(revarray[count] + " ");}

}

}