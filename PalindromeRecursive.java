import java.util.Scanner;
public class PalindromeRecursive{

public static boolean palindrome(String input,int z,int a){
	
	if(a>z)return(true);
	return(palindrome(input,z-1,a+1) && (input.charAt(a)==input.charAt(z)));
}

public static void main(String args[]){

	Scanner obj=new Scanner(System.in);

	System.out.println("Enter a word, phrase, number or sentence");
	String a=obj.nextLine();
	String string=a.replaceAll("\\s","").replaceAll(",","").replaceAll("!","").replaceAll("'","");

	int upper=string.length()-1;
	int lower=0;

	System.out.println("Palindrome: " + palindrome(string,upper,lower));
}

}