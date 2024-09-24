import java.util.Scanner;
public class SameDashes{	

public static void main(String[] args){	

	Scanner obj=new Scanner(System.in);

	System.out.println("Enter String 1");
	String input1=obj.nextLine();

	System.out.println("Enter String 2");
	String input2=obj.nextLine();
	
	int leastlen=0;
	if(input1.length()<input2.length()){
	leastlen=input1.length();}
	else{
	leastlen=input2.length();}
	
	int count=0;
	for(int i=0;i<input1.length();i++){
	if(input1.charAt(i)=='-'){
	count++;}}

	int count2=0;
	for(int i=0;i<input2.length();i++){
	if(input2.charAt(i)=='-'){
	count2++;}}
	
	int result=0;
	for(int i=0;i<leastlen;i++){
	if(input1.charAt(i)=='-' && input2.charAt(i)=='-'){
	result++;}}

	boolean flag=false;
	if(result==count && count==count2){
	flag=true;}

	System.out.println(flag);
}

}