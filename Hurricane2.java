import java.util.Scanner;
public class Hurricane2

{	public static void main(String[] args)
  
{   	Scanner obj=new Scanner(System.in);
      	System.out.println("Enter speed of wind in miles per hour.");
      	double wspeed=obj.nextInt();
	int intspeed=(int)wspeed;
	
	switch(intspeed)
	{case 30: case 31: case 32: case 33: case 34: case 35:
	System.out.println("Hurricane Level 1");
	break;

	case 36: case 37: case 38: case 39: case 40:
	System.out.println("Hurricane Level 2");
	break;

	case 41: case 42: case 43: case 44: case 45:
	System.out.println("Hurricane Level 3");
	break;

	case 46: case 47: case 48: case 49: case 50:
	System.out.println("Hurricane Level 4");
	break;

	default:
	System.out.println("Illegal Input");
	break;}
}

}
