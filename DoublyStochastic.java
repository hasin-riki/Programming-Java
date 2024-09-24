import java.util.Scanner;
public class DoublyStochastic
{	public static void main(String[] args)

{   	Scanner obj=new Scanner(System.in);
	
	System.out.println("Enter size of 2D Array");
	int n=obj.nextInt();
	double[][] array=new double[n][n];
	double[] sumrows=new double[n];
	double[] sumcolumns=new double[n];

	System.out.println("Enter values of the 2D Array(Values can be in Decimals)");
	for(int i=0;i<n;i++){
	for(int j=0;j<n;j++){	
	array[i][j]=obj.nextDouble();}}
	
	for(int i=0;i<n;i++){
	for(int j=0;j<n;j++){	
	sumrows[i]=sumrows[i]+array[i][j];}}
	
	for(int i=0;i<n;i++){
	for(int j=0;j<n;j++){	
	sumcolumns[i]=sumcolumns[i]+array[j][i];}}

	boolean flag=true;
	String message=" (Indicates Array is DoublyStochastic)";
	double e= 0.000000001;

	for(int i=0;i<n;i++){
	if(sumrows[i]>(1+e) || sumrows[i]<(1-e))
	{flag=false;
	message=" (Indicates Array is DoublyStochastic)";
	System.out.println(flag + message);
	System.exit(0);}}
	

	for(int i=0;i<n;i++){
	if(sumcolumns[i]>(1+e) || sumcolumns[i]<(1-e))
	{flag=false;
	message=" (Indicates Array is DoublyStochastic)";}}

	System.out.println(flag + message);
}

}