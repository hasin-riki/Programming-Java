
package Threads;

//@author hasin

import java.util.Scanner;
public class InputThread extends Thread{

    int input;
    public static void main(String[] args){
    
        InputThread input= new InputThread();
        input.start();
    }
    
    @Override
    public void run(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any integer");
        input=sc.nextInt();
        
        if(input%2==0){
            EvenThread square=new EvenThread(input);
            square.start();
        }
        else{
            OddThread cube=new OddThread(input);
            cube.start();
        }
    }

}

class EvenThread extends Thread{
    
    int num;

    public EvenThread(int num) {
        this.num = num;
    }
    
    public void run(){
        System.out.println("Square of number: " + (num*num));
    }
}


class OddThread extends Thread{
    
    int num;

    public OddThread(int num) {
        this.num = num;
    }
    
    public void run(){
        System.out.println("Cube of number: " + (num*num*num));
    }
}