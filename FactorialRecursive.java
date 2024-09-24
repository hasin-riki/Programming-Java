import java.util.Scanner;
public class FactorialRecursive{

public static int factorial(int num){

	int result=num;
	if(num==0){
	return 1;}
	else{
	return result=result*factorial(num-1);}
		

}

public static void main(String args[]){

	Scanner obj=new Scanner(System.in);

	System.out.println("Enter positive integer for calculation of factorial");
	int input=obj.nextInt();
	
	System.out.println(input + "!=" + factorial(input));
}

}