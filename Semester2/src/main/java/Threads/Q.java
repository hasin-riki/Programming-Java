
package Threads;

//@author hasin

public class Q {

    int n;
    int buffersize=0;
    
    synchronized int get(){
        if(buffersize==0){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Got:" + n);
        buffersize--;
        notify();
        return n;
    }
    
    synchronized void put(int n){
        if(buffersize>=5){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
        this.n=n;
        buffersize++;
        System.out.println("Put:"+n);
        notify();
        
    }

}
