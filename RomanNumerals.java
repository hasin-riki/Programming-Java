//Hasin Zaman
//23010
import java.util.Scanner;
public class RomanNumerals{

public static String conversionroman(int value,String[] a,String[] b,String[] c,String[] d){

	String roman="";
	int temp=0;
	
	while(true){
	if(value>=1000){
	temp=value/1000;
	value=value%1000;
	roman=roman + a[temp-1];}
	else if(value>=100 && value<1000){
	temp=value/100;
	value=value%100;
	roman=roman + b[temp-1];}
	else if(value>=10 && value<100){
	temp=value/10;
	value=value%10;
	roman=roman + c[temp-1];}
	else{
	roman=roman + d[value-1];
	break;}}
	
	return roman;
}

public static void main(String[] args){

	Scanner obj=new Scanner(System.in);

	int input=0;
	while(true){
	System.out.println("Enter a value to be converted (Range 1-3999)");
	input=obj.nextInt();
	if(input>3999 || input<1){
	System.out.println("Input Value is out of Range!");}
	else{
	break;}}

	String[] thousandth={"M","MM","MMM"};
	String[] hundredth={"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
	String[] tens={"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	String[] units={"I","II","III","IV","V","VI","VII","VIII","IX"};
	
	System.out.println("Roman Numeral Representation: " + conversionroman(input,thousandth,hundredth,tens,units));
}

}