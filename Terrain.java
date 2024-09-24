import java.util.Scanner;
public class Terrain 
{	public static void main(String[] args)

{   	Scanner obj=new Scanner(System.in);
	
	System.out.println("Enter size of 2D Array");
	int n=obj.nextInt();
	int[][] array=new int[n][n];

    	for(int i=0;i<n;i++){
      	for(int j=0;j<n;j++){
        array[i][j]=(int)(Math.random() * 51);}}

	System.out.println("Array");
	for(int i=0;i<n;i++){
	for(int j=0;j<n;j++){
	System.out.print(array[i][j]+" ");}
	System.out.println();}

	int peaks=0;
	System.out.print("\nPeaks: ");
    	for(int i=1;i<n-1;i++){
      	for(int j=1;j<n-1;j++){
        if((array[i][j]>array[i][j-1]) && (array[i][j]>array[i][j+1]) && (array[i][j]>array[i-1][j]) && (array[i][j]>array[i + 1][j]))
	{System.out.print(array[i][j] + " ");
        peaks++;}}}

	System.out.println("\nNumber of peaks: " + peaks);
}

}
	