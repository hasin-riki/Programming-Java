import java.util.Scanner;
public class MethodAnagram{

public static boolean anagram(String a,String b){

	boolean flag=true;
	int sum1=0;
	int sum2=0;
	
	String a2=a.toLowerCase();
	String b2=b.toLowerCase();
	String a3=a2.replaceAll("\\s","");
	String b3=b2.replaceAll("\\s","");
	String a4=a3.replaceAll(",","");
	String b4=b3.replaceAll(",","");

	char[] array1=a4.toCharArray();
	char[] array2=b4.toCharArray();
	
	if(array1.length!=array2.length){
	flag=false;}
	else{
	for(int i=0;i<array1.length;i++){
	sum1=sum1+array1[i];
	sum2=sum2+array2[i];}
	if(sum1!=sum2){
	flag=false;}}

	return flag;
}

public static void main(String[] args){

	Scanner obj=new Scanner(System.in);
	
	System.out.println("Enter two Strings");
	String input1=obj.nextLine();
	String input2=obj.nextLine();
	
	boolean result=anagram(input1,input2);

	if(result==true){
	System.out.println("Strings are Anagram to each other");}
	else{
	System.out.println("Strings aren't Anagram to each other");}
}

}