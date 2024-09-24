import java.io.File;
import java.io.IOException;
public class FileCreate{
	
public static void main(String[] args){

	try{
	File obj=new File("D:\\Hasin\\Programs\\Files\\ITC Final.txt");

	if(obj.createNewFile()){
	System.out.println("File Created : " + obj.getName() + " in : " + obj.getAbsolutePath());}
	else{
	System.out.println("File Already Exists");}}
	catch(IOException e){
	System.out.println("An Error Occurred");}

}

}