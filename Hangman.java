//Hasin Zaman
//23010
import java.util.Scanner;
public class Hangman{
	
public static void main(String[] args){

	Scanner obj=new Scanner(System.in);
	
	System.out.println("Input a word to be guessed");
	String input=obj.next();
	String word=input.toLowerCase();
	String guess=word.replaceAll("[a-z]","?");
	System.out.println(guess);

	boolean result=false;
	while(result==false){
	System.out.println("Guess a character for the Secret Word!");
	char a=obj.next().charAt(0);

	HangmanMethods.makeguess(word,a);
	guess=HangmanMethods.getdisguisedword(word,guess,a);
	
	System.out.println(guess);
	
	int guessesmade=HangmanMethods.getguesscount();
	System.out.println("Guess count: " + guessesmade);

	result=HangmanMethods.isfound(guess);
	if(result==true){
	System.out.println("Congratulations! You have discovered the secret word!");
	
	String wordtobeguessed=HangmanMethods.secretword(input);
	System.out.println("Secret word: " + wordtobeguessed);
	
	System.out.println("Would you like to play again?(Press 1 to Play again. Press any other number to Quit.)");
	int option=obj.nextInt();
	
	if(option==1){
	result=false;
	guess=HangmanMethods.hangman(guess);
	System.out.println(guess);}
	else{
	System.out.println("Thank You! Visit us Again!");}}}

}

}
	