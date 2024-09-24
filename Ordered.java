import java.util.Scanner;
public class Ordered

{	public static void main(String[] args)

{	Scanner obj=new Scanner(System.in);
	
	System.out.println("Enter three integers");
	
	int num1=obj.nextInt();
	int num2=obj.nextInt();
	int num3=obj.nextInt();
	
	boolean b=false;

	b=num1>=num2 && num2>=num3 || num1<=num2 && num2<=num3;

	System.out.println(b);
}

}
	