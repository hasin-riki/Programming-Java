import java.util.Scanner;
public class Consecutive1
{	public static void main(String[] args)

{   	Scanner obj=new Scanner(System.in);
	System.out.println("Enter size of array");
	int size=obj.nextInt();
	
	int[] array=new int[size];
	int count=0;
	int max=0;

	for(int i=0;i<size;i++){
	array[i]=(int)(Math.random()*2);}

	for(int i=0;i<size;i++){
	if(array[i]==1)
	{count++;
	if(count>max)
	{max=count;}}
	else
	{count=0;}}

	for(int i=0;i<size;i++)
	{System.out.print(array[i] + " ");}
	System.out.println();

	System.out.println("Most Consecutive 1's : " + max);

}

}