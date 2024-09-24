import java.util.Scanner;
public class Calculator
{	public static void main(String[] args)
  
{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter two numbers");
      	
	int num1=obj.nextInt();
	int num2=obj.nextInt();
	double result=0;
	
	System.out.println("Enter operator to be used");
	
	char operation=obj.next().charAt(0);
	
	switch(operation)
	{case '+':
	result=num1+num2;
	break;
	
	case '-':
	result=num1-num2;
	break;
	
	case '*':
	result=num1*num2;
	break;
	
	case '/':
	result=(double)num1/num2;
	break;
	
	case '%':
	result=num1%num2;
	break;}
	
	System.out.println(result);
}

}