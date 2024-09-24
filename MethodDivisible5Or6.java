import java.util.Scanner;
public class MethodDivisible5Or6{

public static void divisibility(){

	int count=0;

	for(int i=100;i<=200;i++){
	if(i%5==0 && i%6!=0){
	System.out.print(i + " ");
	count++;
	if(count%10==0){
	System.out.println();}}
	else if(i%6==0 && i%5!=0){
	System.out.print(i + " ");
	count++;
	if(count%10==0){
	System.out.println();}}}
}

public static void main(String[] args){

	System.out.println("Numbers from 100 to 200 divisible by either 5 or 6");
	divisibility();
}

}