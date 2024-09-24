
package Threads;

//@author hasin

public class Producer implements Runnable{

    Q q;
    Producer(Q q){
        this.q=q;
        new Thread(this,"Producer").start();
    }

    public void run(){
        
        q.put((int) Thread.currentThread().getId());
    }
}
