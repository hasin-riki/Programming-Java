public class DataConversions

{	public static void main(String[] args)

{	byte a=42;

	float f1=2;//2 is integer and is being converted to double as 'f' is not assigned after value

	//float f2=2.0;
	//This statement is not being compiled because 2.0 is double without 'f' assigned and its not being converted to float

	float f3=a;//byte value '42' converted to double

	System.out.println(a + " " + f1 + " " + f3);

}

}