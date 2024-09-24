import java.util.Scanner;
public class MethodPassword{

public static boolean passwordcheck(String a){

	boolean flag=true;
	int digits=0;
	String message="";
	
	char[] array=a.toCharArray();
	
	if(array.length<9){
	flag=false;}
	
	for(int i=0;i<array.length;i++){
	if(flag==false){
	break;}
	else if(Character.isLetter(array[i])==true){
	continue;}
	else if(Character.isDigit(array[i])==true){
	digits++;}
	else{
	flag=false;}}

	if(digits<2){
	flag=false;}
	
	return flag;
}

public static void main(String[] args){

	Scanner obj=new Scanner(System.in);
	
	System.out.println("Enter Password(At least 9 characters with at least 2 numbers)");
	String input=obj.nextLine();
	
	boolean result=passwordcheck(input);

	if(result==true){
	System.out.println("Password valid");}
	else{
	System.out.println("Password not valid");}
}

}