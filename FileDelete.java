import java.io.File;
public class FileDelete{
	
public static void main(String[] args){

	try{
	File obj=new File("D:\\Hasin\\Programs\\Files\\File3.txt");

	if(obj.delete()){
	System.out.println("File Deleted: " + obj.getName() + " from: " + obj.getAbsolutePath());}
	else{
	System.out.println("File Already does not exist");}}
	catch(Exception e){
	System.out.println("An Error Occurred");}

}

}