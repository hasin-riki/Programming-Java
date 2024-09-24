import java.util.Scanner;
public class AllDigitOdds{	

public static boolean digitsodd(int num){

	boolean flag=true;

	if(num==0){}
	else if(num%2==0){
	flag=false;}
	else{
	return digitsodd(num/10);}
	
	return flag;

}


public static void main(String[] args){	

	Scanner obj=new Scanner(System.in);

	boolean flag=false;
	int input=0;
	while(flag==false){
	System.out.println("Enter a positive integer");
	input=obj.nextInt();
	if(input>=0){
	flag=true;}
	else{
	System.out.println("Wrong Input. Please enter a positive integer.");}}

	System.out.println(digitsodd(input));
	
}

}