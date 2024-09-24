package Queue;
/**
 *
 * @author Hasin
 */
public class Main{

    public static void main(String[] args){
        
        ArrayQueue<String> queue1=new ArrayQueue<String>(5);
        
        queue1.dequeue();
        queue1.enqueue("A");
        queue1.enqueue("B");
        queue1.enqueue("C");
        queue1.enqueue("D");
        queue1.enqueue("E");
        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();
        
        System.out.println(queue1);
        
        LinkedQueue<Integer> queue2=new LinkedQueue<Integer>();
        
        System.out.println("Is Linked Queue Empty? : " + queue2.isEmpty());
        queue2.dequeue();
        queue2.enqueue(1);
        queue2.enqueue(2);
        queue2.enqueue(3);
        queue2.enqueue(4);
        queue2.enqueue(5);
        queue2.dequeue();
        queue2.dequeue();
        
        System.out.println(queue2);
        
        ArrayPriorityQueue<Integer> queue3=new ArrayPriorityQueue<Integer>(5);
        
        queue3.enqueue(5);
        queue3.enqueue(3);
        queue3.enqueue(6);
        queue3.enqueue(8);
        queue3.enqueue(10);
        queue3.enqueue(4);
        System.out.println(queue3);
        queue3.dequeue();
        queue3.dequeue();
        queue3.dequeue();
        
        System.out.println(queue3);
        
        LinkedPriorityQueue<Integer> queue4=new LinkedPriorityQueue<Integer>();
        
        queue4.enqueue(21);
        queue4.enqueue(54);
        queue4.enqueue(62);
        queue4.enqueue(33);
        queue4.enqueue(11);
        queue4.enqueue(17);
        System.out.println(queue4);
        queue4.dequeue();
        queue4.dequeue();
        queue4.dequeue();
        
        System.out.println(queue4);

    }
}
