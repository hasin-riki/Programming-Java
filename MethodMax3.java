public class MethodMax3{

public static int max3(int num1,int num2,int num3){

	int max=num1;
	if(num2>max)
	{max=num2;}
	else if(num3>max)
	{max=num3;}

	return max;
}

public static double max3(double num1,double num2,double num3){

	double max=num1;
	if(num2>max)
	{max=num2;}
	else if(num3>max)
	{max=num3;}

	return max;
}

public static void main(String args[]){

	System.out.println("Max value : " + max3(4.2,3.3,6.9));
}

}