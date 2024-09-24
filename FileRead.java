import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileRead{
	
public static void main(String[] args){

	try{
	File obj=new File("D:\\Hasin\\Programs\\Files\\ITC Final.txt");
	Scanner obj2=new Scanner(obj);

	while(obj2.hasNextLine()){
	String line=obj2.nextLine();
	System.out.println(line);}}
	catch(FileNotFoundException e){
	System.out.println("Couldn't find the file named!");}

}

}