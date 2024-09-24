import java.util.Scanner;
public class FibonacciQuiz{

public static void fibonacci(int f0,int f1,int n){

	int f2=0;
	int i=0;
	System.out.print(f0 + ",");
	System.out.print(f1 + ",");
	for(i=0;i<n;i++){
	f2=f0+f1;
	if(i==n-1){
	System.out.print(f2);}
	else{
	System.out.print(f2 + ",");}
	f0=f1;
	f1=f2;}
		

}

public static void main(String args[]){

	Scanner obj=new Scanner(System.in);

	System.out.println("Enter length of Fibonacci sequence");
	int len=obj.nextInt();
	
	fibonacci(1,2,len-2);
}

}