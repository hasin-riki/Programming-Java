import java.util.Scanner;
public class GymnasticsScorer

{	public static void main(String[] args)
  
{   	Scanner in=new Scanner(System.in);
      	System.out.println("Enter the 6 scores by the judges");
      	
	double score1=in.nextDouble();
      	double score2=in.nextDouble();
	double score3=in.nextDouble();
	double score4=in.nextDouble();
      	double score5=in.nextDouble();
	double score6=in.nextDouble();

	double max=Math.max(Math.max(Math.max(Math.max(Math.max(score1,score2),score3),score4),score5),score6);
	double min=Math.min(Math.min(Math.min(Math.min(Math.min(score1,score2),score3),score4),score5),score6);

	double average=((score1+score2+score3+score4+score5+score6)-(max+min))/4;

	System.out.println(average);
}

}