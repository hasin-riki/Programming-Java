import java.util.Scanner;
public class LotteryMethod{

public static int lottery(int guess){

	int prize=0;
	int lottery=(int)((Math.random()*91)+10);
	int l1=(lottery/10)%10;
	int l2=lottery%10;
	
	int g1=(guess/10)%10;
	int g2=guess%10;

	if(lottery==guess){
	prize=10000;}
	else if(l1==g2 && l2==g1){
	prize=3000;}
	else if(l1==g1 || l1==g2 || l2==g1 || l2==g2){
	prize=1000;}

	System.out.println("Lottery: " + lottery);
	System.out.println("Guess: " + guess);

	return prize;
}

public static void main(String args[]){

	Scanner obj=new Scanner(System.in);

	System.out.println("Guess a two digit number");
	int input=obj.nextInt();

	if(input<10 || input>99){
	System.out.println("Error!! Your input number is out of range!");
	System.exit(0);}

	System.out.println("Prize Won: $" + lottery(input));
}

}