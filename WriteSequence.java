import java.util.Scanner;
public class WriteSequence{	

public static void sequence(int n){

	String output="";
	int mid=0;
	if(n%2==0){
	output="1 1";
	mid=(n-2)/2;}
	else{
	output="1";
	mid=(n-1)/2;}
	
	int revcount=mid+1;
	int count=2;
	
	String ascending="";
	String descending="";

	for(int i=1;i<=mid;i++){
	ascending= ascending + " " + count;
	descending= descending + revcount + " ";
	count++;
	revcount--;}

	output= descending + output + ascending;

	System.out.println(output);
	
}

public static void main(String[] args){

   	Scanner obj=new Scanner(System.in);

	System.out.println("Enter the length of the sequence");
	int len=obj.nextInt();

	sequence(len);
	
}

}