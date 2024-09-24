import java.util.Scanner;
public class Grade

{	public static void main(String[] args)

{	Scanner obj=new Scanner(System.in);

	System.out.println("Enter marks of student");

	int marks=obj.nextInt();
	String grade="Error! Marks out of range!";

	if(marks>=90 && marks<=100)
	{grade="A";}
	else if(marks>=80 && marks<90)
	{grade="B";}
	else if(marks>=70 && marks<80)
	{grade="C";}
	else if(marks>=60 && marks<70)
	{grade="D";}
	else if(marks>=0 && marks<60)
	{grade="F";}

	System.out.println(grade);
}

}