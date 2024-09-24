import java.util.Scanner;
public class EqualOrNot
{
  
  public static void main(String[] args)
  {   Scanner in=new Scanner(System.in);
      System.out.println("Enter 3 random numbers");
	
      int a=in.nextInt();
      int b=in.nextInt();
      int c=in.nextInt();
      
      String result="False";
      if(a==b && b==c)
      {	result="True"; }

      System.out.println(result);

  }

}