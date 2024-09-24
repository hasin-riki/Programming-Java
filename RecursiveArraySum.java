import java.util.Scanner;
public class RecursiveArraySum{

public static int sum(int[] n,int len){

	if(len>-1){
	return n[len] + sum(n,len-1);}
	else{
	return 0;}

}

public static void main(String args[]){

	Scanner obj=new Scanner(System.in);

	System.out.println("Enter size of array");
	int size=obj.nextInt();
	int[] array=new int[size];
	System.out.println("Enter values into array");
	for(int i=0;i<size;i++){
	array[i]=obj.nextInt();}

	System.out.println("Sum of elements of array: " + sum(array,size-1));
}

}