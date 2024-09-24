import java.util.Scanner;
public class GridXO
{	public static void main(String[] args)

{   	Scanner obj=new Scanner(System.in);
	System.out.println("Enter number of rows and columns of the grid");
	int n=obj.nextInt();
	
	int[] horizontal=new int[n];
	char[][] grid=new char[n][n];
	int random=0;
	int x=0;
	int maxhorizontal=0;

	for(int i=0; i<n; i++)
	{for(int j=0; j<n; j++)
	{random=(int)(Math.random()*3)+1;
	if(random==1)
	{grid[i][j]='X';}
	else if(random==2)
	{grid[i][j]='O';}}}
	

	for(int i=0; i<n; i++)
	{for(int j=0; j<n; j++)
	{System.out.print(grid[i][j]);}
	System.out.println();}

	for(int i=0; i<n; i++)
	{for(int j=0; j<n; j++)
	{if(grid[i][j]=='X')
	{x++;}
	else
	{x=0;}}
	horizontal[i]=x;}	

	for(int i=0;i<n;i++)
	{if(horizontal[i]>maxhorizontal)
	maxhorizontal=horizontal[i];}

	System.out.println(maxhorizontal);
}

}