import java.util.Scanner;
public class UniqueString
{	public static void main(String[] args)
  
{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter string input");
	String input=obj.nextLine();

	String string=input.toLowerCase();
	System.out.println(string);

	int[] array=new int[26];
	int unicount=0;

	for(int i=0;i<string.length();i++)
	{if(string.charAt(i)>='a' && string.charAt(i)<='z')
	{array[(int)string.charAt(i)-97]=(array[(int)string.charAt(i)-97])+1;}}

	for(int j=0;j<string.length();j++)
	{System.out.println("Count of Character " + (char)(j+97) + " is =" + array[j]);}

	for(int k=0;k<string.length();k++)
	{if(array[k]>=1)
	{unicount++;}}

	System.out.println(unicount);
	
}

}