import java.util.Scanner;
public class MatrixMultiply
{	public static void main(String[] args)

{   	Scanner obj=new Scanner(System.in);
	System.out.println("Enter number of rows of matrix A.");
	int rows1=obj.nextInt();

	System.out.println("Enter number of columns of matrix A.");
	int columns1=obj.nextInt();

	System.out.println("Enter number of rows of matrix B.");
	int rows2=obj.nextInt();

	System.out.println("Enter number of columns of matrix B.");
	int columns2=obj.nextInt();
	
	int[][] multiply=new int[rows1][columns2];

	int[][] A=new int[rows1][columns1];
	int[][] B=new int[rows2][columns2];

	if(columns1!=rows2)
	{System.out.println("No. of columns of matrix A != No. of rows of matrix B. Multiplication not applicable");
	System.exit(0);}
	else
	{System.out.println("Enter values for Matrix A");
	for(int i=0;i<rows1;i++){
	for(int j=0;j<columns1;j++){
	A[i][j]=obj.nextInt();}}

	System.out.println("Enter values for Matrix B");
	for(int i=0;i<rows2;i++){
	for(int j=0;j<columns2;j++){
	B[i][j]=obj.nextInt();}}

	System.out.println("Matrix A");
	for(int i=0;i<rows1;i++){
	for(int j=0;j<columns1;j++){
	System.out.print(A[i][j] + " ");}
	System.out.println();}
	System.out.println();

	System.out.println("Matrix B");
	for(int i=0;i<rows2;i++){
	for(int j=0;j<columns2;j++){
	System.out.print(B[i][j] + " ");}
	System.out.println();}
	System.out.println();
	
	for(int i=0;i<rows1;i++){
	for(int j=0;j<columns2;j++){
	for(int x=0;x<columns1;x++){
	multiply[i][j]=multiply[i][j]+A[i][x]*B[x][j];}}}

	System.out.println("Product");
	for(int i=0;i<rows1;i++){
	for(int j=0;j<columns2;j++){
	System.out.print(multiply[i][j] + " ");}
	System.out.println();}}
}

}