
package Collections;

//@author hasin

import java.util.Iterator;
import java.util.ArrayList;
public class Testing {

    public static void main(String[] args){
    
        Collection[] collection=new Collection[5];
        collection[0]=new Collection();
        collection[1]=new Collection();
        ArrayList list=new ArrayList();
        
        System.out.println("is empty");
        System.out.println(list.isEmpty());
        for(int i=0;i<collection.length;i++){
            list.add(i);
        }
        System.out.println("Add");
        System.out.println(list.add(42));
        //System.out.println(list(4));
        list.remove(1);
        System.out.println("Contains");
        System.out.println(list.contains(collection));
        
        Iterator iterator=list.iterator();
        
        System.out.println("list");
        System.out.println(list);
        System.out.println("Iterator");
        //while(iterator.hasNext()){
            //System.out.println(iterator.next());
        //}
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        iterator.remove();
        collection[2]=new Collection();
        System.out.println(list);
        
        
        System.out.println(list.get(1));
    }

}
