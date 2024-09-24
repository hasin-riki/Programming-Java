package GenericLinkedList;
/**
 *
 * @author Hasin
 */
public class Main{

    public static void main(String[] args){
        
        GenericLinkedList<String> genericlist=new GenericLinkedList<String>();

        System.out.println("Is Generic List Empty? : " + genericlist.isEmpty());
        System.out.println("Length of Generic List : " + genericlist.length());
        genericlist.insert("A1");
        System.out.println("Is List Empty? : " + genericlist.isEmpty());
        genericlist.insert("B23");
        genericlist.insert("C324");
        genericlist.insert("D11");
        genericlist.insert("EF3");
        System.out.println("Length of Generic List : " + genericlist.length());

        genericlist.display();

        System.out.println("Finding EF3 : " + genericlist.find("EF3"));
        System.out.println("Finding D12 : " + genericlist.find("D12"));
        System.out.println("Finding D11 : " + genericlist.find("D11"));
        System.out.println("Finding CDE : " + genericlist.find("CDE"));

        genericlist.clear();
        genericlist.display();
        genericlist.delete("D11");

        genericlist.insert("B23");
        genericlist.insert("C324");
        genericlist.insert("D11");
        genericlist.insert("EF3");
        genericlist.insert("FFS2");
        System.out.println(genericlist);

        genericlist.reverse();
        genericlist.display();

        genericlist.delete("B23");
        genericlist.delete("D11");
        genericlist.delete("FFS2");

        genericlist.display();

        GenericLinkedList<String> genericlist2=new GenericLinkedList<String>();
        genericlist2.insert("B23");
        genericlist2.insert("C324");
        genericlist2.insert("D11");
        genericlist2.insert("EF3");
        genericlist2.insert("FFS2");

        genericlist.addAll(genericlist2);
        System.out.println(genericlist);

        GenericLinkedList<String> genericsortedlist=new GenericLinkedList<String>();
        genericsortedlist.insert("A1");
        genericsortedlist.insert("A111");
        genericsortedlist.insert("A111111");
        genericsortedlist.insert("A111111111");
        genericsortedlist.insert("A1111111111111");

        genericsortedlist.insertInOrder("A");
        genericsortedlist.insertInOrder("A1111");
        genericsortedlist.insertInOrder("A111111111111111111111");

        System.out.println(genericsortedlist);
    }
}
