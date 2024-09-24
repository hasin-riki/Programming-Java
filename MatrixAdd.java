import java.util.Scanner;
public class MatrixAdd
{	public static void main(String[] args)

{   	Scanner obj=new Scanner(System.in);
	System.out.println("Enter number of rows of two matrices.");
	int rows=obj.nextInt();

	System.out.println("Enter number of columns of two matrices.");
	int columns=obj.nextInt();
	
	int[][] add=new int[columns][rows];

	int[][] A=new int[columns][rows];
	int[][] B=new int[columns][rows];

	System.out.println("Enter values for Matrix A");
	for(int i=0;i<columns;i++){
	for(int j=0;j<rows;j++){
	A[i][j]=obj.nextInt();}}

	System.out.println("Enter values for Matrix B");
	for(int i=0;i<columns;i++){
	for(int j=0;j<rows;j++){
	B[i][j]=obj.nextInt();}}

	System.out.println("Matrix A");
	for(int i=0;i<columns;i++){
	for(int j=0;j<rows;j++){
	System.out.print(A[i][j] + " ");}
	System.out.println();}
	System.out.println();

	System.out.println("Matrix B");
	for(int i=0;i<columns;i++){
	for(int j=0;j<rows;j++){
	System.out.print(B[i][j] + " ");}
	System.out.println();}
	System.out.println();
	
	System.out.println("Sum");
	for(int i=0;i<columns;i++){
	for(int j=0;j<rows;j++){
	add[i][j]=A[i][j]+B[i][j];
	System.out.print(add[i][j] + " ");}
	System.out.println();}
}

}

