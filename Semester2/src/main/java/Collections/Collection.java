
package Collections;

//@author hasin

import java.util.*;
import java.util.ArrayList;
public class Collection {
    
    Collection(){
        System.out.println("1");
    }

    public static void main(String[] args){
    
        ArrayList al=new ArrayList();
        
        
        System.out.println(al.add(23));
        System.out.println(al.isEmpty());
        System.out.println(al.add(20.124));
        System.out.println(al.add("Abc"));
        System.out.println(al.remove(0));
        System.out.println(al.contains(2));
        System.out.println();
        
        Iterator it=al.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }

}
