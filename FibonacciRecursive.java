import java.util.Scanner;
public class FibonacciRecursive{

public static void fibonacci(String f0,String f1,int i,int len){

	if(i<len){
	String f2=f0+f1;
	f0=f1;
	f1=f2;
	System.out.println(f2);
	fibonacci(f0,f1,i+1,len);}
		

}

public static void main(String args[]){

	Scanner obj=new Scanner(System.in);

	System.out.println("Enter a letter or a number");
	String input1=obj.next();
	
	System.out.println("Enter another letter or a number");
	String input2=obj.next();

	System.out.println("Enter length of Fibonacci sequence");
	int length=obj.nextInt();
	int lower=0;
	
	fibonacci(input1,input2,lower,length);
}

}