
public class Testing{
	int a=0;	

/*public static void method(){

	int b=1;
}*/

	
public static void main(String[] args){

	Testing obj=new Testing();

	Testing2 obj2=new Testing2();
	
	//System.out.println(obj.a);

	//System.out.println(obj2.a);

	obj2.method();
	
	obj2.set(10);
	System.out.println(obj2.get());
}

}
	