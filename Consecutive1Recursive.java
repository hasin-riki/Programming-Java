import java.util.Scanner;
public class Consecutive1Recursive{

public static int consecutive(int[] n,int i,int count,int max){

	int max=0;
	if(i<0){
	return 0;}
	else if(n[i]==1){
	return consecutive(n,i-1,count+1,count);}
	else{
	if(count>max){
	return consecutive(n,i-1,count+1,max)}}

}

public static void main(String args[]){

	Scanner obj=new Scanner(System.in);

	System.out.println("Enter size of array");
	int size=obj.nextInt();
	int[] array=new int[size];
	
	for(int i=0;i<size;i++){
	array[i]=(int)(Math.random()*2);}

	System.out.println("Number of Consecutive 1s: " + consecutive(array,array.length-1,0,0));
}

}