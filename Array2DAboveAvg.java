import java.util.Scanner;
public class Array2DAboveAvg{	

public static void main(String[] args){

Scanner obj=new Scanner(System.in);
	
	System.out.println("Enter No. of rows and columns of the 2D Array");
	int rows=obj.nextInt();
	int columns=obj.nextInt();
	
	int[][] array=new int[rows][columns];
	int sum=0;
	double avg=0;
	
	System.out.println("Enter Values into the array");
	for(int i=0;i<rows;i++){
	for(int j=0;j<columns;j++){
	array[i][j]=obj.nextInt();
	sum=sum + array[i][j];}}
	avg=(double)sum/(rows*columns);
	System.out.println("Average: " + avg);

	System.out.println("Array");
	for(int i=0;i<rows;i++){
	for(int j=0;j<columns;j++){
	System.out.print(array[i][j] + " ");}
	System.out.println();}
	System.out.println();
		
	int[][] newarray=new int[rows][columns];

	for(int i=0;i<rows;i++){
	for(int j=0;j<columns;j++){
	if(array[i][j]>avg)
	{newarray[i][j]=array[i][j];}}}

	for(int i=0;i<rows;i++){
	for(int j=0;j<columns;j++){
	System.out.print(newarray[i][j]+ " ");}
	System.out.println();}
}

}
	