import java.util.Scanner;
public class Palindrome
{	public static void main(String[] args)
  
{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter any number, word or a phrase");
	String input=obj.nextLine();

	String string=input.replaceAll("\\s","").replaceAll(",","");
	String revstring="";
	String string2="";
	char a=0;
	
	for(int i=0;i<string.length();i++)
	{a=Character.toLowerCase(string.charAt(i));
	string2=string2 + a;}
	
	for(int i=string.length()-1;i>=0;i--)
	{a=string2.charAt(i);
	
	if(a>=65 && a<=90)
	{a=Character.toLowerCase(a);}

	revstring=revstring + a;}

	Boolean result=false;
	result= string2.equals(revstring);

	System.out.println(result);


}

}