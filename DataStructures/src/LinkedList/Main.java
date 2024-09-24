package LinkedList;
/**
 *
 * @author Hasin
 */
public class Main{

    public static void main(String[] args){

        LinkedList list=new LinkedList();

        System.out.println("Is List Empty? : " + list.isEmpty());
        System.out.println("Length of List : " + list.length());
        list.insert(5);
        System.out.println("Is List Empty? : " + list.isEmpty());
        list.insert(8);
        list.insert(3);
        list.insert(2);
        list.insert(9);
        System.out.println("Length of List : " + list.length());

        list.display();

        System.out.println("Finding 5 : " + list.find(5));
        System.out.println("Finding 3 : " + list.find(3));
        System.out.println("Finding 9 : " + list.find(9));
        System.out.println("Finding 4 : " + list.find(4));

        list.clear();
        list.display();
        list.delete(5);

        list.insert(5);
        list.insert(8);
        list.insert(3);
        list.insert(2);
        list.insert(9);
        System.out.println(list);

        list.reverse();
        list.display();

        list.delete(1);
        list.delete(5);
        list.delete(3);
        list.delete(9);

        list.display();

        LinkedList list2=new LinkedList();
        list2.insert(15);
        list2.insert(18);
        list2.insert(13);
        list2.insert(12);
        list2.insert(19);

        list.addAll(list2);
        System.out.println(list);

        LinkedList sortedlist=new LinkedList();
        sortedlist.insert(2);
        sortedlist.insert(4);
        sortedlist.insert(7);
        sortedlist.insert(9);
        sortedlist.insert(15);

        sortedlist.insertInOrder(1);
        sortedlist.insertInOrder(5);
        sortedlist.insertInOrder(17);

        System.out.println(sortedlist);
    }
}
