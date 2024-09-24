//Hasin Zaman
//23010
import java.util.Scanner;
public class HangmanMethods{
	
	static int guesses=0;
	static int incorrectguesses=0;
	
public static void makeguess(String value,char c){
	
	boolean flag=false;
	guesses++;
	for(int i=0;i<value.length();i++){
	if(value.charAt(i)==c){
	flag=true;}}
	
	if(flag==false){
	incorrectguesses++;
	System.out.println("Incorrect Guess");}
}

public static String getdisguisedword(String actualword, String guessword, char c){
	
	char[] array=guessword.toCharArray();
	String temp="";

	for(int i=0;i<actualword.length();i++){
	if(actualword.charAt(i)==c){
	array[i]=c;}}

	for(int i=0;i<array.length;i++){
	temp=temp + array[i];}

	return temp;
}

public static String secretword(String value){
	
	return value;
}

public static int getguesscount(){
	
	return guesses;
}

public static boolean isfound(String guessword){
	
	boolean flag=true;
	for(int i=0;i<guessword.length();i++){
	if(guessword.charAt(i)=='?'){
	flag=false;}}

	return flag;
}

public static String hangman(String guessword){
	
	guesses=0;
	incorrectguesses=0;
	guessword=guessword.replaceAll("[a-z]","?");
	return guessword;
}

}
	