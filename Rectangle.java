import java.util.Scanner;
public class Rectangle{	

	static double len=1;
	static double width=1;

public static void setlen(double n){
	
	if(n>=0.0 && n<=20.0){
	len=n;}
	else{
	System.out.println("Length out of range");}
	
}

public static void setwidth(double n){

	if(n>=0.0 && n<=20.0){
	width=n;}
	else{
	System.out.println("Width out of range");}
	
}

public static double getlen(){

	double temp=len;
	return temp;
	
}

public static double getwidth(){

	double temp=width;
	return temp;
	
}

public static double area(){

	double area=getlen()*getwidth();
	
	return area;
	
}

public static double perimeter(){

	double perimeter=2*(getlen()+getwidth());
	
	return perimeter;
	
}

public static void main(String[] args){

   	Scanner obj=new Scanner(System.in);

	System.out.println("Enter length of rectangle. Range(0.0-20.0)");
	double inputlen=obj.nextDouble();

	setlen(inputlen);

	System.out.println("Enter width of rectangle. Range(0.0-20.0)");
	double inputwidth=obj.nextDouble();

	setwidth(inputwidth);
	
	System.out.println("Area of rectangle length " + getlen() + " and width " + getwidth() + " is: " + area());

	System.out.println("Perimeter of rectangle length " + getlen() + " and width " + getwidth() + " is: " + perimeter());
	
}

}