public class Testing2{
	private int a=1;	

void method(){

	Testing2 obj=new Testing2();
	System.out.println(obj.a);
}
	
public int get(){
	
	return a;
}

public void set(int value){
	
	a=value;
}
	
public static void main(String[] args){

	
	Testing2 obj=new Testing2();
	Testing2 obj2=new Testing2();
		
	obj.a=5;
	
	System.out.println(obj.a);
	System.out.println(obj2.a);
	obj.method();
}

}
	