import java.util.Scanner;
public class Reverse{	

public static void reverse(String input){

	String revinput="";
	
	for(int i=0;i<input.length();i++){
	revinput=input.charAt(i) + revinput;}

	System.out.println(revinput);
	
}

public static void main(String[] args){

   	Scanner obj=new Scanner(System.in);

	System.out.println("Enter any String input");
	String value=obj.nextLine();

	reverse(value);
	
}

}