
package Threads;

//@author hasin

public class ProdCons {

    public static void main(String[] args){
    
        System.out.println("Task 4");
        Q q=new Q();
        new Producer(q);
        new Producer(q);
        
        //new Consumer(q);
    }

}
