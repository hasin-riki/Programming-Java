import java.util.Scanner;
public class Append{	

public static int[] append(int[] a,int[] b){

	int[] newarray=new int[a.length+b.length];

	for(int i=0;i<a.length;i++){
	newarray[i]=a[i];}
	
	int count=0;
	for(int i=a.length;i<newarray.length;i++){
	newarray[i]=b[count];
	count++;}

	return newarray;

}

public static void main(String[] args){

   	Scanner obj=new Scanner(System.in);
	System.out.println("Enter size of Array A");
	int size1=obj.nextInt();
	
	int[] array1=new int[size1];

	System.out.println("Enter size of Array B");
	int size2=obj.nextInt();

	int[] array2=new int[size2];

	System.out.println("Array A");
	for(int i=0;i<array1.length;i++){
	array1[i]=(int)(Math.random()*9)+1;
	System.out.print(array1[i] + " ");}
	System.out.println();

	System.out.println("Array B");
	for(int i=0;i<array2.length;i++){
	array2[i]=(int)(Math.random()*9)+1;
	System.out.print(array2[i] + " ");}
	System.out.println();

	int[] display=new int[array1.length+array2.length];
	display=append(array1,array2);
	
	System.out.println(display.length);
	
	System.out.println("Appended Array");
	for(int i=0;i<display.length;i++){
	System.out.print(display[i] + " ");}
	
	
}

}