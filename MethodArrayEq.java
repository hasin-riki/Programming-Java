import java.util.Scanner;
public class MethodArrayEq{

public static boolean arrayeq(int[] a,int[] b){

	boolean flag=true;
	if(a.length!=b.length){
	flag=false;}
	else{
	for(int i=0;i<a.length;i++){
	if(a[i]!=b[i]){
	flag=false;}}}

	return flag;
}

public static void main(String args[]){

	Scanner obj=new Scanner(System.in);

	System.out.println("Enter size of array 1");
	int size1=obj.nextInt();
	int[] array1=new int[size1];
	System.out.println("Enter values into array 1");
	for(int i=0;i<size1;i++){
	array1[i]=obj.nextInt();}

	System.out.println("Enter size of array 2");
	int size2=obj.nextInt();
	int[] array2=new int[size2];
	System.out.println("Enter values into array 2");
	for(int i=0;i<size2;i++){
	array2[i]=obj.nextInt();}

	System.out.println(arrayeq(array1,array2));
}

}