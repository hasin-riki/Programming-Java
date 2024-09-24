import java.util.Scanner;
public class ArrayDifferentValues{	

public static void main(String[] args){	

	Scanner obj=new Scanner(System.in);

	System.out.println("Enter the size of the Array");
	int size=obj.nextInt();

	int[] array=new int[size];
	int[] temp=new int[size];
	
	
	for(int i=0;i<array.length;i++){
	array[i]=(int)(Math.random()*(size+1));
	System.out.print(array[i] + " ");}
	System.out.println();

	for(int i=0;i<array.length;i++){
	temp[i]=-1;}
	
	int count=0;
	int value=0;
	for(int i=0;i<array.length-1;i++){
	count=1;
	value=array[i];
	for(int j=i+1;j<array.length;j++){
	if(array[j]==value){
	count++;}}
	if(count>=1){
	temp[i]=value;}}

	for(int i=0;i<temp.length;i++){
	if(temp[i]!=-1){
	System.out.print(temp[i] + " ");}}
}

}