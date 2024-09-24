import java.util.Scanner;
public class MethodBalance{

public static boolean balance(int[] a){

	boolean flag=false;
	int sum1=0;
	int sum2=0;
	
	for(int i=0;i<a.length;i++){
	sum1=sum1+a[i];
	sum2=0;
	for(int j=i+1;j<a.length;j++){
	sum2=sum2+a[j];}
	System.out.println("Sum left : " + sum1 + " Sum right : " + " " + sum2);
	if(sum1==sum2){
	flag=true;
	break;}}
	
	return flag;
}

public static void main(String args[]){

	Scanner obj=new Scanner(System.in);

	System.out.println("Enter size of array");
	int size=obj.nextInt();
	int[] array=new int[size];

	for(int i=0;i<size;i++){
	array[i]=(int)((Math.random()*2)+1);}

	for(int i=0;i<size;i++){
	System.out.print(array[i] + " ");}
	System.out.println();

	System.out.println(balance(array));
}

}