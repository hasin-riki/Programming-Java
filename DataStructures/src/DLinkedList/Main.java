package DLinkedList;
/**
 *
 * @author Hasin
 */
public class Main{

    public static void main(String[] args){

        DLinkedList<Integer> list=new DLinkedList<>();
        
        System.out.println("Is List Empty? : " + list.isEmpty());
        System.out.println("Length of List : " + list.length());
        
        list.insertInOrder(5);
        list.insertInOrder(3);
        list.insertInOrder(8);
        list.insertInOrder(4);
        list.insertInOrder(6);
        list.insertInOrder(9);
        list.insertInOrder(1);
        list.insertInOrder(4);
        list.insertInOrder(9);
        list.insertInOrder(2);
        
        System.out.println("Is List Empty? : " + list.isEmpty());
        System.out.println("Length of List : " + list.length());
        
        System.out.println(list);
        
        System.out.println("Find 4 : " + list.find(4));
        System.out.println("Find 7 : " + list.find(7));
        
        list.remove(7);
        list.remove(3);
        list.remove(8);
        list.remove(4);
        list.remove(6);
        list.remove(9);
        list.remove(1);
        
        System.out.println(list);
        
        DLinkedList<String> list2=new DLinkedList<>();

        list2.insertInOrder("AB");
        list2.insertInOrder("A");
        list2.insertInOrder("ABCDE");
        list2.insertInOrder("ABCD");
        list2.insertInOrder("ABC");
        
        list2.remove("A");
        list2.remove("ABCDE");
        list2.remove("ABC");
        
        list.addAll(list2);
        
        System.out.println(list);
        
        list.reverse();
       
        System.out.println(list);
        
        DLinkedListTail<Integer> list3=new DLinkedListTail<>();
        
        System.out.println("Is List Empty? : " + list3.isEmpty());
        System.out.println("Length of List : " + list3.length());
        
        list3.insertInOrder(5);
        list3.insertInOrder(3);
        list3.insertInOrder(8);
        list3.insertInOrder(4);
        list3.insertInOrder(6);
        list3.insertInOrder(9);
        list3.insertInOrder(1);
        list3.insertInOrder(4);
        list3.insertInOrder(9);
        list3.insertInOrder(2);
        
        System.out.println("Is List Empty? : " + list3.isEmpty());
        System.out.println("Length of List : " + list3.length());
        
        System.out.println(list3);
        
        System.out.println("Find 4 : " + list3.find(4));
        System.out.println("Find 7 : " + list3.find(7));
        
        list3.remove(7);
        list3.remove(3);
        list3.remove(8);
        list3.remove(4);
        list3.remove(6);
        list3.remove(9);
        list3.remove(1);
        
        System.out.println(list3);
        
        DLinkedListTail<String> list4=new DLinkedListTail<>();

        list4.insertInOrder("AB");
        list4.insertInOrder("A");
        list4.insertInOrder("ABCDE");
        list4.insertInOrder("ABCD");
        list4.insertInOrder("ABC");
        
        list4.remove("A");
        list4.remove("ABCDE");
        list4.remove("ABC");
        
        list3.addAll(list4);
        
        System.out.println(list3);
        
        list3.reverse();
       
        System.out.println(list3);

    }
}
