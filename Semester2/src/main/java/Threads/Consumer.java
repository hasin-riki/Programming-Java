
package Threads;

//@author hasin

public class Consumer implements Runnable{

    Q q;
    Consumer(Q q){
        this.q=q;
        new Thread(this,"Consumer").start();
    }

    public void run(){
        
        q.get();
    }
}
