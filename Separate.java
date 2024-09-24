public class Separate

{	public static void main(String[] args)

{	int num=Integer.parseInt(args[0]);

	int unit=num % 10, ten=(num/10) % 10, hund=(num/100) % 10, thou=num/1000;

	System.out.println("Separated numbers for provided four digit value: \n thousand place: " + thou + "\n hundred place: " +
				hund + "\n tens place: " + ten + "\n unit place: " + unit);
	
}

}