import java.util.Scanner;
public class MatrixTranspose
{	public static void main(String[] args)

{   	Scanner obj=new Scanner(System.in);
	System.out.println("Enter number of rows for matrix");
	int rows=obj.nextInt();

	System.out.println("Enter number of columns for matrix");
	int columns=obj.nextInt();
	
	int[][] array=new int[rows][columns];
	int[][] transpose=new int[columns][rows];

	System.out.println("Enter values for Matrix");
	for(int i=0;i<rows;i++){
	for(int j=0;j<columns;j++){
	array[i][j]=obj.nextInt();}}

	for(int i=0;i<columns;i++){
	for(int j=0;j<rows;j++){
	transpose[i][j]=array[j][i];}}

	System.out.println("Matrix");
	for(int i=0;i<rows;i++){
	for(int j=0;j<columns;j++){
	System.out.print(array[i][j] + " ");}
	System.out.println();}
	System.out.println();

	System.out.println("Transpose");
	for(int i=0;i<columns;i++){
	for(int j=0;j<rows;j++){
	System.out.print(transpose[i][j] + " ");}
	System.out.println();}
}

}