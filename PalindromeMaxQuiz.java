import java.util.Scanner;
public class PalindromeMaxQuiz{

public static boolean palindrome(int n){

	boolean flag=false;
	int revn=0;
	int remainder=0;
	int temp=n;
	
	while(temp!=0){
	remainder = temp % 10;
        revn = revn*10 + remainder;
        temp=temp/10;}
	
	if(n==revn){
	flag=true;}
	
	return flag;
}


public static void main(String args[]){

	Scanner obj=new Scanner(System.in);

	boolean result=false;
	int max=0;
	int product=0;
	
	for(int i=0;i<=999;i++){
	for(int j=0;j<=999;j++){
	product=i*j;
	result=palindrome(product);
	if(product>max && result==true){
	max=product;}}}
	
	System.out.println("Largest Palindrome of product of 3 digit number: " + max);
}

}