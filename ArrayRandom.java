import java.util.Scanner;
public class ArrayRandom
{	public static void main(String[] args)

{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter Size of Array");
      	int size=obj.nextInt();
	
	int[] array=new int[size];

	array[0]=(int)(Math.random()*20)+1;

	int i=1;

	while(i<size)
	{int random=(int)(Math.random()*20)+1;
	if(random>=array[i-1])
	{array[i]=random;
	i++;}}
	
	for(int j=0;j<size;j++)
	{System.out.print(array[j] + " ");}
	
}

}