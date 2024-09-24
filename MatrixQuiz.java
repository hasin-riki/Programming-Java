import java.io.FileWriter;
import java.util.Scanner;
public class MatrixQuiz{	

public static int[][] matrix(int a,int b){

	int[][] A=new int[columns][rows];

	return A;
}

public static void save(int[][] array){

	FileWriter obj=new FileWriter("C:\Users\hasin\Downloads\Test.txt");

	for(int i=0;i<array.length;i++){
	obj.write(array[i]);}
	obj.close();
}

public static int[][] read(int a,int b){

	Scanner obj=new Scanner(System.in);
	FileWriter obj2=new FileWriter("C:\Users\hasin\Downloads\Test.txt");
	int[][] A=new int[columns][rows];
	for(int i=0;i<columns;i++){
	for(int j=0;j<rows;j++){
	String input=obj.nextLine();
	obj2.write(obj.nextLine();}

	return A;	
}

public static void main(String[] args){

   	Scanner obj=new Scanner(System.in);
	System.out.println("Enter number of rows of two matrices.");
	int rows=obj.nextInt();

	System.out.println("Enter number of columns of two matrices.");
	int columns=obj.nextInt();
	
	int[][] matrix=matrix(columns,rows);
	matrixread();
	save();

	
}

}

