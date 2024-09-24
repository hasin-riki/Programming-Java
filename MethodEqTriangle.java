import java.util.Scanner;
public class MethodEqTriangle{

public static boolean eqtri(int x1,int y1,int x2,int y2,int x3,int y3){

	double len1=(double)Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));	
	double len2=(double)Math.sqrt(Math.pow((x3-x1),2)+ Math.pow((y3-y1),2));
	double len3=(double)Math.sqrt(Math.pow((x3-x2),2)+ Math.pow((y3-y2),2));

	boolean flag=false;
	if(len1==len2 && len1==len3 && len2==len3){
	flag=true;}

	return flag;
}

public static void main(String[] args){

	Scanner obj=new Scanner(System.in);
	
	System.out.println("Enter the 3 coordinates of vertices of triangle");
	int a=obj.nextInt();
	int b=obj.nextInt();
	int i=obj.nextInt();
	int j=obj.nextInt();
	int y=obj.nextInt();
	int z=obj.nextInt();

	boolean result=eqtri(a,b,i,j,y,z);

	if(result==true){
	System.out.println("Equilateral Triangle");}
	else{
	System.out.println("Not Equilateral Triangle");}
}

}