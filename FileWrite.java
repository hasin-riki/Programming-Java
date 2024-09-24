import java.io.FileWriter;
import java.io.IOException;
public class FileWrite{
	
public static void main(String[] args){

	try{
	
	FileWriter obj=new FileWriter("D:\\Hasin\\Programs\\Files\\ITC Final.txt");

	for(int i=1;i<=70;i++){
	obj.write(i + ".\n");}
	obj.close();
	System.out.println("Successfully written on the file!");}
	catch(IOException e){
	System.out.println("An Error Occurred");}

}

}