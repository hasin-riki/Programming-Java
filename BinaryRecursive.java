import java.util.Scanner;
public class BinaryRecursive{

public static String binary(int num){

	String result="";
	
	if(num==0)
	{return "0 0 0 0";}
	else if(num%2==0)
	{return result=binary(num/2) + "0 " + result;}
	else if(num%2==1 && num!=1)
	{return result=binary((num-1)/2) + "1 " + result;}
	else
	{return result="1 " + result;}
		

}

public static void main(String args[]){

	Scanner obj=new Scanner(System.in);

	System.out.println("Enter any decimal number");
	int input=obj.nextInt();
	
	System.out.println("Binary: " + binary(input));
}

}