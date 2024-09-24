import java.util.Scanner;
public class Characteristic
{
  public static void main(String[] args)
  {   Scanner in=new Scanner(System.in);
      System.out.println("Enter a value of a valid quadratic equation.");
      double a=in.nextDouble();
      System.out.println("Enter b value of the same quadratic equation.");
      double b=in.nextDouble();
      System.out.println("Enter c value of the same quadratic equation.");
      double c=in.nextDouble();
      
      double discriminant=Math.pow(b,2)-4*a*c;
      int result=1;
      String statement="(indicates discriminant is 0 or less than 0)";
      
      if(discriminant>0)
      {result=0;
       statement="(indicates discriminant is greater than 0)";}
      
      
      System.out.println("Result according to discriminant value: " + result + " " + statement);
  }
}