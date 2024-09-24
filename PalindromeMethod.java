import java.util.Scanner;
public class PalindromeMethod{

public static boolean palindrome(String a){

	boolean flag=false;
	
	String b=a.toLowerCase();
	String string=b.replaceAll("\\s","").replaceAll(",","").replaceAll("!","").replaceAll("'","");
	String revstring="";

	System.out.println(string);
	
	char temp=0;
	
	for(int i=string.length()-1;i>=0;i--){
	temp=string.charAt(i);
	revstring=revstring + temp;}

	System.out.println(revstring);
	
	if(string.equals(revstring)){
	flag=true;}

	return flag;
}

public static void main(String args[]){

	Scanner obj=new Scanner(System.in);

	System.out.println("Enter a sentence");
	String a=obj.nextLine();

	System.out.println(palindrome(a));
}

}