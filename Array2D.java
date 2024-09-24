import java.util.Scanner;
public class Array2D
{	public static void main(String[] args)

{   	Scanner obj=new Scanner(System.in);
	String[][] array=new String[8][10];
	String[] key=new String[10];
	int correctanswers=0;

	for(int count=0;count<key.length;count++)
	{key[count]=args[count];}

	for(int i=0;i<array.length;i++)
	{for(int j=0;j<array[0].length;j++)
	{array[i][j]=obj.next();
	if(array[i][j].equals(key[i]))
	{correctanswers++;}}}

	System.out.println(correctanswers);
}
}