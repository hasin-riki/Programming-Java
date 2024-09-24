package Arrays;
/**
 *
 * @author Hasin
 * @param <T>
 */
public class GenericDynamicArray<T extends Comparable<T>>{
    T[] array;
    int currentIndex;
    
    public GenericDynamicArray(){
	array=(T[])new Comparable[10];
        currentIndex=-1;
    }
    
    public GenericDynamicArray(int size){
	array=(T[])new Comparable[size];
        currentIndex=-1;
    }
    
    //Q-2 part 1
    //Big O=O(n)
    public boolean isEmpty(){
        for(int i=0; i<array.length; i++){
            if(array[i]!=null){
                return false;
            }
        }
        return true;
    }
    
    //Q-2 part 2
    //Big O=O(1)
    public int length(){
        return currentIndex + 1;
    }
    
    //Q-2 part 3
    //Big O=O(n)
    public void print(){
        System.out.println("Array");
        for(int i=0; i<array.length; i++){
            if(array[i]!=null){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
    
    //Q-2 part 4
    //Big O=O(n)
    public void addAtFront(T value){
        if(currentIndex==array.length-1){
            T[] array2=(T[]) new Comparable[array.length * 2];
            for(int i = 0; i<array.length; i++){
                array2[i]=array[i];
            }
        array=array2;
        }
        if(currentIndex==-1){
            array[0]=value;
            currentIndex++;
        }
        else{
            for(int i=array.length-1; i>0; i--){
                array[i]=array[i-1];
            }
            array[0]=value;
            currentIndex++;
        }
    }
    
    //Q-2 part 5
    //Big O=O(1)
    public void addAtEnd(T value){
    if(currentIndex==array.length-1){
        T[] array2=(T[]) new Comparable[array.length * 2];
        for(int i = 0; i<array.length; i++){
            array2[i]=array[i];
        }
        array=array2;
    }
    array[currentIndex + 1]=value;
    currentIndex++;
    }
    
    //Q-2 part 6
    //Big O=O(n)
    public int find(T value){
        for(int i=0; i<array.length; i++){
            if(array[i]!=null){
                if(array[i].equals(value)){
                    return i;}
            }
        }
        return -1;
    }
    
    //Q-2 part 7
    //Big O=O(n)
    public void reverse(){ //reverses the list;
	T[] array2=(T[]) new Comparable[array.length];
        int j=array.length-1;
	for(int i=0; i<array2.length; i++){
		array2[i] = array[j];
        j--;}
	array =array2;
    }
    
    //Q-2 part 8
    //Big O=O(n)
    public void removeFirst(T value){
        int index= find(value);
        if(index!=-1){
            if(index==currentIndex){
                array[index]=null;
            }
        else{
            array[index]=null;   
            for(int i=index; i<=currentIndex; i++){
		array[i] = array[i+1];
        }}
	currentIndex--;
        }
    }
    
    //Q-2 part 9
    //Big O=O(n^2)
    public void removeAll(T value){
	int count =0;
	for(int i =0; i<array.length;i++){
            if(array[i]!=null){
                if(array[i].equals(value)){
                count++;}
            }
        }
	if(count==0){
            System.out.println("Value to be removed does not exist");
            return;
        } 
        
	for(int i=0; i<count; i++){
		this.removeFirst(value);
        }
        currentIndex -= count;
    }
        
    //Q-2 part 10
    //Big O=O(n)
    public void addInOrder(T value){
        if(currentIndex==array.length-1){
            T[] array2=(T[]) new Comparable[array.length * 2];
            for(int i = 0; i<array.length; i++){
                array2[i]=array[i];
            }
        array=array2;
        }
        if(currentIndex==-1){
            array[currentIndex + 1]=value;
            currentIndex++;
        }
        else{
            int index=-1;
            boolean flag=false;
            for(int i=0; i<=currentIndex; i++){
                if(array[i].compareTo(value)>0){
                    index=i;
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                for(int i=currentIndex + 1; i>index; i--){
                    array[i]=array[i-1];
                }
                array[index]=value;
                currentIndex++;
            }
            else{
                array[currentIndex + 1]=value;
                currentIndex++;
            }
        }
    }
    
    
    public static void main(String[] args){
		
	GenericDynamicArray<Character> obj=new GenericDynamicArray<Character>();
        System.out.println("Is Array Empty? : " + obj.isEmpty());
        obj.print();
        obj.addAtFront('c');
        obj.print();
        obj.addAtFront('d');
        obj.addAtFront('d');
        obj.addAtFront('e');
        obj.addAtFront('d');
        obj.addAtEnd('g');
        obj.print();
        obj.reverse();
        System.out.println("Index of 7: " + obj.find('c'));
        obj.print();
        obj.removeFirst('d');
        obj.print();
        obj.removeAll('d');
        obj.print();
        //obj.addInOrder(6);
        obj.print();
        
        GenericDynamicArray<Integer> obj2=new GenericDynamicArray<Integer>(5);
        obj2.addAtFront(8);
        obj2.addAtFront(5);
        obj2.addAtFront(3);
        obj2.addAtFront(1);
        obj2.addAtEnd(10);
        obj2.print();
        obj2.addInOrder(7);
        obj2.addInOrder(15);
        obj2.print();
        
        GenericDynamicArray<Student> obj3 = new GenericDynamicArray<>(10);
        obj3.addAtFront(new Student(1,"Ali",15));
        obj3.addAtFront(new Student(2,"Sara",14));
	obj3.addAtFront(new Student(3,"Akbar",12));
        obj3.addInOrder(new Student(4,"Raza",13));
        obj3.print();
        obj3.reverse();
        obj3.print();
    }
}
